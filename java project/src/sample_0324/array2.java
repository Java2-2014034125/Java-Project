package sample_0324;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[2][4];
		
		for(int i=0,r=1;i<2;i++){
			for(int j=0;j<4;j++,r++){
				array[i][j]= r;
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
		
		int[] array2 = {1,2,3,5,10,6,7};
		for (int x : array2){//�ֱ� ���
			System.out.println("xxxxxxxxx"+x);
		}
		
	}

}
