package ru.tsu.csd;

public class DListNode 
{
	private int value;
	private DListNode next;
	private DListNode prev;
	
	public DListNode getNext()
	{
		return next;
	}
	
	public void setNext(DListNode dln)
	{
		next = dln;
	}
	
	public DListNode getPrev()
	{
		return prev;
	}
	
	public void setPrev(DListNode dln)
	{
		prev = dln;
	}
	
	public int getValue()
	{
		return value;
	}
	
	
	public void setValue(int a)
	{
		value = a;
	}
}
