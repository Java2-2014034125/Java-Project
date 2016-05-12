package sample_0512_2;

abstract public class Shape {
	protected int x, y;
	
	public Shape(){ x=0; y=0;}
	
	public Shape(int _x, int _y){//c++에선 this대신 이렇게 구분 _이걸로
	x = _x; this.y = _y;
	}
	
	abstract public void move(int _x, int _y);//{ this.x+=_x; y+=_y;}
	//move라는게 rectangle과 circle의 연관성만 유지시키고 싶을때 굳이 기능을 가질필요없음 기능구현할 필요ㄴㄴ 그럴때 abstract를 앞에 적어준다 
	//^abstract public void iii();
}
