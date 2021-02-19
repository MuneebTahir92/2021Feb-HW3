package staticAndNonStatic;

public class SesameStreetCharacters {

	public static void main(String[] args) {
		
		SesameStreet elmo = new SesameStreet();
		elmo.setShoeSize(3);
		System.out.println("Elmo's shoe size is: "+ elmo.shoeSize);
		
		SesameStreet bigbird = new SesameStreet();
		bigbird.setShoeSize(15);
		System.out.println("BigBird's shoe size is: "+bigbird.shoeSize);
		
		System.out.println("Elmo's shoe size is: "+ elmo.shoeSize);
		
		System.out.println(" ");
		
		SesameStreet cookiemonster = new SesameStreet();
		cookiemonster.setColor("blue");
		System.out.println("Cookie Monster is: "+ cookiemonster.color);
		
		SesameStreet kermitthefrog = new SesameStreet();
		kermitthefrog.setColor("green");
		System.out.println("Kermit the Frog is: "+ kermitthefrog.color);
		
		System.out.println("Cookie Monster is: "+ cookiemonster.color);
	}

}
