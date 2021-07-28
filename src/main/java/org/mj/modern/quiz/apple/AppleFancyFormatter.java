package org.mj.modern.quiz.apple;

public class AppleFancyFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        String weightStr = apple.getWeight() > 150 ? "heavy" : "light";

        return "A " + weightStr + " " + apple.getColor() + " apple";
    }
}
