package Regular_Ex;

//Mail_Id....

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Mail_Id:");
		String str=sc.next();
		Pattern p=Pattern.compile("[a-zA-z0-9][a-zA-z0-9_.]*@[a-zA-Z0-9]*([.][a-z]+)+");
		Matcher m = p.matcher(str);
		if(m.find() && m.group().equals(str)) {
			System.out.println("Valid Mail_Id....");
		}
		else {
			System.out.println("Not Valid Mail_Id....");
		}

	}

}
