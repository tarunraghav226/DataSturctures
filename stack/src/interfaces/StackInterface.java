package interfaces;

public interface StackInterface<T> {
    /**
     * Inserts an object in stack.
     * @param obj The object which is to be inserted.
     * @return Returns status 0 for successful push else -1 for unsuccess.
     */
    int push(T obj);

    /**
     * Removes an object from stack.
     * @return Returns the removed object from stack.
     */
    T pop();
}
