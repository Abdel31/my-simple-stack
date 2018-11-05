package deqo.abou.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

    public class StackTest {
        Stack stackEmpty,stack ;
        @Before
        public void setUp () {
            stackEmpty = new Stack();
            stack = new Stack();
            Item i1 = new Item();
            stack.push(i1);

        }

        @Test

        public void testIsEmpty() throws Exception {
            assertTrue(stackEmpty.isEmpty());
            assertFalse(stack.isEmpty());
        }

        @Test
        public void testGetSize() throws Exception {
            assertEquals(stackEmpty.getSize(),0);
            assertEquals(stack.getSize(),1);
        }

        @Test
        public void testPeekNotEmptyStack() throws Exception {
            stack.peek();
            assertFalse(stack.isEmpty());
            assertEquals(stack.getSize(),1);
        }

        @Test ( expected = EmptyStackException.class )
        public void testPeekOnEmptyStack () throws EmptyStackException {

            stackEmpty.peek();
        }
        @Test
        public void testPopNotEmptyStack() throws Exception {
            stack.pop();
            assertTrue(stack.isEmpty());
            assertEquals(stack.getSize(),0);
        }

        @Test ( expected = EmptyStackException.class )
        public void testPopOnEmptyStack () throws EmptyStackException {

            stackEmpty.pop ();
        }

    }