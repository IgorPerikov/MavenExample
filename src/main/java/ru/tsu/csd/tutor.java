package ru.tsu.csd;

public class tutor 
{
	public static void main(String[] args)
	{
		DList<Integer> list = new DList<Integer>(new Integer(32));
		list.add(32);
		list.add(54);
		System.out.println(list.toString());
	}
}
