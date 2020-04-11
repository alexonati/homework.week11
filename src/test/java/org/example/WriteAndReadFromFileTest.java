package org.example;

import junit.framework.TestCase;
import org.junit.Assert;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteAndReadFromFileTest extends TestCase {

   String content = "11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo";
   String content2 = "1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo";
   String content3 = "27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx";

   ArrayList b = new ArrayList<String>();

   private File file;


   public void testWriteToFile () throws IOException {

      file = new File("F:\\results.txt");

      WriteToFile w = new WriteToFile();

      w.writeInFile(content);
      w.writeInFile(content2);
      w.writeInFile(content3);

      Assert.assertEquals(String.valueOf(file), file, 0);

   }


   public void testFileRead () {

      b.add("11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo");
      b.add("1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo");
      b.add("27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx");

      file = new File("F:\\results.txt");

      ReadFromFile r = new ReadFromFile("F:\\results.txt");

      ArrayList strings = r.fileRead(file);


      Assert.assertEquals(String.valueOf(strings), b, 0);
   }
}