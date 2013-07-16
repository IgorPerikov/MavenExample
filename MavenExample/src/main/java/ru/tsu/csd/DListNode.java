package ru.tsu.csd;

public class DListNode 
{
	private int value;
	private DListNode next;
	private DListNode prev;
	
	public DListNode(int value)
	{
		this.value = value;
		
	}
	
	public DListNode getNext()
	{
		return next;
	}
	
	public void setNext(DListNode dLNode)
	{
		next = dLNode;
	}
	
	public DListNode getPrev()
	{
		return prev;
	}
	
	public void setPrev(DListNode dLNode)
	{
		prev = dLNode;
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
