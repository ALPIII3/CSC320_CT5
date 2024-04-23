package ct5_CSC;

import java.util.ArrayList;
import java.util.Scanner;

public class CriticalThinking {

	public static void main(String[] args) {
		//
		ArrayList<Integer> dailyTemp = new ArrayList<>();
		ArrayList<String> weekDay = new ArrayList<>();
		
		weekDay.add("Sunday");
		weekDay.add("Monday");
		weekDay.add("Tuesday");
		weekDay.add("Wednesday");
		weekDay.add("Thursday");
		weekDay.add("Friday");
		weekDay.add("Saturday");
		
		dailyTemp.add(82);
		dailyTemp.add(75);
		dailyTemp.add(66);
		dailyTemp.add(72);
		dailyTemp.add(37);
		dailyTemp.add(36);
		dailyTemp.add(32);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("What daily temperature would you like to view?: ");
		String dayName = scn.nextLine();
		scn.close(); //important to close resource to prevent leak
		
		int indexOfDays = weekDay.indexOf(dayName); //put in the index of Days
		if(indexOfDays != -1) { //if the name cannot be found -1 is output
			//week day asked to be pulled by user
			System.out.print("The temperature for " + weekDay.get(indexOfDays) + " is " + dailyTemp.get(indexOfDays) + " degrees fahrenheit.");
		}else if(dayName.equals("week")) {
			//average calculated if user inputs 'week'
			float avgTemp = 0;
			for (Integer dailyTemps : dailyTemp) {
				avgTemp += dailyTemps;
			}
			avgTemp /= dailyTemp.size();
			System.out.print("This weeks temperatures were 82 on Sunday, 75 on Monday, 66 on Tuesday,"
					+ " 72 on Wednesday, then on Thursday it went down to 37, 36 on Friday, and Saturday ended the week at a low of 32. "
					+ "This makes the average temperature through the week " + avgTemp + " degrees fahrenheit.");
		}else {
			System.out.println("Wrong entry: " + dayName + ". Please enter lowercase 'week' or correct day of the week to view.");
		}
	}

}
