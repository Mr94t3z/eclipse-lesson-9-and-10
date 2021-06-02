package tesString;
/**
 * @nim 1197050081
 * @kelas IF C
 * @author Muhamad Taopik
 */
public class StringOperations {
	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "Muhamad Taopik";
		String string3 = ""; // empety String or null
		
		// input string3
		string3 = "How are you ".concat(string2);
		System.out.println("string3 : "+ string3);

		// get length
		System.out.println("Length: "+ string1.length());
		
		// get substring beginning with character 0, up to, but not
		// including character 5
		System.out.println("Sub: "+ string3.substring(0,5));
		
		// uppercase
		System.out.println("Upper: "+ string3.toUpperCase());
		
		// add string4
		String string4 = "How are you "+ string2;
		System.out.println("string4 : "+ string4);
		System.out.println(string2.indexOf('a'));
		System.out.println(string2.charAt(2));
		
		// compareTo
		String st1 = "abc";
		String st2 = "cde";
		System.out.println(st1.compareTo(st2));
		
		// Equals
		String st3 = "abc";
		String st4 = "ABC";
		System.out.println(st3.equals(st4));
	}
}
