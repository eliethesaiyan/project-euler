package org.codepac.euleur.easy;

public class SumOfM3and5Bellow1000 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum=0;
	for(int i=0;i<1000;i++){
		 if(i%3==0){
			 sum+=i;
		     continue;
		 }
		 if(i%5==0){
			 sum+=i;
		     
		 }
		     
	}
	System.out.println(sum);

	}

}
