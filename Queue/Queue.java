import java.util.NoSuchElementException;
/**
 * Queue class
 * 
 * Queue is a queue data structure implemented as a linked-list
 * Queue class contains the head and tail of the Queue
 * and a set of queue operations
 * Queue class contains an inner class called Node,
 *  to store reference to another Queue item
 * @version 0.0.0.1
 * 
 */
public class Queue{
    //front of the queue
    private Node head;
    //end of the queue
    private Node tail;
    //size of the queue
    private int length;


    /**
     * Queue contructor 
     * constructor initialises an empty queue
     */
    public Queue(){
        head = null;
        tail = null;
        length = 0;
    }
    

    /**
     * Node class
     * Contains constructor for a Node object
     * Contains a String private member variable called key
     * Contains a Node private memeber varibles called next 
     */
    private class Node{
        private String key;
        private Node next;

        /**
         * Node Constructor
         * Initilises a Node object to the key passed in, with next set to null
         * @param s, The key value of the Node being constructed
         */
        public Node(String s){
            this.key = s;
            this.next = null;
        }

    }


    /**
     * enqueue
     * Adds a String to the queue,
     * @param x, The string to be added to the queue
     * @throws IllegalArgumentException if the item being enqueued is empty or null or entirely consists of spaces
     */
    public void enqueue(String x){
        //if x is only spaces or empty throw an exception
        if(x == null || x.trim().isEmpty()){
            throw new IllegalArgumentException("Can only enqueue a non empty or null string");
        }
        //make a new node 
        Node newNode = new Node(x);

        //if the list is empty make head and tail point to newnode
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        //add it to the tail of the queue
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }


    /**
     * dequeue
     * Dequeues an item from the queue
     * @return String of the item dequeued from the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public String dequeue(){
        //If the list is empty throw an exception
        if(isEmpty()){
            throw new NoSuchElementException("The Queue is empty");
        }
        //remove the head item and return its value
        String item = head.key;
        head = head.next;
        length--;

        //if the list is now empty make tail null
        if(isEmpty()){
            tail = null;
        }
        return item;
    }


    /**
     * length
     * Gets the length of the queue from the private member variable
     * @return Int of the length of the queue
     */
    public int length(){
        return length;
    }


    /**
     * isEmpty
     * Check to see if the queue is empty
     * 
     * @return True if the list is empty, false otherwise
     */
    public boolean isEmpty(){
        return head == null;
    }
    

    /**
     * peek
     * Shows the item at the front of the queue
     * @return String of the key of the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public String peek(){
        //throw an exception if the queue is empty
        if(isEmpty()){
            throw new NoSuchElementException("The Queue is empty");
        }
        return head.key;
    }

    
    /**
     * dump
     * Prints the key of each item in the queue to the standard output
     */
    public void dump(){
        //print Empty only when the list is empty
        if(head == null){
            System.out.println("Empty");
            return;
        }
        //print all items to the standard output
        Node curr = head;
        while(curr != null){
            System.out.println(curr.key);
            curr = curr.next;
        }
    }
}
