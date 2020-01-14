package deloittecore;

public class ProductOfTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]={{1,2,3},{1,2,3},{1,2,3}};
		int y[][]={{1,2,3},{1,2,3},{1,2,3}};
		int z[][]=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				z[i][j]=0;
		for(int k=0;k<3;k++){
			z[i][j]+=x[i][k]*y[k][j];
		}
		System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
			

	}

}
