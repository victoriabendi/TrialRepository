import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
 public class Winnie
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans;

		if(n==1){

			System.out.println("0");

		}else if(n==2){

			 ans =Math.min(a,b);
			System.out.println(ans);


		}else{

			ans =Math.min(a,b);
			int ans2 = ans+Math.min(ans,c)*(n-2);
			System.out.println(ans2);

		}

	}
}