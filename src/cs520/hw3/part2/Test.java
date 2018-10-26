/**
 * Assignment: Week 3 
 * File: cs520.hw3.part2
 * MET CS520 
 * Name: Andrew Taliercio
 * Email: andy.taliercio@hotmail.com / ajtalie@bu.edu
 * Description: This package implements the BufferedReader, StringTokenizer, and toString to demonstrate the reading of a file into the stack,
 * getting the information from the stack one element at a time, and producing readable information. It also handles exceptions for file
 * read errors, errors in the data type and produces a file with that information.
 *  */

package cs520.hw3.part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Test {

	// Main program begins here to read the file into the buffer and process the information into requested output
			public static void main (String[] args)
			{
				String inputFileName = "data.txt";
			FileReader fileReader = null;
			
			//Create the FileReader object
			try {
				fileReader = new FileReader(inputFileName);
				}  catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			BufferedReader reader = new BufferedReader (fileReader);
			String input;
			// Read one line at a time until end of file
			try {
				input = reader.readLine();
				while (input != null)
				{
					processInputData(input);
					input = reader.readLine();
				}
			}  catch (IOException e) {
				e.printStackTrace();
			}
			// Close the input
			try {
				fileReader.close();
			}  catch (IOException e)  {
				e.printStackTrace();
			}
			}
			// This constructor reads the data from the buffer one element at a time
			private static void processInputData(String data) throws FileNotFoundException
			{
				StringTokenizer st = new StringTokenizer(data, ",");
				String senatorName = st.nextToken(); 
				String yearsInOffice = st.nextToken(); 
				String senatorParty = st.nextToken();
				String senatorState = st.nextToken();
				
				// This takes the elements and prints the information from to the screen in the format specified by the toString constructor
				try {
						Senator currentSenator = 
						new Senator(senatorName, Integer.parseInt(yearsInOffice),senatorParty, senatorState);
							System.out.println(currentSenator);
					
				// catch for an error in the data file for the years in office not being an integer
				} catch (NumberFormatException e) {
					int yearsError = -99;
					System.out.println(e + "  Error found in data file for the entry - Senator " + senatorName + " (" + senatorParty + ") from "
							+ senatorState + " has been the senator for " + yearsError + " years.");
					// Creates a file to write the data about the error
						
					String outputFileName = "fixdata.txt";
					PrintWriter writer = null;
					writer = new PrintWriter(outputFileName);
					String fixData;
					fixData = senatorName + ",-99," + senatorParty + "," + senatorState;
					writer.println(fixData);
					writer.close();
								
			}
			
			}

//		a. Use the BufferedReader class to read the data.txt file. The
//		contents of the file are shown below. Create the data.txt file in
//		HW3_lastName folder.
//		b. Read the contents of the text file one line at a time using a loop.
//		The program should work for any number of input lines. Invoke the
//		processInputData method for each line read.

//		c. Write a private method processInputData which processes its string
//		input argument as follows.
//		1. Tokenize the string argument using the StringTokenizer class
//		using the comma as the delimiter.
//		2. Extract the name token. Create a Senator object and assign
//		to the variable currentSenator.
//		3. Read the rest of the tokens one token at a time. Use the
//		corresponding set method on the currentSenator object to
//		set the instance value.
//		4. If the yearsInOffice is not a valid number, i.e., throws an
//		exception when parsed, set the value as -99 in the exception
//		handling part.
//		5. Display the string representation of the currentSenator object
//		to the console.// TODO Auto-generated method stub

	}

