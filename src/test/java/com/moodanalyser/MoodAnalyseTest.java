package com.moodanalyser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyseTest {
    @Test
    public void WhenGivenASadMessageInConstructorShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood=moodAnalyser.analyseMood();
        assertEquals(mood,"SAD");
    }


}
