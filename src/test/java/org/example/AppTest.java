package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{


    public void testStack()
    {
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertEquals(Integer.valueOf(1), stack.pop());
    }
}
