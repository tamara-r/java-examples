package test;

import linked_list.LinkedListClass;

import java.util.Collections;
import java.util.LinkedList;

import static linked_list.LinkedListClass.*;

public class Test {
    public static void main(String[] args) {
        // Start with the empty list
        LinkedListClass list = new LinkedListClass();

        list = insertToEnd(list, 1);
        list = insertToStart(list,2);
        list = insertToEnd(list, 3);
        list = insertToStart(list, 4);
        list = insertToEnd(list, 5);
        list = insertToStart(list, 6);
        list = insertToEnd(list, 7);
        list = insertToEnd(list, 8);


        printList(list);

        // Delete first node
        removeFirstNode(list);

        System.out.println("List after removing first element: ");
        printList(list);

        deleteAtPosition(list, 2);
        printList(list);

        deleteAtPosition(list, 10);
        printList(list);

        removeLastNode(list);
        System.out.println("List after removing last element: ");
        printList(list);

        list.sortList();
        System.out.println("List after sorting: ");
        printList(list);

        System.out.println("**************************************************");
        System.out.println("Using Java LinkedList Class");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.addFirst(2);
        linkedList.addLast(3);
        linkedList.addFirst(4);
        linkedList.add(5);
        linkedList.addFirst(6);
        linkedList.addLast(7);
        linkedList.add(8);
        // methods add and addLast does the same

        System.out.println("Linked list: " + linkedList);

        linkedList.removeFirst();

        System.out.println("Linked list after removing first element: " + linkedList);

        int index = 2;
        linkedList.remove(index);
        System.out.println("Element at the position " + index + " is deleted");
        System.out.println("Linked list after removing element at the position " + index + ": " + linkedList);

        linkedList.removeLast();
        System.out.println("Linked list after removing last element: " + linkedList);

        Collections.sort(linkedList);
        System.out.println("List after sorting: " + linkedList);
    }
}
