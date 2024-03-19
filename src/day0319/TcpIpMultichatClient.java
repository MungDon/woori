package day0319;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpMultichatClient {
	public static void main(String args[]) {
		if(args.length!=1) {
			System.out.println("USAGE: java TcpIpMultichatClient 대화명");
			System.exit(0);// 시스템 종료
		}

		try {
			String serverIp = "192.168.0.11"; // 접속할 서버의 IP
            // 소켓을 생성하여 연결을 요청한다.
			Socket socket = new Socket(serverIp, 7788);  // 서버의 ip ,port 로 접속한다. 이때 서버측에서 serverSocket.accept(); 메서드가 동작하여 socket 에 대입된다. 
			System.out.println("서버에 연결되었습니다.");

			Thread sender = new Thread(new ClientSender(socket, args[0])); // 서버에 메시지 보내낼 스레드 생성
			Thread receiver = new Thread(new ClientReceiver(socket));	 		// 보낸 메시지를 받을 스레드 생성

			sender.start(); // sender 스레드 시작
			receiver.start(); // receiver 스레드 시작
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(Exception e) {}
	} // main

	static class ClientSender extends Thread {
		Socket socket;
		DataOutputStream out;
		String name;

		ClientSender(Socket socket, String name) {// sender 스레드에서 받은 매개변수로 필드 변수 초기화
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream()); //클라이언트가 서버에 메시지를 보내기위한 output
				this.name = name;
			} catch(Exception e) {}
		}

		public void run() { // 스레드 시작할때 가장먼저 동작하는 메서드
			Scanner scanner = new Scanner(System.in); // 입력받기
			try {
				if(out!=null) {
					out.writeUTF(name);// 즉시 대화명을 서버로 보낸다. 이때 서버측에서 읽어서 전체클라이언트에게 들어왔음을 알린다. 
				}	

				while(out!=null) {
					out.writeUTF("["+name+"]"+scanner.nextLine());	// 서버로 대화 메시지와 클라이언트 이름을 보냄	
				}
			} catch(IOException e) {}
		} // run()
	}

	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;

		ClientReceiver(Socket socket) {//receiver 에서 매개변수로 받은 값으로 필드 변수 초기화
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream()); // 서버가 보내오는 메시지를 읽기위한 input
			} catch(IOException e) {}
		}

		public void run() {// 스레드 시작할때 가장먼저 실행 되는 메서드
			while(in!=null) {	//서버가 보내오는 메시지가 null 아니라면, 즉 메시지가 있다면 반복
				try {
					System.out.println(in.readUTF()); // 보낸 메시지를 읽고 출력
				} catch(IOException e) {}
			}
		} // run
	}
} // class
