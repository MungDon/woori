package day0319;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpIpMultichatServer {
	HashMap clients;	// 클라이언트를 MAP으로 선언
								// 클라이언트 정보 ( key-대화명  , value-output ) HashMap을 반복하여 모든 클라이언트에게 대화메세지를 보낸다. 
	
	TcpIpMultichatServer() {
		clients = new HashMap();	//clients 해시맵 객체 생성
		Collections.synchronizedMap(clients);	// 객체가 들어올 때마다 동기화 하겠다
	}																// 동기화 - 안해도되지만 네트웍의경우 하는것이좋다. 
																	// 연결된 모든 클라이언트의 상태를 같은상태로 유지한다. 
																	// 모바일 카카오톡과 PC카카오톡의 전화번호 동기화라고 생각하면 된다. 
																	// 폰에 새로운번호가 저장된 경우, pc카카오톡에 즉시 반영되지 않고 2~5분 후 반영된다. 즉 2~5분 후 동기화된 것이다. 

	public void start() {	// 서버 시작 메서드
		ServerSocket serverSocket = null;	// serverSocket을 null 값으로 초기화
		Socket socket = null;	// socket 을 null 값으로 초기화

		try {
			serverSocket = new ServerSocket(7788); // 포트가 7788인 포트 생성
			System.out.println("서버가 시작되었습니다.");	

			while(true) {									// 서버가 실행 후 클라이언트가 연결할 때까지 현재라인에서 대기한다. (클라이언트가 접속하면, 접속한 클라이언트 객체를 socket에 대입한다.) 
				socket = serverSocket.accept(); //socket 에  클라이언트가 연결요청을하면 클라이언트와 통신할 소켓을 저장
				System.out.println("["+socket.getInetAddress() + ":"+socket.getPort()+"]"+"에서 접속하였습니다.");//사용자의 IP와 포트를 출력하여 보여줌
				ServerReceiver thread = new ServerReceiver(socket); //serverRreceiver 생성자에 클라이언트와 통신할 socket 을 전달
																									// 클라이언트를 매개변수로 보내어 쓰레드 객체를 생성한다. 
				thread.start();	// 쓰레드 실행		// 쓰레드 생성 및 실행														
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // start()

	void sendToAll(String msg) { //클라이언트가 보낸 메시지를 서버에서 받고 서버에서  클라이언트 모두에게 전달하는 메서드
		Iterator it = clients.keySet().iterator(); //클라이언트의 키값만 모아놓음
		
		while(it.hasNext()) {// 키값이 없을때 까지 만복
			try {
				DataOutputStream out = (DataOutputStream)clients.get(it.next());// next()로 key 를 꺼내고, clients 에 key 를 넣어 value 를 꺼낸다. 이때 value 는 Output 이다. 
				out.writeUTF(msg); //메시지 전송
			} catch(IOException e){}
		} // while
	} // sendToAll

	public static void main(String args[]) {
//		new TcpIpMultichatServer().start();

		TcpIpMultichatServer t = new TcpIpMultichatServer();	// 자신의 객체 생성
		t.start();		//서버시작
	} 

	class ServerReceiver extends Thread {
		Socket socket; //소켓
		DataInputStream in; // input
		DataOutputStream out; // output

		ServerReceiver(Socket socket) { 
			this.socket = socket;// start 메서드에서 매개변수로 전달받은 socket 을 멤버변수 socket 에 저장
			try {
				in = new DataInputStream(socket.getInputStream());// 클라이언트의 input, 연결된 클라이언트의 대화내용을 실시간으로 읽기 위한 객체이다. 
				out = new DataOutputStream(socket.getOutputStream());// 클라이언트의 output, 연결된 클라이언트에 대화메세지를 보내기 위함 이다. 
			} catch(IOException e) {}
		}

		public void run() {// 스레드가 시작되면 먼저 실행되는 run 메서드
			String name = ""; //초기화
			try {
				name = in.readUTF(); // 처음 접속한 클라이언트가 접속해서 보낸 클라이언트명을 읽는역할
				sendToAll("#"+name+"님이 들어오셨습니다."); //클라이언트가 접속시 이미 접속한 클라이언트 모두에게 보내는 출력메시지

				clients.put(name, out); //hashMap 으로 지정한 clients 에 클라이언트 이름과 클라이언트 메시지를 저장
				System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다."); // 클라이언트 총 인원수 출력
				while(in!=null) { // 클라이언트가 메시지를 보냈다면 반복
					sendToAll(in.readUTF()); // 클라이언트가 보낸 메시지를 모든 클라이언트에게 보냄 utf 인코딩으로
				}
			} catch(IOException e) {
				// ignore
			} finally {
				sendToAll("#"+name+"님이 나가셨습니다.");// 클라이언트가 나간것을 모든 클라이언트에게 전달
				clients.remove(name); // 나간 클라이언트 정보 제거
				System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"에서 접속을 종료하였습니다.");//접속종료한 클라이언트의 IP 와 포트를 출력
				System.out.println("현재 서버접속자 수는 "+ clients.size()+"입니다.");// 현재 접속자 수 출력
			} // try
		} // run
	} // ReceiverThread
} // class
