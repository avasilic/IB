/*
 * Author: Aleksandar Vasilić
 * Date: 2025-03-20
 * Advanced string methods. Related to Lesson 17 in the Java BluePelican book. 
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
	}
}
