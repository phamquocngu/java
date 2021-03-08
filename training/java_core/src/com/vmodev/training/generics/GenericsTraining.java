package com.vmodev.training.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTraining {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1000);     //works fine
//        list.add("lokesh"); //compile time error;

        List list1 = new ArrayList();
        list1.add(1000);
        list1.add("abc");

    }
}
