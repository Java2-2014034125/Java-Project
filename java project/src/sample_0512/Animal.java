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

	void eat(){		System.out.println("eat()�� ȣ��Ǿ���");}
	void sleep(){		System.out.println("sleep()�� ȣ��Ǿ���");}
	
	//����Ȱ� �θ�Ŭ������ lion eagle������ weight�����յ��� �ϴ� �ͺ��� �θ� ������ ��ӹ��������� protected�ؼ� ��ü���� ���
}
