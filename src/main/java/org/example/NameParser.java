package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

public class NameParser {

   public String getAthleteName (ArrayList arrayList) {
      String s = null;
      for (int i = 0; i < arrayList.size(); i++) {
         int indexCommaAfterName = StringUtils.ordinalIndexOf(s, ",", 2);
         s.substring(0, indexCommaAfterName);
      }
      return getAthleteName(arrayList);
   }
}