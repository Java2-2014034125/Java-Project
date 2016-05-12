package sample_0512_2;

public class Rectangle extends Shape {
	private int x1, y1;
	
	public Rectangle(){x1=5; y1=4;}
	
	public void move(int _x, int _y){
		x = _x + x1; y=_y + y1;
	}
	
	public void info(){System.out.println(" R x:"+x+" y:"+y);}
	//^public void iii(){System.out.println("r");}
}
