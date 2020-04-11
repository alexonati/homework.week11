package org.example;

import java.io.*;

public class WriteToFile {

   public void writeInFile (String s) throws IOException {
      File fout = new File("F:\\results.txt");
      FileOutputStream fos = new FileOutputStream(fout);
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
      bw.write(s);
      bw.newLine();
      bw.close();
   }
}
