package DSA.DataStructures;

public class SinglyLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void delete(int key) {
        Node current = this.head;
        Node prev = null;

        if (current != null && current.data == key) {
            this.head = current.next;
            System.out.println("Element " + key + " deleted from the list.");
            return;
        }

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
            System.out.println("Element " + key + " deleted from the list.");
        }

        if (current == null) {
            System.out.println("Element " + key + " not found in the list.");
        }
    }

    public void display() {
        Node current = this.head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("Adding elements to the list...");
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();

        System.out.println("\nDeleting element 30...");
        list.delete(30);
        list.display();

        System.out.println("\nDeleting head element 10...");
        list.delete(10);
        list.display();

        System.out.println("\nTrying to delete an element that doesn't exist (50)...");
        list.delete(50);
        list.display();
    }
}