package com.xworkz.abtitudeapp.abtitude.etc;

public class AddTwoArray {

	public static void main(String[] args) {
		
		int num1 [][]= {{5,8,9},{12,15,18}};
		int num2 [][]= {{15,12,19},{2,52,28}};
		int sum [][]= {{0,0,0},{0,0,0}};
		
		for(int i=0; i<num1[i].length;i++) {
		for(int j=0; j<num1[i].length; j++) {
			System.out.println(i+" "+j);
		sum[i][j]=num1[i][j]+num2[i][j];
		}
		}
	for(int i=0; i<num1[i].length;i++) {
		for(int j=0; j<num1[i].length; j++) {
			System.out.println(sum[i][j]+" ");
		sum[i][j]=num1 [i][j]+num2 [i][j];
		}	
	}
	System.out.println();

}
}