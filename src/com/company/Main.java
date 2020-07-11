package com.company;
import java.io.*;
import java.util.*;
interface A extends B{
	void call1();
}
interface B
{
	void call2();
}
class Main1 implements B
{
	public void call2()
	{
		System.out.println("This is B calling from Main1");
	}

}
public class Main implements A {
	public void call1()
	{
		System.out.println("Hi I was called");
	}
	public void call2()
	{
		System.out.println("This was called by me");
	}
    public static void main(String[] args) {

	System.out.println("This marks the first commit for practice");
	System.out.println("Lets start with comparators");
	TreeSet<String> t=new TreeSet<>();
	t.add("apple");
	t.add("banana");
	t.add("casket");
	Iterator<String> i=t.iterator();
	while(i.hasNext())
    {
        System.out.println(i.next());
    }
	Map<Integer, Integer> m=new HashMap<>();
	m.put(0,45);
	m.put(1,46);
	m.put(2,47);
	m.put(3,48);
	for(Map.Entry<Integer, Integer> e : m.entrySet())
	{
		System.out.println("The value at index "+e.getKey()+" is "+e.getValue());
	}
//	System.out.println(new ArrayList<Integer>(Arrays.asList(23,5,43,67)}).Class);

    }
}
