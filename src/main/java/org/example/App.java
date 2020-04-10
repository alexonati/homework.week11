package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


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

        ArrayList strings = a.fileRead(new File("F:\\results.txt"));


        ParseStringForResults ps = new ParseStringForResults();

        char[] results = ps.parseStringForResults(a.fileRead(new File("F:\\results.txt")));

        ParseStringForTime sp = new ParseStringForTime();

        int[] time = sp.parseStringForTime(ps.parseStringForResults(a.fileRead(new File("F:\\results.txt"))));

        TimeCalculator t = new TimeCalculator();

        int[] timeOfEachAthlete = t.calculateFinalTime(results, time[0], time[1]);

        NameParser name = new NameParser();

        String nameAndDetailsOfAthlete = name.getAthleteName(a.fileRead(new File("F:\\results.txt")));

        List<Athlete> athletes = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++)
            athletes.add(new Athlete(nameAndDetailsOfAthlete, timeOfEachAthlete));

        for (int i = 0; i < athletes.size(); i++) {
            athletes.get(i).getTime();
            if (athletes.get(i).getTime() > athletes.get(i).getTime()) {
                System.out.println("The athlete's time is shorter." + athletes.get(i).getNumberAndName() + athletes.get(i).getTime());
            }
        }
    }
}


