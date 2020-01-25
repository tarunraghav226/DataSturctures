package interfaces;

public interface StackInterface<T> {
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
}
