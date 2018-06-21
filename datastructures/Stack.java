/**
 * 
 */
package com.bridgelabz.datastructures;
/*************************************************************************************************************
 *
 * purpose: methods of stack 
 *
 * @author sowjanya467
 * @version 1.0
 * @since 28-05-17
 *
 **************************************************************************************************/
public class Stack <T extends Comparable<T> >
{
    LinkedList list=new LinkedList();
	public Node <T> top = null;
	int size;
    //creating a node
	public class Node<T extends Comparable<T>> 
	{
		Comparable data;
		private Node<T> next;
		public Node(Comparable data) {
			this.data = data;
		}
	}
    /**
     * Method to add element in to stack using linked list
     * @param data    The data added to the stack linkedlist
     */
	public void push(T data) 
	{
		//list.add(data);
		System.out.println(data.toString());
		System.out.println("push the element");
		Node current = new Node(data);
		if (top == null) {

			top = current;
			size++;
		}
		else 
		{
			Node temp=new Node(data);
			temp.next=top;
			top=temp;
			//top=current;
			size++;
		}
	}
	/**
     * Method to remove element in to stack using linked list
     * @return element that is removed
     */
	public  Node pop()
	{
		//return (T) list.pop();
		if(top==null)
		{
			System.out.println("stack is empty deletion is not possible");
			return null;
		}
		else
		{
			Node temp=top;
			temp.next=null;
			top=top.next;
			size--;
			System.out.println("the element popped is"+temp.data);
		
		return temp;
		}
	}
	/**
     * Method to check if the stack is empty
     * 
     */
	public boolean isEmpty()
	{
		//list.isEmpty();
		if(top==null)
		{
		System.out.println("stack is empty");
		}
		return false;
	}
	/**
	 * 
	 * @return the first element of the stack
	 */
	public Comparable peek()
	{
		System.out.println("the top element is"+top.data);
		return top.data;
	}
	/**
	 * @return size of the stack
	 * 
	 */
	public int size() 
	{
		return list.size();
		/*System.out.println("The size of the stack is "+size);
		return null;*/
	}
	/**
	 *@param display the elements in stack
	 * 
	 */

	public void display() {
		list.display();
		System.out.println("display the elements");
		Node n = top;
		while (n != null) {
			System.out.println(n.data + "  ");
			n = n.next;
		}
		System.out.println("the elements displayed");
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(60);
		s.push(90);
		s.push("a");
		s.push("(");
		s.push(100);
		s.display();
		s.pop();
		s.isEmpty();
		s.display();
		s.push(1);
		s.display();
		//s.peek();
		s.size();
	}
}
