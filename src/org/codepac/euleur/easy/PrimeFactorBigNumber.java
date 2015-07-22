package org.codepac.euleur.easy;

public class PrimeFactorBigNumber {
	static Long mainNumber =new Long("600851475143");

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		
		System.out.println(isPrime(mainNumber/2));

	}

	public static boolean isPrime(long number) {
	
		System.out.println(number);
		Long newNumber = number;
		for (Long i = number; i > 0; i--) {
			if (!isDivisible(newNumber)) {
				newNumber--;
				continue;
			}
			if (divisibleByTen(newNumber)) {
				System.out.println(newNumber);
				
				return true;

			}
			   newNumber--;

		}
		return false;

	}

	public static boolean isDivisible(long divider) {
		System.out.println("Is divisble");
		System.out.println(mainNumber % divider);
		return mainNumber % divider == 0;
	}

	public static boolean divisibleByTen(long number) {
		System.out.println("Divisble by ten ");
		for (int j = 2; j <= 7919; j++) {
			if (number % j == 0)
				return false;

		}
		return true;
	}

}
