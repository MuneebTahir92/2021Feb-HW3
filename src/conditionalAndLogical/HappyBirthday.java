package conditionalAndLogical;

import java.util.Scanner;

public class HappyBirthday {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Is it my birthday today?");
		
		boolean Feb19 = in.nextBoolean();		
		if(Feb19) {
			System.out.println("I will celebrate today");
		}else {
			System.out.println("I will not celebrate today");
		}
	}

}
