package org.javaPrograms;

public class PrimeNumber {

	public void isPrime(int num){

		boolean flag = false;
		for (int i=2; i<=num/2;i++)
		{
			if(num%i==0){
				flag=false;
				break;
			}
				else{
				flag=true;
			}

		}

		if(flag)
			System.out.println(num +" is Prime");
		else
			System.out.println(num +" is not Prime");

	}

	public static void main(String[] args) {

		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(10);


	}

}
