package com.bridglabz;

public class Queue {
    Node head = null;
    Node tail = null;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void Enqueu(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    public int Dequeue () {
        if (isEmpty()) {
            System.out.println("The Queue is empty.");
            return -1;
        }
        int front = head.data;
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        return front;
    }

    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"-->");
            temp = temp.next;
        }
        System.out.println("null");

    }
}