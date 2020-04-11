package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

public class ParseStringForTime {


   public int[] intparseStringForTime (ArrayList strings) {

      for (int i = 0; i < strings.size(); i++) {

         int indexCommaBeforeTime = StringUtils.ordinalIndexOf(strings.toString(), ",", 3);
         int indexCommaAfterTime = StringUtils.ordinalIndexOf(strings.toString(), ",", 4);

         String[] substringMinutes = strings.toString().split(String.valueOf(indexCommaBeforeTime + 1), indexCommaBeforeTime + 3);
         String[] substringSeconds = strings.toString().split(String.valueOf(indexCommaBeforeTime + 4), indexCommaAfterTime);

         int minutes = Integer.parseInt(String.valueOf(substringMinutes));
         int seconds = Integer.parseInt(String.valueOf(substringSeconds));

         int[] timeResult = new int[2];
         timeResult[0] = minutes;
         timeResult[1] = seconds;
         return timeResult;
      }
      return intparseStringForTime(strings);
   }
}
