package com.bridgelabz;

public class MoodAnalyzer {

    private String message;

    //Default Constructor
    public MoodAnalyzer() {
    }

    //Parameterized Constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
