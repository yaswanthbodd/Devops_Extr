package com.devops;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45;
		int b=20;
		char c='%';
		int result=0;
		switch(c) {
		case '+' : result=a+b;
				System.out.println("Addition of "+a+" + "+b+" : "+result);
				break;
		case '-' : result=a-b;
				System.out.println("Addition of "+a+" - "+b+" : "+result);
				break;
		case '*' : result=a*b;
				System.out.println("Addition of "+a+" * "+b+" : "+result);
				break;
		case '%' : result=a%b;
				System.out.println("Addition of "+a+" % "+b+" : "+result);
				break;
		case '/' : result=a/b;
				System.out.println("Addition of "+a+" / "+b+" : "+result);
				break;
		}
	}

}
