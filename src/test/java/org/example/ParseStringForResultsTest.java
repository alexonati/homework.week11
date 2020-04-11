package org.example;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

public class ParseStringForResultsTest extends TestCase {

   public void testParseStringForResults () {

      ArrayList a = new ArrayList<String>();
      a.add("11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo");

      ParseStringForResults p = new ParseStringForResults();

      String[] results = p.parseStringForResults(a);

      String[] resultsToTest = {"xxxoxxxxxxxxoxo"};

      Assert.assertEquals(String.valueOf(results), resultsToTest, 0);

   }
}