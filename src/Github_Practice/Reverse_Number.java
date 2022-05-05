package Github_Practice;

public class Reverse_Number {

	public static void main(String[] args) {


	
			//Method-1: By Using Scanner Class i.e., User Define Method
			
		/*	Scanner sc = new Scanner(System.in);
			System.out.println("Enter Integer Value: ");
			
			int num = sc.nextInt();      //Assume num=121
			
			int rev=0;
			while(num!=0)
			{
				rev=rev*10+num%10;     //rev=0*10+121%10==>0+1==>1     rev=1*10+12%10==>10+2==>12     rev=12*10+1%10==>120+1==>121
				num=num/10;            //121/10==>12                   12/10==>1                      1/10==>0
			}
			System.out.println("Reverse Of A Number is: "+rev);  */
			
			
			//Method-2: By Using StringBuffer Class i.e., User Define Method
			
		/*	Scanner sc = new Scanner(System.in);
			System.out.println("Enter Integer Value: ");
			
			int num = sc.nextInt();      //Assume num=121
			
			StringBuffer sb = new StringBuffer(String.valueOf(num));
			StringBuffer rev = sb.reverse();
			
			System.out.println("Reverse Of A Number is: "+rev);  */
			
			
			//Method-3: By Using StringBuilder Class i.e., User Define Method
			
		/*	Scanner sc = new Scanner(System.in);
			System.out.println("Enter Integer Value: ");
			
			int num = sc.nextInt();      //Assume num=121
			
			StringBuilder sbl = new StringBuilder();
			sbl.append(num);
			StringBuilder rev = sbl.reverse();
			
			System.out.println("Reverse Of A Number is: "+rev);   */
			
			
			//Method-4: Within 2 Steps (without Using rem) we get directly
			
		/*	int num=121,rev=0,rem;
			
			while(num>0)
			{
				rev=rev*10+num%10;     //rev=0*10+121%10==>0+1==>1      rev=1*10+12%10==>10+2==>12    rev=12*10+1%10==>120+1==>121
				num=num/10;           //num=121/10==>12                 num=12/10==>1                 num=1/10==>0
			}
			System.out.println("Reverse Of A Number is: "+rev);   */ 
			
			
			//Method-5: Within 3 Steps (with Using rem) we get directly
			
			int num=121,rev=0,rem;
					
			while(num>0)
			{
			rem=num%10;          //rem=121%10==>1    rem=12%10==>2      rem=1%10==>1
			num=num/10;          //num=121/10==>12   num=12/10==>1      num=1/10==>0
			rev=rev*10+rem;      //rev=0*10+1==>1    rev=1*10+2==>12    rev=12*10+1==>121
			}
			
			System.out.println("Reverse Of A Number is: "+rev);
			
		}
	

}
