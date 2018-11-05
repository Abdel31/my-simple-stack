package deqo.abou.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack implements  SimpleStack{
    private int size;
    private ArrayList<Item> pile;

    Stack() {
        this.size = 0;
        this.pile = new ArrayList<Item>();
    }
    @Override
    public boolean isEmpty() {
        return (this.size==0);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void push(Item val) {
        this.size += 1;
        this.pile.add(val);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (pile.isEmpty()){
            throw new EmptyStackException();
        }
        else
             return (pile.get(this.size-1));
    }

    @Override
    public Item pop() throws EmptyStackException {
        if(pile.isEmpty()) {
           throw new EmptyStackException();
        }
        else {
            Item head = pile.get(size - 1);
            this.pile.remove(size - 1);
            this.size -= 1;
            return head;
        }

    }

}
