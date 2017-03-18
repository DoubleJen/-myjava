package tw.dou;

public class Scooterdo {

	public static void main(String[] args) {
		Bike b1 =  new Bike();
		System.out.println("-------------");
		Scooter s1 = new Scooter();
			//摩托車無寫建構式時, 因摩托車認父(繼承)BIKE, 所以拿BIKE"唯一無參數"的建構式為摩托車唯一建構值
			//無講繼承誰時, 預設為"extend Object"(如BIKE)
		s1.upSpeed();
		s1.upSpeed();
		s1.downSpeed();;//Fr 父
		System.out.println(s1.getSpeed());

	}

}
