package org.example;

import java.util.GregorianCalendar;

public class TimeCalculator {

   private String s;
   private int secondsToBeAdded;
   private int secondsRemaining;


   public int[] calculateFinalTime (char[] chars, int minutes, int seconds) {
      for (int j = 0; j < s.length(); j++) {
         String o = "o";
         if (s.charAt(j) == o.charAt(0)) {
            secondsToBeAdded += 10;
            seconds = seconds + secondsToBeAdded;
         }
      }
      if (secondsToBeAdded % 60 == 0) {
         minutes = minutes + secondsToBeAdded;
      } else {
         int minutesFromSeconds = seconds / 60;
         minutes = minutes + minutesFromSeconds;
         secondsRemaining = seconds % 60;
         int[] time = new int[2];
         time[0] = minutes;
         time[1] = secondsRemaining;

      }
      return calculateFinalTime(chars, minutes, seconds);
   }
}