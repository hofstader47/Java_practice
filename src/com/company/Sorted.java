package com.company;
import java.util.*;
import java.io.*;

public class Sorted {
    public static void main(String[] args)
    {
        Set<String> s1=new TreeSet<>();
        s1.add("This programming tutorial is damn good");
        s1.add("I");
        s1.add("would");
        s1.add("to");
        s1.add("stay");
        s1.add("tuned");
        Iterator<String> iu=s1.iterator();
        while(iu.hasNext())
        {
            System.out.println(iu.next());
        }
        class AnotherInnerClass {
            int thousand() {
                return 1000;
            }

            AnotherInnerClass crazyReturn() {
                class SpecialInnerClass extends AnotherInnerClass {
                    int thousand() {
                        return 2000;
                    }
                }
                ;
                return new SpecialInnerClass();
            }
        }
}
}
