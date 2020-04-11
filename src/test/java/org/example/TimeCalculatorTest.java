package org.example;

import junit.framework.TestCase;
import org.junit.Assert;

import java.awt.*;

public class TimeCalculatorTest extends TestCase {

   String s = "11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo";

   public String[] explode (String s) {
      String[] arr = new String[s.length()];
      for (int i = 0; i < s.length(); i++) {
         arr[i] = String.valueOf(s.charAt(i));
      }
      return arr;
   }

   public void testCalculateFinalTime () {

      int[] timeToTest = new int[2];
      int[] time = new int[2];
      timeToTest[0] = 30;
      timeToTest[1] = 27;

      TimeCalculatorTest test = new TimeCalculatorTest();

      String[] StringArray = test.explode(s);

      TimeCalculator t = new TimeCalculator();

      time = t.calculateFinalTime(StringArray, timeToTest[0], timeToTest[1]);

      Assert.assertEquals(String.valueOf(time), timeToTest, 1);
   }
}