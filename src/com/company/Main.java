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
	Main1()
	{
		System.out.println("Starting with the hashset");
		Set<Integer> s1=new HashSet<>();
		s1.add(32);
		s1.add(56);
		s1.add(12);
		s1.add(90);

		Iterator<Integer> ix=s1.iterator();
		while(ix.hasNext())
		{
			System.out.println(ix.next());
		}
	}
	public void call2()
	{
		System.out.println("This is B calling from Main1");
	}

}
public class Main implements A {
	public static List<Integer> l1=new LinkedList<>();

	public void call1()
	{
		System.out.println("Hi I was called");
	}
	public void call2()
	{
		System.out.println("This was called by me");
	}
    public static void main(String[] args) {
		List<Integer> l3=new Stack<>();
		l3.add(45);

		l1.add(44);
		l1.add(45);
		l1.add(46);
		l1.add(47);
		l1.add(48);
		l1.add(49);
		l1.add(50);
		l1.add(51);

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
	Iterator<Integer> i2=l1.iterator();
	while(i2.hasNext())
		System.out.println(i2.next());

//	System.out.println(new ArrayList<Integer>(Arrays.asList(23,5,43,67)}).Class);
Main1 memo=new Main1();
    }
}
