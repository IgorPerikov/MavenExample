package ru.tsu.csd;

public class DList 
{
	DListNode FirstNode;
	
	public DList(int value) 
	{
		FirstNode = new DListNode(value);
		FirstNode.setNext(FirstNode);
		//FirstNode.setPrev(FirstNode);
	}
	
	public void Add(DListNode dln) 
	{
		DListNode NextNode = FirstNode.getNext();
		while(NextNode.getNext() != FirstNode)
		{
			NextNode = NextNode.getNext();
		}
		NextNode = dln;
	}
	//add at the end
	//size
	//create
	//test
}
