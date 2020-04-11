package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;

import static org.apache.commons.lang3.StringUtils.ordinalIndexOf;

public class ParseStringForResults {

   private ArrayList arrayList;
   private String s;


   public String[] parseStringForResults (ArrayList arrayList) {

      for (int i = 0; i < arrayList.size(); i++) {
         String s = arrayList.get(i).toString();

         int indexCommaAfterFirstTry = ordinalIndexOf(s, ",", 5);
         int indexCommaAfterSecondTry = ordinalIndexOf(s, ",", 6);

         String[] firstResult = s.split(String.valueOf(ordinalIndexOf(s, ",", 4) + 1), indexCommaAfterFirstTry);
         String[] secondResult = s.split(String.valueOf(ordinalIndexOf(s, ",", 5) + 1), indexCommaAfterSecondTry);
         String[] thirdResult = s.split(String.valueOf(ordinalIndexOf(s, ",", 6) + 5));

         String[] resultsOneAndTwo = ArrayUtils.addAll(firstResult, secondResult);
         String[] resultsAll = ArrayUtils.addAll(resultsOneAndTwo, thirdResult);
         return resultsAll;
      }
      return parseStringForResults(arrayList);
   }
}
