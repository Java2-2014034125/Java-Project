package sample_0512_2;

abstract public class Shape {
	protected int x, y;
	
	public Shape(){ x=0; y=0;}
	
	public Shape(int _x, int _y){//c++���� this��� �̷��� ���� _�̰ɷ�
	x = _x; this.y = _y;
	}
	
	abstract public void move(int _x, int _y);//{ this.x+=_x; y+=_y;}
	//move��°� rectangle�� circle�� �������� ������Ű�� ������ ���� ����� �����ʿ���� ��ɱ����� �ʿ䤤�� �׷��� abstract�� �տ� �����ش� 
	//^abstract public void iii();
}
