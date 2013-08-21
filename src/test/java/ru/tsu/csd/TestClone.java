package ru.tsu.csd;

import org.junit.Ignore;
import org.junit.Test;


public class TestClone
{
	@Ignore
	@Test
	public void test() throws CloneNotSupportedException 
	{
		Double d = new Double(123.32);
		DList<Double> list = new DList<Double>(d);
		list.add(32.32);
		list.add(54.21);
		DList<Double> lClone = (DList<Double>) list.clone();
		System.out.println(list.toString());
		System.out.println(lClone.toString());
	}
}