package com.moodanalyser;

public class MoodAnalysisException extends Exception{
    enum ExceptionType{
        NULL, EMPTY
    }
    ExceptionType exceptionType;

    public MoodAnalysisException(String message, ExceptionType exceptionType) {
        super(message);
        this.exceptionType = exceptionType;
    }
}
