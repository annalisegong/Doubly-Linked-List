package net.codejava;

public class DoublyLinkedList 
{
	public Node head;
	public Node tail;
	
	public DoublyLinkedList()
	{
		this.head = null;
		this.tail = null;
	}
	
	public void append(Node newNode)
	{
		if(this.head == null)
		{
			//case empty list
			this.head = newNode;
			this.tail = newNode;
		}
		else
		{
			this.tail.nextNode = newNode;
			newNode.previousNode = this.tail;
			this.tail = newNode;
		}
	}
	
	public void prepend(Node newNode)
	{
		if(this.head == null)
		{
			this.head = newNode;
			this.tail = newNode;
		}
		else
		{
			newNode.nextNode = this.head;
			this.head.previousNode = newNode;
			this.head = newNode;
		}
	}
	
	public void insertAfter(Node currNode, Node newNode)
	{
		if(this.head == null)
		{
			this.head = newNode;
			this.tail = newNode;
		}
		else if(currNode == this.tail)
		{
			this.tail.nextNode = newNode;
			newNode.previousNode = this.tail;
			this.tail = newNode;
		}
		else
		{
			Node postNode = currNode.nextNode;
			newNode.nextNode = postNode;
			newNode.previousNode = currNode;
			currNode.nextNode = newNode;
			postNode.previousNode = newNode;
		}
	}
	
	public void removeAfter(Node currNode)
	{
		Node postNode = currNode.nextNode;
		Node prevNode = currNode.previousNode;
		
		if(postNode != null)
		{
			postNode.previousNode = prevNode;
		}
		if(prevNode != null)
		{
			prevNode.nextNode = postNode;
		}
		if(currNode == this.head)
		{
			this.head = postNode;
		}
		if(postNode == this.tail)
		{
			this.tail = prevNode;
		}
	}
	
	public int indexOf(int input)
	{
		int count = 0;
		if(this.head == null)
		{
			return -1;
		}
		else
		{
			Node currNode = this.head;
			while(currNode != null && currNode.data != input)
			{
				count++;
				currNode = currNode.nextNode;
			}
			return count;
		}
	}
	
	public void display()
	{
		// Node current will point to head
        Node currNode = head;
 
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (currNode != null) {
            // Prints each node by incrementing pointer
            System.out.print(currNode.data + " ");
            currNode = currNode.nextNode;
        }
 
        System.out.println();
	}
	
	public void insertionSort()
	{
		Node currNode = this.head.nextNode;
		while(currNode != null)
		{
			Node nextNode = currNode.nextNode;
			Node searchNode = currNode.previousNode;
			while(searchNode != null && currNode.data < searchNode.data)
			{
				searchNode = searchNode.previousNode;
			}
			removeAfter(currNode);
			if(searchNode == null)
			{
				currNode.previousNode = null;
				prepend(currNode);
			}
			else
			{
				insertAfter(searchNode, currNode);
				
			}
			currNode = nextNode;
		}
	}
}