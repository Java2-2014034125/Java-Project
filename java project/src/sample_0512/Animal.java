package sample_0512;

public class Animal {

	protected double weight;
	private String picture;
	
	public Animal(){ 
		weight=99; picture = "Animal";
		System.out.println("animal cont");
		}
	
	public Animal(double weight, String picture) {
		//super();
		this.weight = weight;
		this.picture = picture;
		System.out.println("Animal cont2");
	}

	void eat(){		System.out.println("eat()가 호출되었음");}
	void sleep(){		System.out.println("sleep()가 호출되었음");}
	
	//공통된거 부모클래스에 lion eagle각각에 weight쓸수잇도록 하는 것보다 부모에 넣으면 상속받을수잇음 protected해서 객체에선 사용
}
