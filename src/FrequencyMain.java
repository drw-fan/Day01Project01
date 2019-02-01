/******* Advent of Code Day 01 Project 01   *************/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FrequencyMain {
	public static void main(String[] args) {
		int inputInt;
		String stringInt;
		int finalFrequency=0;

		try {
			File myFile = new File("frequency.txt");
			Scanner inputFile = new Scanner(myFile);

			while (inputFile.hasNext()) {
				stringInt = inputFile.nextLine();
				inputInt = Integer.parseInt(stringInt);

				finalFrequency += inputInt;
			}

			inputFile.close();

		}

		catch (FileNotFoundException e) {
			System.out.println("File IO error!");
		}

		System.out.println(finalFrequency);

	}
}
