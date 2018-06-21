/**
 * 
 */
package com.bridgelabz.datastructures;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class UnorderedList <T extends Comparable<T>>{

	
	    public  class Node<T extends Comparable<T>> {
	        public T data;
	        Node<T> next;

	        public Node(T data) {
	            this.data = data;
	            next = null;
	        }

	        public Node(T data, Node<T> next) {
	            this.data = data;
	            this.next = next;
	        }

	        public T getValue() {
	            return data;
	        }
	    }

	    Node<T> head;

	    /**
	     * add data at head position in the linked list
	     *
	     * 
	     */
	    public void addFirst(T data) {
	        head = new Node<T>(data, head);
	    }

	    /**
	     * Add data at end of the linked list
	     *
	     * @parm
	     */
	    public void addLast(T data) {

	        if (head == null) {
	            addFirst(data);
	        } else {
	            Node<T> temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = new Node<T>(data, null);
	        }
	    }

	    /**
	     * Display the Linked List data
	     * @return
	     */
	    public void display() {
	        Node<T> temp = head;
	        if (temp == null) {
	            System.out.println("Empty linked list");
	        }
	        while (temp != null) {
	            System.out.println(temp.getValue());
	            temp = temp.next;
	           
	        }
	       
	    }

	    /**
	     * Insert data after the target position data
	     *
	     * @param
	     * @param 
	     */
	    public void insertAftrer(T position, T data) {
	        Node<T> temp = head;
	        while (temp != null && !temp.getValue().equals(position)) {
	            temp = temp.next;
	        }
	        if (temp != null) {
	            temp.next = new Node<T>(data, temp.next);
	        }
	    }

	    /**
	     * Insert data before the target position data
	     *
	     * @param position
	     * @param data
	     */
	    public void insertBefore(T position, T data) {
	        Node<T> temp = head;
	        if (temp == null) {
	            return;
	        }
	        if (temp.getValue().equals(position)) {
	            addFirst(data);
	            return;
	        }
	        Node<T> currentValue = temp;
	        Node<T> previousValue = null;

	        while (currentValue != null && !currentValue.getValue().equals(position)) {
	            previousValue = currentValue;
	            currentValue = currentValue.next;
	        }
	        if (currentValue != null) {
	            previousValue.next = new Node<T>(data, currentValue);
	        }

	    }
	    public void add(T data ) {
	        Node<T> temp=head;
	    }

	    /**
	     * remove data from the linked list
	     *
	     * @param data
	     */
	    public void remove(T data) {
	        if (head == null) {
	            System.out.println("empty list");
	            return;
	        }
	        if (head.data.equals(data)) {
	            head = head.next;
	            return;
	        }
	        Node<T> currentValue = head;
	        Node<T> previousValue = null;
	        while (currentValue != null && !currentValue.data.equals(data)) {
	            previousValue = currentValue;
	            currentValue = currentValue.next;
	        }
	        if (currentValue == null) {
	            System.out.println(" Data is not found");
	        }
	        previousValue.next= currentValue.next;
	    }
	    public void removeAt() {
	       
	    }
	    /**
	     * Search the given data found or not
	     *
	     * @param data
	     */
	    public boolean search(T data) {
	        Node <T> temp=head;
	        if (temp== null) {
	            System.out.println("Empty list");
	            return false;
	        }
	        while (temp!= null) {
	            if (temp.getValue().compareTo(data) == 0) {
	                System.out.println("Search data found");
	                return true;
	            }
	            temp = temp.next;
	        }
	        return false;
	    }
	    public  T getIndexValue(int index) {
	        Node <T> temp=head;
	        int count=0;
	        if(temp==null) {
	            return null;
	        }
	        while(temp!=null) {
	            if(count==index) {
	                return temp.getValue();
	            }
	            count++;
	            temp=temp.next;
	           
	        }
	        return null;
	    }
	    public int size() {
	        Node <T> temp=head;
	        int count=0;
	        if(temp==null) {
	            return 0;
	        }
	        while(temp!=null) {
	            count++;
	            temp=temp.next;
	        }
	        return count;
	    }
	
    public static void main(String[] args)
    {
    
    	UnorderedList a=new UnorderedList();
 
        a.addFirst(20);
        a.addFirst(30);
        a.addLast(10);
        a.display();
        a.search(30);
       
            	
    	
    }
	
	/**
	 * ]
	 * 
	 */
	

}
