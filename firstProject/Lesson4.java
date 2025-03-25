/*
 * Author: Aleksandar Vasilić
 * Date: 2025-03-20
 * Advanced string methods and the 'char' variable type. Related to Lesson 17
 * in the Java BluePelican book. 
 ************************************************
*/

public class Lesson4 {
	public static void main(String args[]) {
		String sentence = "Out of the space - out of the mind.the end.";

		System.out.println(sentence.indexOf("the")); // 7. indexOf returns the
		// index of the first occurrence of the specified substring
		System.out.println(sentence.indexOf("THE")); // This shows indexOf is
		// case sensitive. If a substring is not found then we return -1
		System.out.println(sentence.indexOf("cosmos")); // -1 is returned
		// whenever it is not found. It does not occur only when the case is
		// different

		System.out.println(sentence.lastIndexOf("the")); // lastIndexOf returns
		// the index of the last occurrence of the specified substring

		System.out.println(sentence.indexOf("the", 15)); // 25. indexOf returns
		// the index of the first occurrence of the specified substring after
		// the specified index (inclusive)

		// System.out.println(sentence.indexOf(15, "the")); Polymorphism

		System.out.println(sentence.indexOf("pace")); // It does not nessecarily
		// match a word, rather a substring

		String temp = "the mind";

		System.out.println(sentence.indexOf(temp)); // We can pass a String
		// variable to the arguments of the method call

		String temp2 = "The mind";
		System.out.println(temp.compareTo(temp2)); // compareTo returns the
		// difference between the ASCII values of the first non-matching
		// characters. In ASCII first we have uppercase and then lowercase, in
		// alphabetical order.

		String temp3 = "abba";
		System.out.println(temp.compareTo(temp3)); // This returns 19 since
		// 't' has ASCII value 116 and 'a' has ASCII value 97
		System.out.println(temp.compareTo("war")); // This returns -3 since
		// 't' has ASCII value 116 and 'w' has ASCII value 119
		// So, if the value is positive the string we are comparing to goes
		// after our initial string, and if the value if is negative the string
		// we are comparing to goes before our initial string

		// The 'char' type

		// char symbol = "c"; " is only used for strings
		char symbol = 'c'; // ' is used for characters. Char can store only one
		// character. For that reason the following is invalid:
		// char car = 'ford';

		String anotherSymbol = "c"; // We can a string to store a single
		// character, but using char is better here
		System.out.println(anotherSymbol);

		System.out.println(sentence.indexOf(symbol)); // A char can also be an
		// argument for indexOf. In this case it will find the first occurence
		// of c

		System.out.println(sentence.indexOf(99)); // We can also pass ASCII
		// codes to indexOf. 99 is a lowercase c, so we will get the same result
		// as the previous line

		System.out.println(sentence.charAt(5)); // Returns the char value at
		// the specified index. 'f' in this case
		System.out.println(sentence.charAt(0)); // This will return the first
		// char in the string

		// System.out.println(sentence.charAt(100)); // This will return a
		// runtime error since the string does not have a character at index 100

		// Display the last character of the sentence that we have
		System.out.println(sentence.charAt(sentence.length() - 1));

		// Replace will replace all occurences of the given string with the new
		// string
		System.out.println(sentence.replace("the", "THE"));

		temp = "     \n blah blah          ";
		System.out.println("START" + temp + "END");
		System.out.println("START" + temp.trim() + "END"); // .trim() returns a
		// string whose value is this string, with all leading and trailing
		// space removed (whitespace)

		String name = " Mad";
		String surname = "    Max";
		
		System.out.println("Your initials are " + name.charAt(0) + "." + surname.charAt(0));
		// The above shows an example of an issue twhere we did not trim the
		// user's input. This is a fixed example:
		System.out.println("Your initials are " + name.trim().charAt(0) + "." + surname.trim().charAt(0));
	}
}
