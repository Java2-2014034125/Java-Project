package sample_0512_2;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Shape s1 = new Shape();
		//^shape r1 = new rectangle();
		//^shape c1 = new circle();
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();
		
		//s1.move(99,90);
		r1.move(1, 2);
		c1.move(123, 123);
		infor(r1);
		infor(c1);
		//^infor(r1);
		//^infor(c1); 
		//^r1.info();
	}

	static void infor(Rectangle r){ r.info();}
	static void infor(Circle c){c.info();}
	
	/*^shape r1= new rectangle();
	 * ^static void infor(shape ro){ro.info(); ro.iii();} 이거는 30개 짤 필요없이 한개로 충분
	 * ^static void inforr(rectangle r){r.info();} 자식이 30개라면... 메소드 30개 만들어야
	 * ^는 ★다형성★위해서 해본 것들. 확실히 이해하기!!!
	*/
}
