package Regular_Ex;

//Pan_Card Number.....

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanCard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pan_NO:");
		String str=sc.next();
		Pattern p=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
		Matcher m = p.matcher(str);
		if(m.find() && m.group().equals(str)) {
			System.out.println("Valid Pan_Card Number.....");
		}
		else {
			System.out.println("Not Valid Pan_Card Number.....");
		}
	}

}
