package sample_0407;

public class Television {

	int channel;
	int volume;
	boolean onOff;

	Television(){
		
		this(10,20,false); //밑에 인자3개있는게 있어서 쓸수잇는거임
		
		//channel = 10; //오버로딩
		//volume = 10;
		//onOff = true;
	}
	
	public Television(int channel, int volume){
		//티비가 켜졌다고 가정하고 만드는거
		this(channel,volume,true);
		
	}
	
	Television(int c, int v, boolean o){
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print(){

	System.out.println("채널은" + channel +"이고 볼륨은" + volume+"입니다");
	}
}
