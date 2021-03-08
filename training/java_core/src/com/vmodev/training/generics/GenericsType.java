package com.vmodev.training.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsType<A> {

    private A t;

    public A get(){
        return this.t;
    }

    public void set(A t1){
        this.t=t1;
    }

    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("VMO"); //valid

        GenericsType type1 = new GenericsType(); //raw type
        type1.set("VMO"); //valid
        type1.set(10); //valid and autoboxing support
//        List list = new ArrayList();
//        list.add("abc");
//        list.add(new Integer(5)); //OK
//
//        for(Object obj : list){
//            //type casting leading to ClassCastException at runtime
//            String str=(String) obj;
//        }
    }
}
