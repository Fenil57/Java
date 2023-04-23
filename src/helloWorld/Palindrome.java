package helloWorld;

public class Palindrome {

	public static void main(String[] args) {
		String x = "level";
		String reversedString = "";
		
		for(int i = x.length()-1; i>= 0; i--) {
			reversedString +=x.charAt(i);
		}
		
		if(x.equals(reversedString)) {
			System.out.println("It's a Palindrome word");
		} else {
			System.out.println("Not a Palindrome word");
		}
		
		 /*    x == reversedString: here == compares references of objects,
		  *    not their contents.
		  *   In Java, String objects are compared using the equals() method, not ==.
		  */
//		if(x == reversedString) {
//			System.out.println("It's a Palindrome word");
//		} else {
//			System.out.println("Not a Palindrome word");
//		}

	}

}
