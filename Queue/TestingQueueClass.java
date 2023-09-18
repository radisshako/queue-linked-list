import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertThrows;

import java.io.*;
import java.util.NoSuchElementException;
/**
 * test class
 * 
 * test is a test class of the Queue class
 * contains a set of junit tests for each method of Queue class
 * @version 0.0.0.1
 */
public class TestingQueueClass{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    
    @BeforeEach
    /**
     * setOut 
     * Redirects standard output to a print stream
     */
    public void setOut(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    /**
     * enqueueTest_Empty_Dump
     * Tests the enqueue method of the Queue class, on an empty queue with a dependency on dump()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with an empty queue, dependant on dump()")
    void enqueueTest_Empty_Dump(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("a");
        queue.dump();
        String actual = outputStreamCaptor.toString().trim();
        //Assert
        Assertions.assertEquals(actual, "a");
    }

    /**
     * enqueueTest_Empty_Peek
     * Tests the enqueue method of the Queue class, on an empty queue with a dependency on peek()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with an empty queue, dependant on peek()")
    void enqueueTest_Empty_Peek(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("a");
        String actual = queue.peek();
        //Assert
        Assertions.assertEquals(actual, "a");
    }

    /**
     * enqueueTest_Empty_Peek
     * Tests the enqueue method of the Queue class, on an empty queue with a dependency on length()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with an empty queue, dependant on length()")
    void enqueueTest_Empty_Length(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("a");
        int actual = queue.length();
        //Assert
        Assertions.assertEquals(actual, 1);
    }




    





    /**
     * enqueueTest_One_Dump
     * Tests the enqueue method of the Queue class, on a queue with one item, with a dependency on dump()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with one item in queue, dependant on dump()")
    void enqueueTest_One_Dump(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("a");
        queue.enqueue("b");
        queue.dump();
        String actual = outputStreamCaptor.toString().trim();
        //Assert
        Assertions.assertEquals(actual, "a\nb");
    }

    /**
     * enqueueTest_One_Peek
     * Tests the enqueue method of the Queue class, on a queue with one item, with a dependency on peek()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with one item in the queue, dependant on peek()")
    void enqueueTest_One_Peek(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("a");
        queue.enqueue("b");
        String actual = queue.peek();
        //Assert
        Assertions.assertEquals(actual, "a");
    }

    /**
     * enqueueTest_One_Length
     * Tests the enqueue method of the Queue class, on a queue with one item, with a dependency on length()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with one item in the queue, dependant on length()")
    void enqueueTest_One_Length(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("a");
        queue.enqueue("b");
        int actual = queue.length();
        //Assert
        Assertions.assertEquals(actual, 2);
    }






    /**
     * enqueueTest_Two_Dump
     * Tests the enqueue method of the Queue class, on a queue with one item, with a dependency on dump()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with two items in queue, dependant on dump()")
    void enqueueTest_Two_Dump(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.dump();
        String actual = outputStreamCaptor.toString().trim();
        //Assert
        Assertions.assertEquals(actual, "a\nb\nc");
    }

    /**
     * enqueueTest_Two_Peek
     * Tests the enqueue method of the Queue class, on a queue with one item, with a dependency on peek()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with two items in the queue, dependant on peek()")
    void enqueueTest_Two_Peek(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        String actual = queue.peek();
        //Assert
        Assertions.assertEquals(actual, "a");
    }

    /**
     * enqueueTest_Two_Length
     * Tests the enqueue method of the Queue class, on a queue with one item, with a dependency on length()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with two items in the queue, dependant on length()")
    void enqueueTest_Two_Length(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        int actual = queue.length();
        //Assert
        Assertions.assertEquals(actual, 3);
    }












    /**
     * enqueueTest_Many_Dump
     * Tests the enqueue method of the Queue class, on a queue with many items(with larger string sizes), with a dependency on dump()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test Enqueue Method with many items in queue(also adding larger string), dependant on dump()")
    void enqueueTest_Many_Dump(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("aaaaaaa");
        queue.enqueue("bbbbbbb");
        queue.enqueue("ccccccc");
        queue.enqueue("ddddddd");
        queue.enqueue("eeeeeee");
        queue.enqueue("fffffff");
        queue.enqueue("ggggggg");
        queue.enqueue("hhhhhhh");
        queue.enqueue("iiiiiii");
        queue.dump();
        String actual = outputStreamCaptor.toString().trim();
        //Assert
        Assertions.assertEquals(actual, "aaaaaaa\nbbbbbbb\nccccccc\nddddddd\neeeeeee\nfffffff\nggggggg\nhhhhhhh\niiiiiii");
    }

    /**
     * enqueueTest_Many_Peek
     * Tests the enqueue method of the Queue class, on a queue with many items(with larger string sizes), with a dependency on peek()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test Enqueue Method with many items in the queue, dependant on peek()")
    void enqueueTest_Many_Peek(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");
        queue.enqueue("f");
        queue.enqueue("g");
        queue.enqueue("h");
        queue.enqueue("i");
        String actual = queue.peek();
        //Assert
        Assertions.assertEquals(actual, "a");
    }

    /**
     * enqueueTest_Many_Length
     * Tests the enqueue method of the Queue class, on a queue with many items(with larger string sizes), with a dependency on length()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test Enqueue Method with many items in the queue, dependant on length()")
    void enqueueTest_Many_Length(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");
        queue.enqueue("f");
        queue.enqueue("g");
        queue.enqueue("h");
        queue.enqueue("i");
        int actual = queue.length();
        //Assert
        Assertions.assertEquals(actual, 9);
    }








    /**
     * enqueueTest_EmptyString_Exception
     * Tests the enqueue method of the Queue class, by enqueueing an empty string, checks that an IllegalArgumentException is thrown
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with an empty string, checks if exception is thrown")
    void enqueueTest_EmptyString_Exception(){
        //Arrange
        Queue queue = new Queue();
        //Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,() ->  queue.enqueue(""));
        String actual = exception.getMessage();
        //Assert
        Assertions.assertEquals(actual, "Can only enqueue a non empty or null string");
    }

    /**
     * enqueueTest_EmptyString_Length
     * Tests the enqueue method of the Queue class, by enqueueing an empty string, checks that the length doesnt change, depends on length()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with an empty string, checks if length remains unchanged, dependent on length()")
    void enqueueTest_EmptyString_Length(){
        //Arrange
        Queue queue = new Queue();
        //Act
        assertThrows(IllegalArgumentException.class, () -> queue.enqueue(""));
        int actual = queue.length();
        //Assert
        Assertions.assertEquals(actual, 0);
    }

    /**
     * enqueueTest_EmptyString_IsEmpty
     * Tests the enqueue method of the Queue class, by enqueueing an empty string, checks that the queue remains empty, depends on isEmpty()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with an empty string, checks if queue is still empty, dependent on isEmpty()")
    void enqueueTest_EmptyString_IsEmpty(){
        //Arrange
        Queue queue = new Queue();
        //Act
        assertThrows(IllegalArgumentException.class, () -> queue.enqueue(""));
        boolean actual = queue.isEmpty();
        //Assert
        Assertions.assertEquals(actual, true);
    }










    /**
     * enqueueTest_NullString_Exception
     * Tests the enqueue method of the Queue class, by enqueueing a null string, checks that an IllegalArgumentException is thrown
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with a null string, checks if exception is thrown")
    void enqueueTest_NullString_Exception(){
        //Arrange
        Queue queue = new Queue();
        //Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,() -> queue.enqueue(null));
        String actual = exception.getMessage();
        //Assert
        Assertions.assertEquals(actual, "Can only enqueue a non empty or null string");
    }

    /**
     * enqueueTest_NullString_Length
     * Tests the enqueue method of the Queue class, by enqueueing a null string, checks that the length is 0, depends on length()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with a null string, checks if length remains unchanged, dependent on length()")
    void enqueueTest_NullString_Length(){
        //Arrange
        Queue queue = new Queue();
        //Act
        assertThrows(IllegalArgumentException.class, () -> queue.enqueue(null));
        int actual = queue.length();
        //Assert
        Assertions.assertEquals(actual, 0);
    }

    /**
     * enqueueTest_NullString_isEmpty
     * Tests the enqueue method of the Queue class, by enqueueing a null string, checks that the queue remains empty, depends on isEmpty()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with a null string, checks if queue is still empty, dependent on isEmpty()")
    void enqueueTest_NullString_IsEmpty(){
        //Arrange
        Queue queue = new Queue();
        //Act
        assertThrows(IllegalArgumentException.class, () -> queue.enqueue(null));
        boolean actual = queue.isEmpty();
        //Assert
        Assertions.assertEquals(actual, true);
    }





    /**
     * enqueueTest_TrailingSpace_Peek()
     * Tests the enqueue method of the Queue class, by enqueueing a string with a leading and trailing space,
     *  checks that the string after being enqueued is the same, depends on peek()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with trailing and leading spaces, checks if spaces exist as they were entered")
    void enqueueTest_TrailingSpace_Peek(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue(" a ");
        String actual = queue.peek();
        //Assert
        Assertions.assertEquals(actual, " a ");
    }

    /**
     * enqueueTest_TrailingSpace_Length()
     * Tests the enqueue method of the Queue class, by enqueueing a string with a leading and trailing space,
     *  checks that the length of the queue increments by 1, depends on length()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with trailing and leading spaces, checks if queue length has increased")
    void enqueueTest_TrailingSpace_Length(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("  a  ");
        int actual = queue.length();
        //Assert
        Assertions.assertEquals(actual, 1);
    }






    /**
     * enqueueTest_InternalSpace_Peek()
     * Tests the enqueue method of the Queue class, by enqueueing a string with internal spaces,
     *  checks that the string after being enqueued is the same, depends on peek()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with internal spaces, checks if spaces exits as they were entered")
    void enqueueTest_InternalSpace_Peek(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("ab cd  ef");
        String actual = queue.peek();
        //Assert
        Assertions.assertEquals(actual, "ab cd  ef");
    }
    /**
     * enqueueTest_InternalSpace_Length()
     * Tests the enqueue method of the Queue class, by enqueueing a string with internal spaces,
     *  checks that the length is incremented by 1, depends on length()
     * @see Queue#enqueue(String)
     * 
     */
    @Test
    @DisplayName("Test enqueue Method with internal spaces, checks if queue length has increased")
    void enqueueTest_InternalSpace_Length(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("ab cd  ef");
        int actual = queue.length();
        //Assert
        Assertions.assertEquals(actual, 1);
    }










    
    /**
     * lengthTest_Empty()
     * Tests the length method of the Queue class when the queue is empty,
     * checks if the length remains zero
     * @see Queue#length()
     * 
     */
    @Test
    @DisplayName("Test length method when the queue is empty")
    void lengthTest_Empty(){
        //Arrange & Act
        Queue queue = new Queue();
        //Assert
        Assertions.assertEquals(queue.length(), 0);
    }

    /**
     * lengthTest_One()
     * Tests the length method of the Queue class when the queue has one item,
     * checks if the length is 1, depends on enequeue
     * @see Queue#length()
     * 
     */
    @Test
    @DisplayName("Test length method when the queue has one item, dependent on enqueue")
    void lengthTest_One(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        //Assert
        Assertions.assertEquals(queue.length(), 1);
    }

    /**
     * lengthTest_Many()
     * Tests the length method of the Queue class when the queue has many items,
     * checks if the length increments by 1, depends on enequeue
     * @see Queue#length()
     * 
     */
    @Test
    @DisplayName("Test length method when the queue has many items, dependent on enqueue")
    void lengthTest_Many(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");
        //Assert
        Assertions.assertEquals(queue.length(), 5);
    }

    /**
     * lengthTest_Dequeue()
     * Tests the length method of the Queue class after the queue has some items dequeued
     * checks if the length decrements by 1 each time, depends on enqueue and dequeue
     * @see Queue#length()
     * 
     */
    @Test
    @DisplayName("Test length method when the queue has many items and some are dequeued, dependent on enqueue and dequeue")
    void lengthTest_Dequeue(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        //Assert
        Assertions.assertEquals(queue.length(), 2);
    }

    /**
     * lengthTest_DequeueAll()
     * Tests the length method of the Queue class after the queue has all items dequeued
     * checks if the length is zero, depends on enqueue and dequeue
     * @see Queue#length()
     * 
     */
    @Test
    @DisplayName("Test length method when the queue has many items and all are dequeued, dependent on enqueue and dequeue")
    void lengthTest_DequeueAll(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        //Assert
        Assertions.assertEquals(queue.length(), 0);
    }











   
    /**
     * isEmptyTest_Empty()
     * Tests the isEmpty method when the queue is empty,
     * checks that it returns true 
     * @see Queue#isEmpty()
     * 
     */
    @Test
    @DisplayName("Test isEmpty method when the queue is empty")
    void isEmptyTest_Empty(){
        //Arrange
        Queue queue = new Queue();
        //Act
        boolean actual = queue.isEmpty();
        //Assert
        Assertions.assertEquals(actual, true);
    }

    /**
     * isEmptyTest_One()
     * Tests the isEmpty method when the queue has one item,
     * checks that it returns false, dependent on enqueue
     * @see Queue#isEmpty()
     * 
     */
    @Test
    @DisplayName("Test isEmpty method when the queue has one item, dependant on enqueue")
    void isEmptyTest_One(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abcd");
        boolean actual = queue.isEmpty();
        //Assert
        Assertions.assertEquals(actual, false);
    }

    /**
     * isEmptyTest_EnqueueDequeue()
     * Tests the isEmpty method when the queue has one item enqueued then dequeued,
     * checks that it returns true, depends on enqueue() and dequeue()
     * @see Queue#isEmpty()
     * 
     */
    @Test
    @DisplayName("Test isEmpty method when the queue has item enqueued then dequeued, dependent on enqueue and dequeue")
    void isEmptyTest_EnqueueDequeue(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abcd");
        queue.dequeue();
        boolean actual = queue.isEmpty();
        //Assert
        Assertions.assertEquals(actual, true);
    }

    /**
     * isEmptyTest_EnqueueDequeue_Partial()
     * Tests the isEmpty method when the queue has many items enqueued then some but not all dequeued,
     * checks that it returns true, depends on enqueue() and dequeue()
     * @see Queue#isEmpty()
     * 
     */
    @Test
    @DisplayName("Test isEmpty method when the queue has items enqueued then some items are dequeued, dependent on enqueue and dequeue")
    void isEmptyTest_EnqueueDequeue_Partial(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        boolean actual = queue.isEmpty();
        //Assert
        Assertions.assertEquals(actual, true);
    }

    /**
     * isEmptyTest_EnqueueDequeue_Full()
     * Tests the isEmpty method when the queue has many items enqueued then all of them dequeued,
     * checks that it returns false, depends on enqueue() and dequeue()
     * @see Queue#isEmpty()
     * 
     */
    @Test
    @DisplayName("Test isEmpty method when the queue has items enqueued then all fully dequeued, dependent on enqueue and dequeue")
    void isEmptyTest_EnqueueDequeue_Full(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        boolean actual = queue.isEmpty();
        //Assert
        Assertions.assertEquals(actual, false);
    }
    
    







    
    /**
     * peekTest_Empty()
     * Tests the peek method on an empty queue, checks that NoSuchElementException is thrown
     * @see Queue#peek()
     * 
     */
    @Test
    @DisplayName("Test peek() method when the queue is empty")
    void peekTest_Empty(){
        //Arrange
        Queue queue = new Queue();
        //Act
        NoSuchElementException exception = Assertions.assertThrows(NoSuchElementException.class, () -> queue.peek());
        //Assert
        Assertions.assertEquals("The Queue is empty", exception.getMessage());
    }

    /**
     * peekTest_OneItem()
     * Tests the peek method on a queue with one item, checks that the only item enqueued is returned,
     * depends on enqueue
     * @see Queue#peek()
     * 
     */
    @Test
    @DisplayName("Test peek() method when the queue has  one item, dependent on enqueue")
    void peekTest_OneItem(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        String actual = queue.peek();
        //Assert
        Assertions.assertEquals(actual, "abc");
    }

    /**
     * peekTest_ManyItems()
     * Tests the peek method on a queue with many items, checks that the front of the queue is returned
     * depends on enqueue
     * @see Queue#peek()
     * 
     */
    @Test
    @DisplayName("Test peek() method when the queue has many items, dependent on enqueue ")
    void peekTest_ManyItems(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        String actual = queue.peek();
        //Assert
        Assertions.assertEquals(actual, "abc");
    }

    /**
     * peekTest_MultipleCalls()
     * Tests the peek method with multiple calls, checks that the front of the queue is returned each time,
     * depends on enqueue()
     * @see Queue#peek()
     * 
     */
    @Test
    @DisplayName("Test peek() method when the peek method is called multiple times, dependent on enqueue")
    void peekTest_MultipleCalls(){
        //Arrange
        Queue queue = new Queue();
        //Act
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        String actual1 = queue.peek();
        String actual2 = queue.peek();
        String actual3 = queue.peek();
        Assertions.assertEquals(actual1, "abc");
        Assertions.assertEquals(actual2, "abc");
        Assertions.assertEquals(actual3, "abc");
    }















    /**
     * dequeueTest_EmptyThrown()
     * Tests the dequeue method on an empty queue, checks that a NoSuchElementException is thrown
     * @see Queue#dequeue()
     * 
     */
    @Test
    @DisplayName("Test dequeue() method when the queue is empty, checks if NoSuchElement exception is thrown")
    void dequeueTest_EmptyThrown(){
        //Arrange
        Queue queue = new Queue();
        //Act & Assert
        Assertions.assertThrows(NoSuchElementException.class, () -> queue.dequeue());
        
    }
    



    /**
     * dequeueTest_One()
     * Tests the dequeue method on a queue with one item in it, checks that the only string enqueued is returned,
     * depends on enqueue()
     * @see Queue#dequeue()
     * 
     */
    @Test
    @DisplayName("Test dequeue() method when the queue has one item, dependant on enqueue(), checks if enqueued string is returned")
    void dequeueTest_One(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        String actual = queue.dequeue();
        //Assert
        Assertions.assertEquals(actual, "abc");
    }
    

    /**
     * dequeueTest_One_Length()
     * Tests the dequeue method on a queue with one item in it, checks that the length is zero,
     * depends on length() and enqueue()
     * @see Queue#dequeue()
     * 
     */
    @Test
    @DisplayName("Test dequeue() method when the queue has one item, dependant on enqueue() and length(), should check dequeue decrements length by 1")
    void dequeueTest_One_Length(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.dequeue();
        int actual = queue.length();
        //Assert
        Assertions.assertEquals(actual, 0);
    }

    /**
     * dequeueTest_One_IsEmpty()
     * Tests the dequeue method on a queue with one item in it, checks that isEmpty returns true,
     * depends on length() and enqueue()
     * @see Queue#dequeue()
     * 
     */
    //Dequeue from a queue with one item in it
    @Test
    @DisplayName("Test dequeue() method when the queue has one item, dependant on enqueue() and isEmpty, should check that isEmpty returns true")
    void dequeueTest_One_IsEmpty(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.dequeue();
        boolean actual = queue.isEmpty();
        //Assert
        Assertions.assertEquals(actual, true);
    }




    /**
     * dequeueTest_Many()
     * Tests the dequeue method on a queue with many items in it, checks that the front of the queue is returned
     * depends on enqueue()
     * @see Queue#dequeue()
     * 
     */
    @Test
    @DisplayName("Test dequeue() method when the queue has many items, and dequeue is called once, dependant on enqueue(), checks if first enqueued string is returned")
    void dequeueTest_Many(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");
        String actual = queue.dequeue();
        //Assert
        Assertions.assertEquals(actual, "abc");
    }

    /**
     * dequeueTest_Many_Length()
     * Tests the dequeue method on a queue with many items in it, and dequeue is called once,
     *  checks that the length is decremented by one,
     * depends on enqueue() and length()
     * @see Queue#dequeue()
     * 
     */
    @Test
    @DisplayName("Test dequeue() method when the queue has many items, and dequeue is called once, dependant on enqueue() and length(), should check dequeue decrements length by 1")
    void dequeueTest_Many_Length(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");
        queue.dequeue();
        int actual = queue.length();
        //Assert
        Assertions.assertEquals(actual, 4);
    }

    /**
     * dequeueTest_Many_IsEmpty()
     * Tests the dequeue method on a queue with many items in it, and dequeue is called once, 
     * Checks that isEmpty returns false, 
     * Depends on enqueue() and isEmpty()
     * @see Queue#dequeue()
     * 
     */
    @Test
    @DisplayName("Test dequeue() method when the queue has many items, and dequeue is called once, dependant on enqueue() and isEmpty, should check that isEmpty returns false")
    void dequeueTest_Many_IsEmpty(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");
        queue.dequeue();
        boolean actual = queue.isEmpty();
        //Assert
        Assertions.assertEquals(actual, false);
    }







    
    /**
     * dequeueTest_Multiple()
     * Tests the dequeue method when the queue has many items, and dequeue is called multiple times,  
     * Checks if the front of the queue string is returned ,
     * Dependant on enqueue()
     * @see Queue#dequeue()
     * 
     */
    @Test
    @DisplayName("Test dequeue() method when the queue has many items, and dequeue is called multiple times, dependant on enqueue(), checks if the front of the queue string is returned")
    void dequeueTest_Multiple(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        String actual = queue.dequeue();
        //Assert
        Assertions.assertEquals(actual, "jkl");
    }

    /**
     * dequeueTest_Multiple_length()
     * Tests the dequeue method when the queue has many items, and dequeue is called multiple times,  
     * Checks if the length is accurately decremented,
     * Dependant on enqueue() and length()
     * @see Queue#dequeue()
     * 
     */
    @Test
    @DisplayName("Test dequeue() method when the queue has many items, and dequeue is called multiple times, dependant on enqueue() and length(), should check dequeue decrements length by 1 each time")
    void dequeueTest_Multiple_Length(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        int actual = queue.length();
        //Assert
        Assertions.assertEquals(actual, 1);
    }
    

    /**
     * dequeueTest_Multiple_IsEmpty()
     * Tests the dequeue method when the queue has many items, and dequeue is called multiple times,  
     * Checks if isEmpty remains false,
     * Dependant on enqueue() and isEmpty()
     * @see Queue#dequeue()
     * 
     */
    @Test
    @DisplayName("Test dequeue() method when the queue has many items, and dequeue is called multiple times, dependant on enqueue() and isEmpty, should check that isEmpty returns false")
    void dequeueTest_Multiple_IsEmpty(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        boolean actual = queue.isEmpty();
        //Assert
        Assertions.assertEquals(actual, false);
    }




    /**
     * dequeueTest_Fully_Empty()
     * Tests the dequeue method when the queue has many items, and dequeue is called repeatedly until the queue is empty, 
     * Checks if the front of the queue is returned,
     * Dependant on enqueue() 
     * @see Queue#dequeue()
     * 
     */
    @Test
    @DisplayName("Test dequeue() method when the queue has many items, and dequeue is called repeatedly until the queue is empty, dependant on enqueue(), checks if the front of the queue string is returned")
    void dequeueTest_Fully_Empty(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        String actual = queue.dequeue();
        //Assert
        Assertions.assertEquals(actual, "mno");
    }
    

    /**
     * dequeueTest_Fully_Empty_Length()
     * Tests the dequeue method when the queue has many items, and dequeue is called repeatedly until the queue is empty, 
     * Checks if the length is zero, 
     * Dependant on enqueue() and length()
     * @see Queue#dequeue()
     * 
     */
    @Test
    @DisplayName("Test dequeue() method when the queue has many items, and dequeue is called repeatedly until the queue is empty, dependant on enqueue() and length(), should check dequeue decrements length by 1 each time")
    void dequeueTest_Fully_Empty_Length(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        int actual = queue.length();
        //Assert
        Assertions.assertEquals(actual, 0);
    }

    /**
     * dequeueTest_Fully_Empty_IsEmpty()
     * Tests the dequeue method when the queue has many items, and dequeue is called repeatedly until the queue is empty, 
     * Checks if the list is empty is true,
     * Dependant on enqueue() and isEmpty()
     * @see Queue#dequeue()
     * 
     */
    @Test
    @DisplayName("Test dequeue() method when the queue has many items, and dequeue is called repeatedly until the queue is empty, dependant on enqueue() and isEmpty, should check that isEmpty returns true")
    void dequeueTest_Fully_Empty_IsEmpty(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        boolean actual = queue.isEmpty();
        //Assert
        Assertions.assertEquals(actual, true);
    }









    /**
     * dumpTest_ Empty()
     * Tests the dump method with an empty queue, 
     * Checks if string Empty is the output
     * @see Queue#dump()
     * 
     */
    @Test
    @DisplayName("Test dump Method with an empty queue, checks if string Empty is the output")
    void dumpTest_Empty(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.dump();
        String actual = outputStreamCaptor.toString().trim();
        //Assert
        Assertions.assertEquals(actual, "Empty");
    }


    /**
     * dumpTest_ One()
     * Tests the dump method with a queue with one item in it,  
     * Checks if item enqueued is the output, 
     * Depends on enqueue() 
     * @see Queue#dump()
     * 
     */
    @Test
    @DisplayName("Test dump method on a queue with one element, checks if item enqueued is the output, depends on enqueue")
    void dumpTest_One(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.dump();
        String actual = outputStreamCaptor.toString().trim();
        //Assert
        Assertions.assertEquals(actual, "abc");
    }

    /**
     * dumpTest_ Many()
     * Tests the dump method with a queue with many items in it,  
     * Checks if all items enqueued are in the output, 
     * Depends on enqueue() 
     * @see Queue#dump()
     * 
     */
    @Test
    @DisplayName("Test dump method on a queue with many elements, checks if all items enqueued are in the output, depends on enqueue")
    void dumpTest_Many(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");
        queue.dump();
        String actual = outputStreamCaptor.toString().trim();
        //Assert
        Assertions.assertEquals(actual, "abc\ndef\nghi\njkl\nmno");
    }
    
    /**
     * dumpTest_ Dequeue()
     * Tests the dump method on a queue after dequeue has been called multiple times,
     * Checks if all items remaining are in the output, 
     * Depends on enqueue and dequeue 
     * @see Queue#dump()
     * 
     */
    @Test
    @DisplayName("Test dump method on a queue after dequeue has been called multiple times, checks if all items remaining are in the output, depends on enqueue and dequeue")
    void dumpTest_Dequeue(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dump();
        String actual = outputStreamCaptor.toString().trim();
        //Assert
        Assertions.assertEquals(actual, "jkl\nmno");
    }


    /**
     * dumpTest_ Spaces()
     * Tests the dump method on a queue if the string contain trailing or leading spaces as well as internal spaces,
     * Checks if all items are unchanged in the output
     * Depends on enqueue() 
     * @see Queue#dump()
     * 
     */
    //Test dump method on a queue if the string contain trailing or leading spaces as well as internal spaces, checks if all items are unchanged in the output, depends on enqueue
    @Test
    @DisplayName("Test dump method on a queue if the string contain trialing or leading spaces as well as internal spaces, checks if all items are unchanged in the output, depends on enqueue ")
    void dumpTest_Spaces(){
        //Arrange
        Queue queue = new Queue();
        //Act
        queue.enqueue(" abc");
        queue.enqueue("def ");
        queue.enqueue("g hi");
        queue.enqueue(" j k l");
        queue.dump();
        String actual = outputStreamCaptor.toString();
        //Assert
        Assertions.assertEquals(actual, " abc\ndef \ng hi\n j k l\n");
    }

}
