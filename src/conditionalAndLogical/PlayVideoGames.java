package conditionalAndLogical;

import java.util.Scanner;

public class PlayVideoGames {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("True or False? Is somebody watching TV?");
		
		boolean tvIsAvailable = in.hasNextBoolean();		
		if(!tvIsAvailable) {
			System.out.println("I will play video games today");
		}else {
			System.out.println("I will study today");
		}

	}

}
