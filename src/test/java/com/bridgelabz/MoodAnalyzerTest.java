package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {


    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");//Tc1.1 Refactor
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood,"SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {//Tc1.2 Refactor
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
        String mood1 = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood1,"HAPPY");

    }
}
