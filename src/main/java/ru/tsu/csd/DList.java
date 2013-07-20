package ru.tsu.csd;

public class DList<T>
{
	private DListNode<T> firstNode;
	
	public DListNode<T> getFirstNode()
	{
		return firstNode;
	}
	
	public DList()
	{
		firstNode = null;
	}
	
	public DList(T value) 
	{
		firstNode = new DListNode<T>(value);
		firstNode.setNext(null);
	}
	
	public void add(T value) 
	{
		if (firstNode.getNext() != null)
		{
			DListNode<T> nextNode = firstNode.getNext();
			while(nextNode.getNext() != null)
				nextNode = nextNode.getNext();
			DListNode<T> dln = new DListNode<T>(value);
			nextNode.setNext(dln);
			dln.setPrev(nextNode);
			dln.setNext(null);
		}
		else
		{
			DListNode<T> dln = new DListNode<T>(value);
			firstNode.setNext(dln);
			dln.setPrev(firstNode);
			dln.setNext(null);
		}
	}
	
	public int size()
	{
		int i = 1;
		if (firstNode.getNext() != null)
		{
			DListNode<T> nextNode = firstNode.getNext();
			while (nextNode.getNext() != null)
			{
				i++;
				nextNode = nextNode.getNext();
			}
		}
		else
		{
			return i;
		}
		i++;
		return i;
	}
	
	
	@Override
	protected DList<T> clone()
	{
		DList<T> list = new DList<T>(null);
		/*bla bla bla 
		while (getNext() != null)
		list.add(nextNode);*/
		return list;
	}
	
	/*@Override
	public boolean equals(DList<T> dList)
	{
		return true;
	}*/
}
