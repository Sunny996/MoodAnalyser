package com.moodanalyser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyseTest {
    @Test
    public void WhenGivenASadMessageShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood=moodAnalyser.analyseMood("I am in Sad Mood");
        assertEquals(mood,"SAD");
    }
}
