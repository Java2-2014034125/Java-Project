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
		System.out.println("�ڷ������� ä����" + mytv.channel + "�̰� ������" + mytv.volume +"�Դϴ�.");
		
		mytv.print();
		
		Television testtv = new Television();
		testtv = mytv;
		testtv.channel = 536;
		System.out.println("�ڷ������� ä����" + mytv.channel + "�̰� ������" + mytv.volume +"�Դϴ�.");
		
		mytv.print();
		
		
		Television yourtv = new Television();
		yourtv.channel = 5;
		yourtv.volume = 17;
		yourtv.onOff = true;
		System.out.println("�ڷ������� ä����" + yourtv.channel + "�̰� ������" + yourtv.volume +"�Դϴ�.");
	
		yourtv.changeChannel(24);
		System.out.println("current channel :" + yourtv.changeChannel(24));
		
		yourtv.print();*/
	}

}
