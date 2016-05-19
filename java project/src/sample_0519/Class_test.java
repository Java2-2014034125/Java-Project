package sample_0519;

public class Class_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_object[] pob = new P_object[3];
		pob[0] = new P_object();
		pob[1] = new c1_object();
		pob[2] = new c2_object();
		/*P_object po1 = new P_object();
		c1_object co1 = new c1_object();
		c2_object co2 = new c2_object();
		*/
		pr_all(pob[0]);
		pr_all(pob[1]);
		pr_all(pob[2]);
		
		pob[0].pr();
		pob[1].pr();
		pob[2].pr();
		
		/*for(P_object temp : pob){
			//temp = new P_object();
			pr_all(temp);
			change_all(temp,7,77);
			pr_all(temp);
		}*/
		//for(i=0; i<3; i++)*/
	}//p_object temp = co1;이라는 뜻?
	public static void pr_all(P_object temp){temp.pr();}
	public static void change_all(P_object temp, int x,int y){
		temp.change(x, y);
	}

}/*System.out.println(temp);*/
// 결론 : 다형성(확장하는 건)은 오버라이딩하면 해결된다 = 오버라이딩 사용하면 다형성 사용한거다
