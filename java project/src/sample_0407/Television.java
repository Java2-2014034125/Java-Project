package sample_0407;

public class Television {

	int channel;
	int volume;
	boolean onOff;

	void print(){

	System.out.println(channel +" " + volume + " " + onOff);
	}
	
	int changeChannel(int ch){
		channel = ch;
		return channel;
	}
}
