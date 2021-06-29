package com.cybertek.lambdaShortVideos.functionImplementation;

import java.util.function.Function;

public class StringLengthGetter implements Function<String,Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
