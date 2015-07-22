package org.codepac.euleur.easy;
import java.math.BigInteger;

public class Euleur002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Initializing Variables");
    long sum=0;
	long firsTerm=0;
	long  secondTerm=1;
	long finalTerm=0;
	BigInteger zero=new BigInteger("0");
	BigInteger two=new BigInteger("2");
	
	
	for(int i=0;;i++){
	System.out.println("Adding Fibonacci terms");
		finalTerm=firsTerm+secondTerm;
		if(finalTerm>4000000)
			break;
		
		if(finalTerm%2==0){
			sum=sum+finalTerm;
			System.out.println("Making sum when the new fibonanci is even");
				}
		firsTerm=secondTerm;
		secondTerm=finalTerm;
		finalTerm=0;
	}
	System.out.println("Printing sum");
	System.out.println(Long.toString(sum));
	System.out.println("Finished Printing");
	

	}
	
   
}
