package com.moodanalyser;

public class Main {
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        System.out.println(moodAnalyser.analyseMood());
    }
}
