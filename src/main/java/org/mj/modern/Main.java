package org.mj.modern;

import org.mj.modern.quiz.apple.Apple;
import org.mj.modern.quiz.apple.Color;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setColor(Color.GREEN);
        apple.setWeight(150);

        System.out.println("apple = " + apple);
    }
}
