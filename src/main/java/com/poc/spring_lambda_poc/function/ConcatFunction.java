package com.poc.spring_lambda_poc.function;

import java.util.function.Function;

public class ConcatFunction implements Function<String, String> {
    @Override
    public String apply(String s) {
        return s.concat(" - NEW STR");
    }
}
