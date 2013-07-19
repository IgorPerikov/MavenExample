package ru.tsu.csd;

public class DListNode<T>
{
	private T value;
	private DListNode<T> next;
	private DListNode<T> prev;
	
	public DListNode(T value)
	{
		this.value = value;
	}
	
	public DListNode<T> getNext()
	{
		return next;
	}
	
	public void setNext(DListNode<T> dLNode)
	{
		next = dLNode;
	}
	
	public DListNode<T> getPrev()
	{
		return prev;
	}
	
	public void setPrev(DListNode<T> dLNode)
	{
		prev = dLNode;
	}
	
	public T getValue()
	{
		return value;
	}
	
	public void setValue(T a)
	{
		value = a;
	}
}
