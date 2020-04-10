package org.example;

import org.apache.commons.lang3.StringUtils;

public class ParseStringForTime {


   public int[] parseStringForTime (char[] chars) {

      for (int i = 0; i < chars.length; i++) {

         int indexCommaBeforeTime = StringUtils.ordinalIndexOf(chars.toString(), ",", 3);
         int indexCommaAfterTime = StringUtils.ordinalIndexOf(chars.toString(), ",", 4);

         String substringMinutes = chars.toString().substring(indexCommaBeforeTime + 1, indexCommaBeforeTime + 3).trim();
         String substringSeconds = chars.toString().substring(indexCommaBeforeTime + 4, indexCommaAfterTime).trim();

         int minutes = Integer.parseInt(substringMinutes);
         int seconds = Integer.parseInt(substringSeconds);

         int[] time = new int[2];
         time[0] = minutes;
         time[1] = seconds;
      }
      return parseStringForTime(chars);
   }
}
