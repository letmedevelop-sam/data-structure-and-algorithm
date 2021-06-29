package com.cybertek.lambdaShortVideos.predicateImplementation;

import java.util.function.Predicate;

public class MoreThan5CharChecker implements Predicate<String> {
    @Override
    public boolean test(String t) {
        return t.length() > 5;
    }
}
