package org.example;

public class TimeCalculator {

   private String s;
   private int secondsToBeAdded;


   public void calculateFinalTime (String s, int time) {
      for (int j = 0; j < s.length(); j++) {
         String o = "o";
         if (s.charAt(j) == o.charAt(0)) {
            secondsToBeAdded += 10;
            time = time + secondsToBeAdded;
         }
      }
      if (time % 60 == 0) {
         time = time + secondsToBeAdded;
      } else {
         int minutesFromSeconds = seconds / 60;
         minutes = minutes + minutesFromSeconds + seconds % 60;
      }
   }
}
