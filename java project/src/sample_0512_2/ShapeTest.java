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
	 * ^static void infor(shape ro){ro.info(); ro.iii();} �̰Ŵ� 30�� © �ʿ���� �Ѱ��� ���
	 * ^static void inforr(rectangle r){r.info();} �ڽ��� 30�����... �޼ҵ� 30�� ������
	 * ^�� �ڴ����������ؼ� �غ� �͵�. Ȯ���� �����ϱ�!!!
	*/
}
