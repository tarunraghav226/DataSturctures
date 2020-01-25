package stack;

import interfaces.StackInterface;

public class Stack<T> implements StackInterface<T> {
    private T[] stack;
    private int size;
    private int stackPointer;

    public Stack(){
        stackPointer=-1;
    }

    public void setSize(int size){this.size=size;}

    public T[] getStack(){
        return stack;
    }

    @Override
    public void push(T obj){
        if(isEmptySpaceAvailable()){
            stackPointer+=1;
            stack[stackPointer]=obj;
            return;
        }
        System.out.println("!!!Stack Overflow!!!");
    }

    @Override
    public T pop(){
        if(isDataAvailable()){
            stackPointer--;
            return stack[stackPointer+1];
        }
        return null;
    }

    /**
     * Checks whether the stack is having one empty space.
     * @return Returns the boolean true if stack is having at least one empty space else boolean false.
     */
    private boolean isEmptySpaceAvailable(){
        return stackPointer!=size-1;
    }

    /**
     * Checks whether the stack contains at least one data.
     * @return Returns boolean true if stack is having at least one data in it else boolean false.
     */
    boolean isDataAvailable(){
        return stackPointer>-1;
    }
}
