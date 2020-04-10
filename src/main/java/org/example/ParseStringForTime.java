package org.example;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.apache.commons.lang3.StringUtils;

public class ParseStringForTime {


   public int parseStringForTime (String s) {

      for (int i = 0; i < s.length(); i++) {

         int indexCommaBeforeTime = StringUtils.ordinalIndexOf(s, ",", 3);
         int indexCommaAfterTime = StringUtils.ordinalIndexOf(s, ",", 4);

         String substringMinutes = s.substring(indexCommaBeforeTime + 1, indexCommaBeforeTime + 3).trim();
         String substringSeconds = s.substring(indexCommaBeforeTime + 4, indexCommaAfterTime).trim();

         int minutes = Integer.parseInt(substringMinutes);
         int seconds = Integer.parseInt(substringSeconds);
      }
      return parseStringForTime(s);
   }
}
