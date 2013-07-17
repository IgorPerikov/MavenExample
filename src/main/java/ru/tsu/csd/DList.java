package ru.tsu.csd;

public class DList 
{
	DListNode FirstNode;
	
	public DList(int value) 
	{
		FirstNode = new DListNode(value);
		FirstNode.setNext(FirstNode);
		FirstNode.setPrev(FirstNode);
	}
	
	public void add(int value) 
	{
		DListNode NextNode = FirstNode.getNext();
		while(NextNode.getNext() != FirstNode)
		{
			NextNode = NextNode.getNext();
		}
		DListNode dln = new DListNode(value);
		NextNode.setNext(dln);
		dln.setPrev(NextNode);
		dln.setNext(FirstNode);
		FirstNode.setPrev(dln);
	}
	
	public int size()
	{
		DListNode NextNode = FirstNode.getNext();
		int i = 1;
		while(NextNode.getNext() != FirstNode)
		{
			NextNode = NextNode.getNext();
			i++;
		}
		if (FirstNode.getNext() != FirstNode) i++;
		return i;
	}
	//test
}
