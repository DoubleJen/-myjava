package tw.dou;

import java.io.Serializable;

public class Student implements Serializable{//宣告此類別實做序列化
	private int ch;
	private transient int math;//一旦序列化帶有transient該修飾字將不會被序列化
	private int eng;
	private String name;//字串當年早序列化
	private Car car;//該台汽車("屬性")也須序列化

	public Student(String name, int ch, int math, int eng){
		this.name = name; this.ch = ch; this.math = math; this.eng = eng;
		car = new Car();
	}
	String getname(){return name;}
	double sum(){return ch+math+eng;}
	double avg(){return sum()/3;}
}

class Car implements Serializable{
	
}
