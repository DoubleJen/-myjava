package tw.dou;
//幾何圖形
public class Double31 {

	public static void main(String[] args) {
		Shape s1 = new TriShape(3, 4, 5, 4);
		Shape s2 = new SquShape(4);
		m1(s1);
		//s1.isTriShape();//因宣告的Shape無isTriShape
	}
	
	static void m1(Shape s){
		System.out.println(s.calArea());
	}

}

interface Shape{
	double calLength();//幾何圖形有周長
	double calArea();//幾何圖形有面積
}

class TriShape implements Shape{//三角形
	private double s1, s2, s3, h1;//以s1為底邊的高h1
	TriShape(double s1, double s2, double s3, double h1){
			this.s1=s1; this.s2=s2; this.s3=s3; this.h1=h1;
	}
	public double calLength(){return s1+s2+s3;}//周長
	public double calArea(){return s1*h1/2;}//面積
	public boolean isTriShape(){return true;}
}

class SquShape implements Shape{//正方形
	private double s;
	SquShape(double s){
			this.s=s;
	}
	public double calLength(){return s*4;}//周長
	public double calArea(){return s*s;}//面積
}