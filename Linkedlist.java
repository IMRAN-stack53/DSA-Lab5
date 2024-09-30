/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedlist;

/**
 *
 * @author Imran shar
 */
public class Linkedlist {
public class Node{
    int data;
   Node next; 
   Node(int data){
       this.data =data;
   this.next =null;
  
   
   }
}
private Node  head;
Linkedlist(){
    this.head =null;
}
public void insertAtStart(int data){
    Node newNode = new Node (data);
    newNode.next=head;
    head=newNode;
}
public void display(){
    if(head==null){
        System.out.println( "list  is  empty :");
    }
   Node current=head;
   while(current !=null){
       System.out.println("----->"+current.data);
       current=current.next;
   }
    System.out.println("null");

}
public void deleteAtStart(){
    if(head==null){
        System.out.println("list is empty");
        return;
    }
}

// Size function to calculate the number of elements in the list
    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

public void insertionAtEnd(int data){
  Node newNode = new Node (data);
    newNode.next=head;
    head=newNode;


}
public void deleteAtEnd() {
        if (head == null) { // If the list is empty
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) { // If the list has only one node
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) { // Traverse until the second-to-last node
                current = current.next;
            }
            current.next = null; // Remove the reference to the last node
        }
    }
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.insertAtStart(40);
         System.out.println("Size of the list: " + list.size()); 
        list.display();
        list.size();
         //list.deletAtstart();
        list.insertionAtEnd(50);
  //      System.out.println("Hello World!");
    }
}
