package org.example;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class App {


    public static void main (String[] args) throws IOException {

        String content = "11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo";
        String content2 = "1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo";
        String content3 = "27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx";

        writeToFile writeToFile = new writeToFile();

        writeToFile.writeInFile(content);
        writeToFile.writeInFile(content2);
        writeToFile.writeInFile(content3);

        ReadFromFile a = new ReadFromFile("F:\\results.txt");

        a.fileRead(new File("F:\\results.txt"));

        ParseString parseString = new ParseString();

        String s = parseString.parseStringForResults(a.fileRead(new File("F:\\results.txt")));

        ParseStringForTime sp = new ParseStringForTime();

        int time = sp.parseStringForTime();

        TimeCalculator t = new TimeCalculator(s, time)


//        {
//            String content = "11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo";
//            String content2 = "1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo";
//            String content3 = "27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx";
//
//            try {
//                File fout = new File("F:\\results.txt");
//                FileOutputStream fos = new FileOutputStream(fout);
//                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
//                bw.write(content);
//                bw.newLine();
//                bw.write(content2);
//                bw.newLine();
//                bw.write(content3);
//                bw.close();
//            } catch (FileNotFoundException e) {
//
//                e.printStackTrace();
//            } catch (IOException e) {
//                // Problem when writing to the file
//                e.printStackTrace();
//            }
//        }
//        ArrayList strings = new ArrayList();
//        String s = "";
//        File file =
//                new File("F:\\results.txt");
//        Scanner sc = null;
//        try {
//            sc = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while (sc.hasNextLine())
//            s = sc.nextLine();
//        strings.add(s);
//
//        for (int i = 0; i < strings.size(); i++) {
//
//            int indexCommaBeforeTime = StringUtils.ordinalIndexOf(s, ",", 3);
//            int indexCommaAfterTime = StringUtils.ordinalIndexOf(s, ",", 4);
//
//            String substringMinutes = s.substring(indexCommaBeforeTime + 1, indexCommaBeforeTime + 3).trim();
//            String substringSeconds = s.substring(indexCommaBeforeTime + 4, indexCommaAfterTime).trim();
//
//            int minutes = Integer.parseInt(substringMinutes);
//            int seconds = Integer.parseInt(substringSeconds);
//
//            int indexCommaAfterFirstTry = StringUtils.ordinalIndexOf(s, ",", 5);
//            int indexCommaAfterSecondTry = StringUtils.ordinalIndexOf(s, ",", 6);
//
//            String firstTry = s.substring(indexCommaAfterTime + 1, indexCommaAfterFirstTry);
//            String secondTry = s.substring(indexCommaAfterFirstTry + 1, indexCommaAfterSecondTry);
//            String thirdTry = s.substring(indexCommaAfterSecondTry + 1, s.length());
//
//            String stringWithResults = firstTry + secondTry + thirdTry;
//
//            for (int j = 0; j < stringWithResults.length(); j++) {
//                String o = "o";
//                if (stringWithResults.charAt(i) == o.charAt(0)) {
//                    seconds += 10;
//                }
//            }
//
//            if(seconds%60 == 0){
//                minutes = minutes + seconds;
//            }
//            else {
//                int minutesFromSeconds = seconds/60;
//                int time = minutes + minutesFromSeconds;
//            }
//            String time = String.valueOf(time) + ":" + String.valueOf(seconds%60);
//
//
//
//
//
//        }
    }
}


