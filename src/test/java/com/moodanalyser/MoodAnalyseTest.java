package com.moodanalyser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class MoodAnalyseTest {
    @Test
    public void WhenGivenASadMessageInConstructorShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals(mood, "SAD");
    }

    @Test
    public void WhenGivenASadMessageInConstructorShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals(mood, "HAPPY");
    }

    @Test
    public void WhenGivenNullMessageShouldThrowMoodAnalysisException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            String mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            assertSame(MoodAnalysisException.ExceptionType.NULL, e.exceptionType);
        }
    }

    @Test
    public void WhenGivenEmptyMessageShouldThrowMoodAnalysisException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            String mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            assertSame(MoodAnalysisException.ExceptionType.EMPTY, e.exceptionType);
        }
    }


}
