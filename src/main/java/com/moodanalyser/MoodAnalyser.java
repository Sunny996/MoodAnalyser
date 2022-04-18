package com.moodanalyser;

public class MoodAnalyser {
    public String analyseMood(String mood) {
        if (mood.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }
}
