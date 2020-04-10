package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;

import static org.apache.commons.lang3.StringUtils.ordinalIndexOf;

public class ParseStringForResults {

   private ArrayList arrayList;
   private String s;


   public char[] parseStringForResults (ArrayList arrayList) {

      for (int i = 0; i < arrayList.size(); i++) {
         String s = arrayList.get(i).toString();

         int indexCommaAfterTime = ordinalIndexOf(s, ",", 4);
         int indexCommaAfterFirstTry = ordinalIndexOf(s, ",", 5);
         int indexCommaAfterSecondTry = ordinalIndexOf(s, ",", 6);

         int a = s.substring(indexCommaAfterTime + 1, indexCommaAfterFirstTry).toCharArray().length +
                 s.substring(indexCommaAfterFirstTry + 1, indexCommaAfterSecondTry).toCharArray().length +
                 s.substring(indexCommaAfterSecondTry + 5).toCharArray().length;

         char[] charArrayWithResults1 = new char[a];


         charArrayWithResults1 = ArrayUtils.addAll(s.substring(indexCommaAfterTime + 1, indexCommaAfterFirstTry).toCharArray(),
                 s.substring(indexCommaAfterFirstTry + 1, indexCommaAfterSecondTry).toCharArray());

         charArrayWithResults1 = ArrayUtils.addAll(charArrayWithResults1, s.substring(indexCommaAfterSecondTry + 5).toCharArray());

      }
      return parseStringForResults(arrayList);
   }
}
