package DataStructures.LinkedList;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {

    }

    public void add(String data) {
        Node tmp = new Node(data);
        if (head == null) {
            head = tmp;
            tail = head;
        } else {
            tail.next = tmp;
            tail = tail.next;
        }
    }

    public void remove(String data) {
        Node previous = head;
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current == this.head) {
                    head = current.next;
                }
                previous.next = current.next;
            }
            previous = current;
            current = current.next;
        }
    }

    public String eliPleaseShtokAndPrint() {
        return this.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node pointer = head;
        while (pointer != null) {
            sb.append(pointer).append(", ");
            pointer = pointer.next;
        }
        return sb.toString();
    }

    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this(data, null);
        }

        public Node(String data, Node node) {
            this.data = data;
            this.next = node;
        }

        public String toString() {
            return data;
        }

    }

    public static void main(java.lang.String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Avraham");
        linkedList.add("Moshe");
        linkedList.add("Sara");
        linkedList.add("Itzhak");
        linkedList.add("Itzhak");
        linkedList.add("Yakov");
        System.out.println(linkedList.eliPleaseShtokAndPrint());
        linkedList.remove("Avraham");
        System.out.println(linkedList.eliPleaseShtokAndPrint());
    }
}

