package ru.tsu.csd;

public class DList 
{
	public DListNode firstNode;
	
	public DList(int value) 
	{
		firstNode = new DListNode(value);
		firstNode.setNext(firstNode);
		firstNode.setPrev(null);
	}
	
	public void add(int value) 
	{
		DListNode NextNode = firstNode.getNext();
		while(NextNode.getNext() != null)
		{
			NextNode = NextNode.getNext();
		}
		DListNode dln = new DListNode(value);
		NextNode.setNext(dln);
		dln.setPrev(NextNode);
		dln.setNext(firstNode);
		firstNode.setPrev(dln);
	}
	
	public int size()
	{
		DListNode NextNode = firstNode.getNext();
		int i = 1;
		while(NextNode.getNext() != null)
		{
			NextNode = NextNode.getNext();
			i++;
		}
		if (firstNode.getNext() != firstNode) i++;
		return i;
	}
}
