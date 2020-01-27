package interfaces;

public interface LinkedListInterface<T> {

    /**
     * Inserts an object in linked list.
     *
     * @param obj The object which is to inserted in linked list.
     */
    void insertion(T obj);

    /**
     * Removes the given object from the linked list.
     *
     * @param obj The object which is to be removed from the linked list.
     */
    void deletion(T obj);

    /**
     * Searches the object in linked list.
     *
     * @param uniqueNumber It is the unique number by which object will be identified.
     * @return Returns the searched object.
     */
    T getObject(int uniqueNumber);

    /**
     * It updates the object of linked list.
     *
     * @param uniqueNumber It is the unique number by which object will be identified.
     */
    void update(int uniqueNumber);

    /**
     * It sorts the linked list.
     */
    void sort();
}