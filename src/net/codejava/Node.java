package net.codejava;

public class Node 
{
	public int data;
	public Node previousNode;
	public Node nextNode;
	
	public Node(int data)
	{
		this.data = data;
		this.previousNode = null;
		this.nextNode = null;
	}
}