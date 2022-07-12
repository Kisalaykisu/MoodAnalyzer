package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis_whenMoodIsSad() { //TC 1.1 "I am in sad mood"
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in sad mood");
        Assertions.assertEquals(mood, "SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() { //TC 1.2 I am in happy mood
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood1 = moodAnalyzer.analyseMood("I am in happy mood");
        Assertions.assertEquals(mood1, "HAPPY");
    }
}

