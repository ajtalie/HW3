/**
 * Assignment
 * File
 * MET CS
 * Name:
 * Email:
 * Description 
 */

package cs520.hw3.part1;

import javax.swing.JOptionPane;

public class StringTest {

	public static void main(String[] args) {
		// a. Ask the user, through a single input dialog, for the name, age, and their
		// city in the format Name,Age,City
		String input = null; // Exception handling for hitting cancel
		try {

			input = JOptionPane.showInputDialog("Enter your name, age, and city with a comma separating each element:");

			// b. Trim the user’s input, in case spaces were entered at the beginning or at
			// the end.
			input = input.trim();
			// c. Display the trimmed data to the console. Do the following operations using
			// this trimmed string.
			System.out.println(input);

			// d. Find the index of the first comma in the input using the indexOf method.
			int pos;
			pos = input.indexOf(',');

			// Using this value, extract name part of the input using the substring method.

			String name = input.substring(0, pos);
			int len = name.length();
			// e. Display the position of the first comma, the name, and the length of the
			// name to the console.

			System.out.println("First Comma Position: " + pos + ", Name: " + name + ", Length: " + len);

			// f. Find the index of the second comma in the input using the indexOf method.
			// Using this value, extract the age part of the input using the substring
			// method.

			int pos1;
			pos1 = input.indexOf(',', pos + 1);

			String age = input.substring(pos + 1, pos1);
			age = age.trim();
			int iAge = Integer.parseInt(age); // convert to integer

			// g. Display the position of the second comma, and the age to the console.
			// Convert the value to an integer. Display to the console their age in 10
			// years.

			System.out.println("Second Comma Position: " + pos1 + ", Age: " + iAge);
			System.out.println("You will be " + (iAge + 10) + " in 10 years from now!");
			// h. Extract the city using the substring method. Display to the console the
			// city and the length of the city to the console.

			String city = input.substring(pos1 + 1);
			city = city.trim();
			int cityLen = city.length();
			System.out.println("City: " + city + ", Length: " + cityLen);

			// i. Now, examine the code for all possible exceptions that could occur.
			// Handle all the different exceptions explicitly and print out the appropriate
			// exception message to the console.

		} catch (NullPointerException e) {
			System.out.println(e + "  You must enter the requested information");
		} catch (NumberFormatException e) {
			System.out.println(e + "  Please enter a valid age");
		} catch (ArithmeticException e) {
			System.out.println(e + "  Please enter a valid age");
		} catch (Exception e) {
			System.out.println(e);
		}

//				// Tokenize using the comma delimiters
//		        String delimiter = ",";
//		        StringTokenizer st = new StringTokenizer(input, delimiter);
//
////		        System.out.printf("Total Tokens = %d\n", st.countTokens());
//
//		// Iterate over the tokens
//		        while (st.hasMoreTokens())
//		        {
//		   
//		   String token = st.nextToken();
//		   
//
//		            System.out.printf("Token: %s\n", token);
//		                    System.out.printf("Remaining Tokens = %d\n", st.countTokens());
//		        }
	}

}
