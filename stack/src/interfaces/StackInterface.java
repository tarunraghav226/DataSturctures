package interfaces;

public interface StackInterface<T> {
    /**
     * Returns the stack.
     */
    T[] getStack();

    /**
     * Inserts an object in stack.
     * @param obj The object which is to be inserted.
     */
    void push(T obj);

    /**
     * Removes an object from stack.
     * @return Returns the removed object from stack.
     */
    T pop();

    /**
     * Checks whether the stack is having one empty space.
     * @return Returns the boolean true if stack is having at least one empty space else boolean false.
     */
    boolean isEmptySpaceAvailable();

    /**
     * Checks whether the stack contains at least one data.
     * @return Returns boolean true if stack is having at least one data in it else boolean false.
     */
    boolean isDataAvailable();
}
