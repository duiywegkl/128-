package com.wsf.ssm.util;

import java.nio.channels.InterruptibleChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sss {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList();
        a.add(1);
        a.add(1);
        a.add(1);
        Iterator it =  a.iterator();
        while (it.hasNext()){
            Object element = it.next();
            int index = a.indexOf(element);
            Integer ins = (Integer)element+1;
            a.set(index,ins);
        }

        for (Integer s : a){
            System.out.println(s);
        }

    }
}
