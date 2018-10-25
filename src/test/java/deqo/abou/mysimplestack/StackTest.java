package deqo.abou.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void isEmpty() throws Exception {
        Stack s = new Stack();
        assertEquals(s.getSize(),0);
        s = new Stack();
        s.push(new Item());
        assertNotEquals(s.getSize(),0);
    }

    @Test
    public void getSize() throws Exception {
        Stack s = new Stack();
        assertEquals(s.getSize(),0);
        s = new Stack();
        s.push(new Item());
        assertEquals(s.getSize(),1);
    }

    @Test
    public void push() throws Exception {
        Stack s = new Stack();
        Item i=new Item();
        s.push(i);
        assertEquals(s.peek(),i);
    }

    @Test
    public void peek() throws Exception {
        Stack s = new Stack();
        Item i1=new Item();
        Item i2=new Item();
        Item i3=new Item();
        Item i4=new Item();
        s.push(i1);
        s.push(i2);
        assertEquals(s.peek(),i2);
        Stack d = new Stack();
        d.push(i4);
        s.push(i4);
        d.peek();
        assertFalse(d.isEmpty());
        assertEquals(d.peek(),s.peek());
    }

    @Test
    public void pop() throws Exception {
        Stack s = new Stack();
        Item i1=new Item();
        Item i2=new Item();
        s.push(i1);
        assertEquals(s.pop(),i1);
        assertTrue(s.isEmpty());
        s.push(i2);
        s.push(i1);
        s.pop();
        assertFalse(s.isEmpty());
        s.pop();
        assertEquals(s.pop(),null);
    }


}