package sample_0324;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10]; //{10, 20, 30}; //0,1,2
		int[] array2 ={11,3,4,5,6,8};//값이 패턴이없다면 깡으로 넣어야함 값과 크기를 함께 정하는 방법임
		//System.out.println(array[1]);
		for(int i=0;i<10;i++){
			array[i] = (i+1)*10;
			System.out.println(i+" "+array[i]);
		}
			array2[0] = array2[2] + array2[4];
			System.out.println(array2[0]);
	}

}
