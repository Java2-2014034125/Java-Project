package sample_0512;

public class Lion extends Animal {

	private int legs;
	
	public Lion(){
		super(100,"king"); //super�Ƚᵵ�Ǳ��ѵ� ����������....�θ�Ŭ������ ���������� ȣ�Ⱑ��?
		this.legs = 4;
	}
	
	void roar(){		System.out.println("roar()�� ȣ��Ǿ���");}
	void infor(){		System.out.println(weight+" ");}
}
