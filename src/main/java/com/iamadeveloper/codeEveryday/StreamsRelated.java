package com.iamadeveloper.codeEveryday;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsRelated {

    public void addToStream(){
        List<String> list = new ArrayList<>();
        list.add("milk");
        list.add("bread");
        list.add("sausage");
        Stream<String> stream = list.stream();
        list.add("eggs, don't forget eggs!");
        stream.forEach(System.out::println);
    }
}
