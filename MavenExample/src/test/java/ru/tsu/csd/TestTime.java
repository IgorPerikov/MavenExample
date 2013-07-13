package ru.tsu.csd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTime 
{
	@Test
	public void testMain() 
	{
		String dt = new java.text.SimpleDateFormat(("hh:mm aaa")).format(java.util.Calendar.getInstance().getTime());
        assertNotNull(dt);
	}
}
