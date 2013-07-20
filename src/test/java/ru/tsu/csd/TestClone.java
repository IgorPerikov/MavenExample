package ru.tsu.csd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ru.tsu.csd.DList;


public class TestClone
{
	@Test
	public void test() 
	{
		Double d = new Double(123.32);
		DList<Double> list = new DList<Double>(d);
		list.add(32.32);
		list.add(54.21);
		//DList<Double> lClone = list.clone();
		System.out.println(list.toString());
		//System.out.println(lClone.toString());
	}
}
