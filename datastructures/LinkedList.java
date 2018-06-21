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
 **************************************************************************************************/

public class LinkedList<T extends Comparable<T>> 
{
	private Node<T> head = null;
	private int size = 0;

	public static class Node<T extends Comparable<T>> 
	{
		private T data;
		private Node<T> next;

		public Node(T data) 
		{
			this.data = data;
			this.next = null;
		}
		public T getValue() 
		{
			return data;
		}
	}

	/**
	 * Method to add element
	 * 
	 * @param data
	 *            Add data into the list
	 */
	public void add(T data) 
	{
		Node<T> node = new Node<T>(data);
		if (head == null) 
		{
			head = node;
			size++;
			return;
		}
		Node<T> temp = head;
		while (temp.next != null) 
		{
			temp = temp.next;
		}
		temp.next = node;
		node.next = null;
		size++;
	}

	/**
	 * Method to add element at first of the linked list
	 * 
	 * @param data
	 *            The data to be added at the first
	 */
	public void addFirst(T data) 
	{
		Node<T> node = new Node<T>(data);
		node.next = head;
		head = node;
		size++;
	}

	/**
	 * Method to add element at the last node of linked list
	 * 
	 * @param data
	 *            The data to be added at the last
	 */
	public void addLast(T data) 
	{
		if (head == null) 
		{
			addFirst(data);
			return;
		} 
		Node<T> temp = head;
		while (temp.next != null) 
		{
			temp = temp.next;
		}
		temp.next = new Node<T>(data);
		size++;
	}

	/**
	 * Method to add element after the specific location of linked list
	 * 
	 * @param data
	 *            The data to be added
	 * @param reference
	 *            The reference key after which data is inserted
	 */
	public void insertAfter(T data, T reference) {
		Node<T> temp = head;
		while (temp != null && !temp.data.equals(reference)) 
		{
			temp=(Node<T>) data;
			temp = temp.next;
		}
	}

	/**
	 * Method to display linked list
	 */
	public void display() 
	{
		if (size == 0) 
		{
			System.out.println("Empty");
			return;
		}
		Node<T> temp = head;
		while (temp != null) 
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	/**
	 * Method to search the element in a linked list
	 * 
	 * @param value
	 *            The value which is to be searched
	 * @return boolean
	 */
	public boolean search(T value) 
	{
		Node<T> temp = head;
		while (temp != null) {
			if (temp.data.compareTo(value) == 0)
				return true;
			temp = temp.next;
		}
		return false;
	}

	/**
	 * Method to find size
	 * 
	 * @return integer The size of list
	 */
	public int size() 
	{
		Node<T> temp = head;
		int count = 0;
		while (temp != null) 
		{
			count++;
			temp = temp.next;
		}
		return count;
	}

	/**
	 * Method to check whether list is empty or not
	 * 
	 * @return boolean True if size is 0
	 */
	public boolean isEmpty() 
	{
		return size == 0;
	}

	/**
	 * Method to remove element at index
	 * 
	 * @param index
	 *            The index value at which data is removed
	 * @return The removed data
	 */
	public T removeAt(int index) {
		if (index == 0) {
			T temp = head.data;
			head = (Node<T>) head.next;
			size--;
			return temp;
		}
		Node<T> t = head;
		int count = 0;
		while (count < index - 1) {
			t = (Node<T>) t.next;
			count++;
		}
		T temp = t.next.data;
		t.next = t.next.next;
		size--;
		return temp;
	}

	/**
	 * Method to remove data element
	 * 
	 * @param data
	 *            The data to be removed
	 */
	public void remove(T data) {
		if (head == null) {
			System.out.println("Head cannot be null!!");
		}
		if (head.data.equals(data)) {
			head = head.next;
			return;
		}

		Node<T> cur = head;
		Node<T> prev = null;

		while (cur != null && !cur.data.equals(data)) {
			prev = cur;
			cur = cur.next;
		}

		if (cur == null) {
			System.out.println("cannot be null!!");
		}
		prev.next = cur.next;
	}

	/**
	 * Method to remove first node
	 * 
	 * @return First node element
	 */
	public Object removeFirst() {
		Object temp = head.data;
		head = (Node<T>) head.next;
		size--;
		return temp;
	}

	/**
	 * Method to display mid element of list
	 */
	public void displayMid() {
		Node<T> mid = head;
		int count = 0;
		while (count != size / 2) {
			mid = mid.next;
			count++;
		}
		System.out.println(mid.data);
	}

	/**
	 * Method to get the desired index element
	 * 
	 * @param index
	 *            The index value at which data is required
	 * @return data at the given index
	 */
	public T getNth(int index) {
		Node<T> temp = head;
		int count = 0;

		while (count != index) {

			count++;
			temp = temp.next;
		}
		return temp.data;

	}

	public T pop() {
		T temp = head.data;
		head = head.next;
		size--;
		return temp;

	}

	/**
	 * Method to add data in the sorted order
	 * 
	 * @param data
	 *            The data to be added in the list
	 */
	public void addSorted(T data) {
		Node<T> current;
		Node<T> new_node = new Node<T>(data);
		if (head == null || head.data.compareTo(new_node.data) >= 0) {
			new_node.next = head;
			head = new_node;
		} else {
			current = head;
			while (current.next != null && current.next.data.compareTo(new_node.data) < 0) {
				current = current.next;
			}
			new_node.next = current.next;
			current.next = new_node;
		}
	}

}
