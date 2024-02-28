package day0227;

public class Bottle {
	String texture;
	String color;
	String text;
	int dia;
	int hight;
	
	Bottle(String texture){
		this.texture = texture;
	}
//	Bottle(String texture,String color){
//		this.texture = texture;
//		this.color = color;
//	}
//	Bottle(String color,String text){
//		this.text = text;
//		this.color = color;
//	}
	Bottle(String texture,int dia, int hight){
		this.texture = texture;
		this.dia = dia;
		this.hight = hight;
	}
	Bottle(String texture,int dia, int hight,String color,String text){
		this.texture = texture;
		this.dia = dia;
		this.hight = hight;
		this.color = color;
		this.text = text;
	}
	
	public void info() {
<<<<<<< HEAD
		System.out.println(texture+"지름 "+dia+"높이 "+hight+"색상"+color+"문구 "+text);
=======
		System.out.println("재질 "+texture+"지름 "+dia+"높이 "+hight+"색상"+color+"문구 "+text);
>>>>>>> 7f959cc74b2425a783f7217f40a7dd24416cb0f6
	}
}
