package sample_0512;

public class Eagle extends Animal{
	private int wings = 2;
	
	public Eagle(){		System.out.println("Eagle cont");}
	
	void fly(){		System.out.println("fly()가 호출되었음");}
	
	void eat(){		System.out.println("Eagle eat");}
	// 자식이기는 부모없다고 기능바꾸고 싶다면 자식클래스에 오버라이딩하면 된다
}
