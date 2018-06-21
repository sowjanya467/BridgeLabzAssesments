/**
 * 
 */
package com.bridgelabz.datastructures;

import com.bridgelabz.dutil.UtilityDs.Node;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class Deque <T extends Comparable<T>>{

	Node <T> front=null;
	Node <T> rear=null;
	Node<T> next;
	int size;
	/**
	 * @param args
	 */
	public class Node<T extends Comparable<T>>
	{
		public T data;
		private int size;
		//Node <T> front=null;
		//Node <T> rear=null;
		Node<T> next;
		/**
		 * @param data2
		 * @param front2
		 */
		public Node(T data)
		{
			this.data=data;
			next=null;
		}
		public Node(T data, Node<T> n) {
			this.data=data;
			this.next=n;
		}
		public void setNext(Node temp)
		{
			next=temp;
		}
		public void setData(T d)
		{
			data=d;
		}
		public Node<T> getNext()
		{
			return next;
		}
		public T getData()
		{
			return data;
		}
	}
	//adding the elements at first
		@SuppressWarnings("unchecked")
		public void addFirst(T data)
		{
			Node<T> current=new Node<T>(data,null);
			System.out.println("adding elements");
			if(front==null)
			{
				front=current;
				rear=front;
			}
			else
			{
				current.setNext(front);
				front=current;
			}
			
		}
		
		@SuppressWarnings("unchecked")
		public void addLast(T data)
		{
			Node<T> current=new Node<T>(data,null);
			System.out.println("adding elements at rear end");
			if(rear==null)
			{
				rear=current;
				front=rear;
			}
			else
			{
			   rear.setNext(current);
			   rear=current;
				size++;
						
				/*Node<T> temp=front;
			    while(temp.next!=null)	
			    {
			    	temp=temp.next;
			    }
			    temp.next=new Node<T>(data,front);*/
			}
		}
		public Comparable<?> removeFront()
		{
			if(size==0)
			System.out.println("the dequeue is empty");
			Node temp=front;
			front=temp.getNext();
			if(temp==null)
			{
				rear=null;
				size--;
			}
			return temp.getData();
		}

		

		public Comparable removeRear()
		{
			if(size==0)
			{
				System.out.println("deque is empty");
			}
			else
			{
				T ele=rear.getData();
				Node temp=front;
				Node current=front;
				while(temp!=rear)
				{
					current=temp;
					temp=temp.getNext();
				}
				rear=current;
                rear.setNext(null);
                size--;
			}
			return rear.getData();
		}
		public void display()
		{
			Node temp=front;
			System.out.println("displaying the elements");
			if(size==0)
			{
				System.out.println("the queue is empty");
			}
			
			while(temp!=rear.getNext())
			{	
			    System.out.println(temp.getData()+" ");	
			    temp=temp.getNext();			    
			}
			System.out.println("elements displayed");
		}
		public int size1()
		{
			
			return size;
		    
		}
	    public boolean isEmpty()
	    {
	    	return front==null;
	    }
	/*public static void main(String[] args) {
		Deque d=new Deque();
	   d.addFirst(12);
	   d.addFirst(44);
	   d.addFirst(11);
	   d.addLast(33);
	   d.addFirst(8);
	   d.addFirst('c');
	   d.display();
	   d.removeRear();
	   d.display();
	   d.removeFront();
	   d.display();
	}*/

	/**
	 * @return
	 */
	public int size() {
		// TODO Auto-generated method stub
		
		return size;
	}

	/**
	 * 
	 */
	public void removeAtfront() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	public void removeAtFront() {
		// TODO Auto-generated method stub
		
	}
	 
	 
		
	

}
