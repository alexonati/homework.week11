package org.example;

import java.util.Comparator;

public class Athlete implements Comparator<Athlete> {
   private String numberNameAndDetails;
   private int[] time;

   public Athlete (String numberNameAndDetails, int[] time) {
      this.numberNameAndDetails = numberNameAndDetails;
      this.time = time;
   }

   public String getNumberAndName () {
      return numberNameAndDetails;
   }

   public void setNumberAndName (String numberAndName) {
      this.numberNameAndDetails = numberAndName;
   }

   public int getTime () {
      return time[1] & time[0];
   }

   public void setTime (int[] time) {
      this.time = time;
   }


   @Override
   public int compare (Athlete o1, Athlete o2) {
      if (o1.time[0] > o2.time[1]) {
         return 1;
      }
      return 0;
   }
}
