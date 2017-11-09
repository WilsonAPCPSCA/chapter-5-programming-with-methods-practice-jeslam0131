/*Sarah Lam
 * Jessica Lam
 */
import java.util.Scanner;
public class romanNumerals {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Please enter your number: ");
		int n=in.nextInt();
		String romanOnes=romanDigit(n%10, "I", "V", "X");
		n=n/10;
		String romanTens=romanDigit(n%10, "X", "L", "C");
		n=n/10;
		String romanHundreds=romanDigit(n%10, "C", "D", "M");
		System.out.print(romanHundreds+romanTens+romanOnes);
		
		
	}
	public static String romanDigit(int n, String one, String five, String ten){
		String first="";
		String second="";
		String third="";
		String fourth="";
		if (n==9) {
			 first= one+ten;
			n-=9;
		}
		if (n>=5){
			 second=five;
			n-=5;
		}
		if(n==4){
			 third=one+five;
			n-=4;
		}
		while (n>0){
			 fourth+=one;
			n--;
		}
		String value=first+second+third+fourth;
		return value;
}
	

}
