package sample_0414;

public class Car {
	private int man;
	private int tire;
	private String color;
	
	public void setMan(int man){
		this.man = man;
	}
	public int getMan(){
		System.out.print(man);
		return man;
	}
	
	public void allsetting(int tire, String color){
		this.tire = tire;
		this.color = color;
	}
	
	
	void pr(){
		System.out.println("man : "+ man + " tire : " + tire +" color : " + color);
	}
	

	public Car(){this(4,3,"red");}{man =4;tire=4;color="red";}
	
	public Car(int man, int tire, String color){
		this.man = man;
		this.tire = tire;
		this.color = color;
		
		
	}
}
