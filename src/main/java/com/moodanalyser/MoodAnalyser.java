package com.moodanalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (this.message.contains("Sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }

    }
}
