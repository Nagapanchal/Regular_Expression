package Regular_Ex;

//Adhara_Number....
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdharNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Adhara_number:");
		String str=sc.next();
		Pattern p=Pattern.compile("[7-9][0-9]{11}");
		Matcher m = p.matcher(str);
		if(m.find()&& m.group().equals(str)) {
			System.out.println("Valid Adhara_number....");
		}
		else {
			System.out.println("Not Valid Adhara_number....");
		}
	}

}
