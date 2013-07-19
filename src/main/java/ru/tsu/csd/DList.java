package ru.tsu.csd;

public class DList 
{
	private DListNode firstNode;
	
	public DListNode getFirstNode()
	{
		return firstNode;
	}
	
	public DList(int value) 
	{
		firstNode = new DListNode(value);
		firstNode.setNext(null);
	}
	
	public void add(int value) 
	{
		if (firstNode.getNext() != null)
		{
			DListNode nextNode = firstNode.getNext();
			while(nextNode.getNext() != null)
				nextNode = nextNode.getNext();
			DListNode dln = new DListNode(value);
			nextNode.setNext(dln);
			dln.setPrev(nextNode);
			dln.setNext(null);
		}
		else
		{
			DListNode dln = new DListNode(value);
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
			DListNode nextNode = firstNode.getNext();
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
}
