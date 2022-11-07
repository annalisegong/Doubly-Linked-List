package net.codejava;

public class Main 
{
	public static void main(String[] args) 
	{
		DoublyLinkedList list = new DoublyLinkedList();
		Node nodeA = new Node(2);
		Node nodeB = new Node(23);
		Node nodeC = new Node(15);
		Node nodeD = new Node(19);
		Node nodeE = new Node(4);
		Node nodeF = new Node(11);
		
		list.append(nodeA);
		list.append(nodeB);
		list.append(nodeC);
		list.append(nodeD);
		list.append(nodeE);
		list.append(nodeF);
		
		System.out.println("unsorted list: ");
		list.display();
		System.out.println("sorted list: ");
		list.insertionSort();
		list.display();
	}
}
