package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {

   ArrayList strings = new ArrayList();
   String s = "";
   private Path path;
   private File file;

   public ReadFromFile (String path) {
      this.path = Paths.get(path);
   }

   public ArrayList fileRead (File file) {
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

      return strings;
   }
}
