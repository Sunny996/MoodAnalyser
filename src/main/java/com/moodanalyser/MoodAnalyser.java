package com.moodanalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (this.message.length() == 0)
                throw new MoodAnalysisException("Empty message, enter a message", MoodAnalysisException.ExceptionType.EMPTY);
            if (this.message.contains("Sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Invalid Message, enter valid message", MoodAnalysisException.ExceptionType.NULL);
        }

    }
}
