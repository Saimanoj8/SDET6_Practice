package Github_Practice;

public class Swaping_Numbers {

	public static void main(String[] args) 
	{
	 //Method-1: By Using Extra Variable
	 /*	int a=10,b=20,c;
		System.out.println("Before Swapping Numbers are : "+a+" "+b);
		c=b;     //c=20
		b=a;     //b=10
		a=c;     //a=20
		System.out.println("After Swapping Numbers are : "+a+" "+b); */
			
			
		//Method-2: Without Using Extra Variable (OR) By Using + And - Operators
	 /*	int a=10,b=20;
		System.out.println("Before Swapping Numbers are : "+a+" "+b);
	 	a=a+b;     //a=10+20==>30
		b=a-b;     //b=30-20==>10
		a=a-b;     //a=30-10==>20
		System.out.println("After Swapping Numbers are : "+a+" "+b); */
		
		
		//Method-3: By Using * and / Operators
	 /*	int a=10,b=20;
		System.out.println("Before Swapping Numbers are : "+a+" "+b);
		a=a*b;     //a=10*20==>200
		b=a/b;     //b=200/20==>10
		a=a/b;     //a=200/10==>20
		System.out.println("After Swapping Numbers are : "+a+" "+b); */
			
			
		//Method-4: By Using XOR (Bitwise Operator)(Binary Form) (i.e.,^)
	 /*	int a=10,b=20;
		System.out.println("Before Swapping Numbers are : "+a+" "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping Numbers are : "+a+" "+b); */
			
			
		//Method-5: Within Single Step Only
		int a=10,b=20;
		System.out.println("Before Swapping Numbers are : "+a+" "+b);
		b=a+b-(a=b);     //a=b==>a=20,  b=10+20-(20)==>30-20=10
		System.out.println("After Swapping Numbers are : "+a+" "+b);
		
		}
}

