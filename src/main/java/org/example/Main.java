package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("FundName (PDF)");
        list.add("FundNumber");
        list.add("25.00");
        list.add("FundName1");
        list.add("FundNumber1");
        list.add("75.00");

        System.out.println(list);

        List<String> newList=new ArrayList<>();
        for (String s : list) {
            if(s.contains("(PDF)")){
                s.replaceAll("(PDF)"," ");
                System.out.println(s);
            }else {
                continue;
            }

        }


    }
}