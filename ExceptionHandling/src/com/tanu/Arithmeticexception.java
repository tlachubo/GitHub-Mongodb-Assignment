package com.tanu;

public class Arithmeticexception {
		    public static void main(String[] args){
	        int num1 = 6,num2 = 0, results;
	        try
	        {
	            results = num1/num2;
	            System.out.println("the result is "+ results);
	        }
	        catch (ArithmeticException e)
	        {
	            System.out.println("can't be divided by zero"+e);
	        }
	    }
	}


