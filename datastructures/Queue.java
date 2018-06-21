/**
 * 
 */
package com.bridgelabz.datastructures;

import com.bridgelabz.datastructures.LinkedList.Node;

/*************************************************************************************************************
 *
 * purpose: methods of queue
 *
 * @author sowjanya467
 * @version 1.0
 * @since 21-05-17
 *
 **************************************************************************************************/

public class Queue<T extends Comparable<T>> {
	LinkedList list = new LinkedList();

	public static class Node<T extends Comparable<T>> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}

	}

	/**
	 * Method to add element in to queue using linked list
	 * 
	 * @param data
	 *            The data added to the queue linkedlist
	 */
	public void enQueue(Comparable data) {
		System.out.println("entering the elements");
		list.add(data);

	}

	/**
	 * 
	 * @return size of the stack
	 */
	public int size() {
		int s = list.size();
		return s;

	}

	/**
	 * Method to remove element from queue using linked list
	 * 
	 * @return removed element
	 */
	public T deQueue() {
		T element = (T) list.pop();

		return element;
	}

	/**
	 * method to display elements in queue
	 */
	public void display() {
		list.display();

	}

	/**
	 * Method to check queue is empty or not
	 */
	public boolean isEmpty() {
		list.isEmpty();

		return false;

	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.isEmpty();
		q.enQueue(23);
		q.enQueue(26);
		q.enQueue("ss");
		q.enQueue(44);
		q.display();
		q.deQueue();
		q.display();
		q.size();
		q.deQueue();
		q.display();
	}

}
