package org.example;

import junit.framework.TestCase;
import org.junit.Assert;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFileTest extends TestCase {

   ArrayList b = new ArrayList<String>();

   ArrayList strings = new ArrayList<String>();
   String s = "";
   private Path path;
   private File file;

   public void ReadFromFile (String path) {
      this.path = Paths.get(path);
   }

   public void testFileRead () {

      b.add("11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo");
      b.add("1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo");
      b.add("27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx");

      file = new File("F:\\results.txt");
      Scanner sc = null;
      try {
         sc = new Scanner(file);
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
      while (sc.hasNextLine())
         s = sc.nextLine();
      strings.add(s);

      Assert.assertEquals(String.valueOf(strings), b, 0);
   }
}