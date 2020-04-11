package org.example;

public class TimeCalculator {

   private int[] time = new int[2];
   private int secondsToBeAdded;
   private int secondsRemaining;


   public int[] calculateFinalTime (String[] strings, int minutes, int seconds) {
      for (int j = 0; j < strings.length; j++) {
         String o = "o";
         if (strings.toString().charAt(j) == o.charAt(0)) {
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
         time[0] = minutes;
         time[1] = secondsRemaining;
         return time;

      }
      return calculateFinalTime(strings, minutes, seconds);
   }
}