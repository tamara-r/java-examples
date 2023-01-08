package linked_list;

public class LinkedListClass {
    Node head; // head of list

    // Linked list Node
    // Changed Node class to static so the methods and main can access it
    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

        public Node() {}
    }

    public static LinkedListClass insertToStart(LinkedListClass list, int data) {
        // Creating newNode memory & assigning data value
        Node newNode = new Node(data);
        // assigning this newNode's next as current head node
        newNode.next = list.head;

        // re-assigning head to this newNode
        list.head = newNode;

        return list;
    }

    // Insert a new node to end
    public static LinkedListClass insertToEnd(LinkedListClass list, int data) {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node
            last.next = new_node;
        }
        // Return the list by head
        return list;
    }

    // Method to remove the first node of the linked list
    public static LinkedListClass removeFirstNode(LinkedListClass list) {
        if (list.head == null)
            return null;
        // Move the head pointer to the next node
        Node temp = list.head;
        list.head = list.head.next;

        return list;
    }

    // Method to remove the last node
    public static LinkedListClass removeLastNode(LinkedListClass list) {
        if (list.head == null)
            return null;

        if (list.head.next == null) {
            return null;
        }

        // Find the second last node
        Node second_last = list.head;
        while (second_last.next.next != null)
            second_last = second_last.next;

        // Change next of second last
        second_last.next = null;

        return list;
    }

    // Method to delete a node in the LinkedList by position
    public static LinkedListClass deleteAtPosition(LinkedListClass list, int index) {
        // Store head node
        Node currNode = list.head, prev = null;

        // CASE 1: If index is 0, then head node itself is to be deleted

        if (index == 0 && currNode != null) {
            list.head = currNode.next; // Changed head

            System.out.println("Element at the position " + index + " is deleted");

            return list;
        }


        // CASE 2: If the index is greater than 0 but less than the size of LinkedList

        int counter = 0;

        // Count for the index to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null) {

            if (counter == index) {
                // Since the currNode is the required position Unlink currNode from linked list
                prev.next = currNode.next;

                System.out.println("Element at the position " + index + " is deleted");
                break;
            }
            else {
                // If current position is not the index continue to next node
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        // CASE 3: The index is greater than the size of the LinkedList
        // In this case, the currNode should be null
        if (currNode == null) {
            System.out.println(index + " position element not found");
        }

        return list;
    }

    public void sortList() {

        // Node current will point to head
        Node current = head, index = null;

        int temp;

        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;

                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public static void printList(LinkedListClass list) {
        Node currNode = list.head;

        System.out.print("LinkedList: [ ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
        
        System.out.print("]\n");
    }
}
