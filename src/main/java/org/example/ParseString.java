package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

public class ParseString {

   private ArrayList arrayList;
   private String s;


   public String parseStringForResults (ArrayList arrayList) {

      for (int i = 0; i < arrayList.size(); i++) {

         int indexCommaAfterTime = StringUtils.ordinalIndexOf(s, ",", 4);

         int indexCommaAfterFirstTry = StringUtils.ordinalIndexOf(s, ",", 5);
         int indexCommaAfterSecondTry = StringUtils.ordinalIndexOf(s, ",", 6);

         String firstTry = s.substring(indexCommaAfterTime + 1, indexCommaAfterFirstTry);
         String secondTry = s.substring(indexCommaAfterFirstTry + 1, indexCommaAfterSecondTry);
         String thirdTry = s.substring(indexCommaAfterSecondTry + 1, s.length());

         String arrayWithResults;
         arrayWithResults = firstTry + secondTry + thirdTry;
      }
      return parseStringForResults(arrayList);
   }
}
