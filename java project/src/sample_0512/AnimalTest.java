package sample_0512;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion = new Lion();
		lion.eat();
		lion.sleep();
		lion.roar();
		lion.infor();
		
		Eagle eagle = new Eagle();
		eagle.eat();//오버라이딩
		
	}

}
