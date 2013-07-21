package ru.tsu.csd;

import java.util.Iterator;

public class DList<T> implements Cloneable, Iterator<T>
{
	private DListNode<T> firstNode;
	
	public DListNode<T> getFirstNode()
	{
		return firstNode;
	}
	
	public void setFirstNode(DListNode<T> dln)
	{
		firstNode = dln;
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
	
	public void add(DListNode<T> dln)
	{
		if (this.getFirstNode() == null)
		{
			this.setFirstNode(dln);
			this.getFirstNode().setNext(null);
		}
		else
		{
			if (firstNode.getNext() != null)
			{
				DListNode<T> nextNode = firstNode.getNext();
				while(nextNode.getNext() != null)
					nextNode = nextNode.getNext();
				nextNode.setNext(dln);
				dln.setPrev(nextNode);
				dln.setNext(null);
			}
			else
			{
				firstNode.setNext(dln);
				dln.setPrev(firstNode);
				dln.setNext(null);
			}
		}
	}
	
	public void add(T value) 
	{
		if (this.getFirstNode() == null)
		{
			DListNode<T> dln = new DListNode<T>(value); 
			this.setFirstNode(dln);
			this.getFirstNode().setNext(null);
		}
		else
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
	}
	
	public int size()
	{
		int i = 0;
		if (this.getFirstNode() == null) return i; else i++;
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
	protected DList<T> clone()  throws CloneNotSupportedException
	{
		DList<T> list = new DList<T>();
		if (this.size() == 0) return list;
		else
		{
			if (this.getFirstNode().getNext() == null)
			{
				list.add(this.getFirstNode());
			}
			else
			{
				list.add(this.getFirstNode());
				DListNode<T> nextNode = this.getFirstNode().getNext();
				while (nextNode.getNext() != null)
				{
					list.add(nextNode);
					nextNode = nextNode.getNext();
				}
				//nextNode = nextNode.getNext();
			}
		}
		return list;
	}
	
	@Override
	public String toString()
	{
		String s = "";
		if (this.getFirstNode() != null) 
		{
			if (this.getFirstNode().getNext() != null)
			{
				s = s + this.getFirstNode().getValue() + "\r\n";
				DListNode<T> nextNode = this.getFirstNode().getNext();
				while (nextNode.getNext() != null)
				{
					s = s + nextNode.getValue() + "\r\n";
					nextNode = nextNode.getNext();
				}
				s = s + nextNode.getValue() + "\r\n";
			}
			else
			{
				s += this.getFirstNode().getValue();
			}
		}
		return s;
	}

	@Override
	public boolean hasNext() 
	{
		return false;
	}

	@Override
	public T next() 
	{
		return null;
	}

	@Override
	public void remove() 
	{
		
	}
	
	/*@Override
	public boolean equals(DList<T> dList)
	{
		return true;
	}*/
}