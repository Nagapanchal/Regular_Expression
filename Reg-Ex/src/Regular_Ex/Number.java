package Regular_Ex;

//Mobile_Number....
 
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Mobile_Number:");
		String str=sc.next();
		
 		Pattern p=Pattern.compile("(0|91)?[6789][0-9]{9}");
		Matcher m = p.matcher(str);

		if(m.find()&& m.group().equals(str)) {
			System.out.println("Valid Mobile_Number....");
		}
		else {
			System.out.println("Not Valid Mobile_Numbers....");
		}
		
		
	}

}
