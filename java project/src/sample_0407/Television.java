package sample_0407;

public class Television {

	int channel;
	int volume;
	boolean onOff;

	Television(){
		
		this(10,20,false); //�ؿ� ����3���ִ°� �־ �����մ°���
		
		//channel = 10; //�����ε�
		//volume = 10;
		//onOff = true;
	}
	
	public Television(int channel, int volume){
		//Ƽ�� �����ٰ� �����ϰ� ����°�
		this(channel,volume,true);
		
	}
	
	Television(int c, int v, boolean o){
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print(){

	System.out.println("ä����" + channel +"�̰� ������" + volume+"�Դϴ�");
	}
}
