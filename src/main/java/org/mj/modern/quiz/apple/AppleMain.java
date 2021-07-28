package org.mj.modern.quiz.apple;

import java.util.Arrays;
import java.util.List;

public class AppleMain {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple(Color.GREEN, 160), new Apple(Color.RED, 160), new Apple(Color.RED, 140));
        AppleUtil.prettyPrintApple(apples, new AppleSimpleFormatter());
    }
}
