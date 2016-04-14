package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Television myTV = new Television(7,10,true);
		myTV.print();
		Television yourTV = new Television(11,20,true);
		yourTV.print();
		
		Television testTV = new Television();
		testTV.print();
		
		Television testTV2 = new Television(30,20);
		testTV2.print();
		
		
/*		Television mytv = new Television();
		mytv.channel = 18;
		mytv.volume = 12;
		mytv.onOff = true;
		System.out.println("텔레비전의 채널은" + mytv.channel + "이고 볼륨은" + mytv.volume +"입니다.");
		
		mytv.print();
		
		Television testtv = new Television();
		testtv = mytv;
		testtv.channel = 536;
		System.out.println("텔레비전의 채널은" + mytv.channel + "이고 볼륨은" + mytv.volume +"입니다.");
		
		mytv.print();
		
		
		Television yourtv = new Television();
		yourtv.channel = 5;
		yourtv.volume = 17;
		yourtv.onOff = true;
		System.out.println("텔레비전의 채널은" + yourtv.channel + "이고 볼륨은" + yourtv.volume +"입니다.");
	
		yourtv.changeChannel(24);
		System.out.println("current channel :" + yourtv.changeChannel(24));
		
		yourtv.print();*/
	}

}
