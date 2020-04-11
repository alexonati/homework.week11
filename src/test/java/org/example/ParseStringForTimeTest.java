package org.example;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

public class ParseStringForTimeTest extends TestCase {

   public void testIntparseStringForTime () {

      ArrayList a = new ArrayList<String>();
      a.add("11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo");

      ParseStringForTime p = new ParseStringForTime();

      int[] time = p.intparseStringForTime(a);
      int[] timeToTest = new int[2];
      timeToTest[0] = 30;
      timeToTest[1] = 27;

      Assert.assertEquals(time.toString(), timeToTest.toString(), 0);
   }
}