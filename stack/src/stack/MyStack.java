package stack;

import interfaces.StackInterface;

import java.lang.reflect.Array;

public class MyStack<T> implements StackInterface<T> {
    private T[] stack;
    private int size;
    private int stackPointer;

    @SuppressWarnings("unchecked")
    public MyStack(Class<T> tClass, int size) {
        stackPointer = -1;
        this.size = size;
        stack = (T[]) Array.newInstance(tClass, size);
    }

    public T[] getStack() {
        return stack;
    }

    @Override
    public int push(T obj) {
        if (isEmptySpaceAvailable()) {
            stackPointer += 1;
            stack[stackPointer] = obj;
            return 0;
        }
        return -1;
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
