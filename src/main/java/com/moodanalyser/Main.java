package com.moodanalyser;

public class Main {
    public static void main(String[] args) throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        System.out.println(moodAnalyser.analyseMood());
    }
}
