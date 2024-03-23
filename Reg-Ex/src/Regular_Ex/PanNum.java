package Regular_Ex;

//Pin_number...
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pin_number:");
		String pin=sc.next();
		Pattern p=Pattern.compile("[5][0-9]{5}");
		Matcher m = p.matcher(pin);
		if(m.find()&&m.group().equals(pin)) {
			System.out.println("Valid Pin_number...");
		}else {
			System.out.println("Not Pin_number...");
		}
	}

}
