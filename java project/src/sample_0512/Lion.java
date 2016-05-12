package sample_0512;

public class Lion extends Animal {

	private int legs;
	
	public Lion(){
		super(100,"king"); //super안써도되긴한데 쓰는이유는....부모클래스를 직접적으로 호출가능?
		this.legs = 4;
	}
	
	void roar(){		System.out.println("roar()가 호출되었음");}
	void infor(){		System.out.println(weight+" ");}
}
