/* 🔥  Streak day 5  */
package Streak_Days;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Minimum_Time_Difference {
    public int findMinDifference(List<String> timePoints) {
        // List to store the time points converted to minutes
        List<Integer> minutes = new ArrayList<>();

        // Convert each time to minutes and add to the list
        for (String time : timePoints) {
            String[] t = time.split(":");
            int hours = Integer.parseInt(t[0]);
            int mins = Integer.parseInt(t[1]);
            int totalMinutes = hours * 60 + mins;
            minutes.add(totalMinutes);
        }

        // Sort the list of minutes
        Collections.sort(minutes);

        // Initialize the minimum difference as large as possible
        int minDifference = Integer.MAX_VALUE;

        // Compare consecutive time points
        for (int i = 1; i < minutes.size(); i++) {
            int diff = minutes.get(i) - minutes.get(i - 1);
            minDifference = Math.min(minDifference, diff);
        }

        // Check the difference between the first and last time point considering the circular nature
        int circularDiff = 1440 - minutes.get(minutes.size() - 1) + minutes.get(0);
        minDifference = Math.min(minDifference, circularDiff);

        return minDifference;
    }

    public static void main(String[] args) {
        Minimum_Time_Difference solution = new Minimum_Time_Difference();

        // Test case 1
        List<String> timePoints1 = new ArrayList<>();
        timePoints1.add("23:59");
        timePoints1.add("00:00");
        System.out.println("Minimum time difference: " + solution.findMinDifference(timePoints1)); // Output: 1

        // Test case 2
        List<String> timePoints2 = new ArrayList<>();
        timePoints2.add("00:00");
        timePoints2.add("23:59");
        timePoints2.add("00:00");
        System.out.println("Minimum time difference: " + solution.findMinDifference(timePoints2)); // Output: 0
    }
}

/*
 * 539. Minimum Time Difference
Medium
Given a list of 24-hour clock time points in "HH:MM" format, return the minimum minutes difference between any two time-points in the list.
 

Example 1:

Input: timePoints = ["23:59","00:00"]
Output: 1
Example 2:

Input: timePoints = ["00:00","23:59","00:00"]
Output: 0
 */