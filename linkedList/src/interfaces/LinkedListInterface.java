package interfaces;

import node.MyNode;

public interface LinkedListInterface {

    /**
     * Inserts an object in linked list.
     *
     * @param obj The object which is to inserted in linked list.
     */
    void insertion(MyNode obj);

    /**
     * Removes the given object from the linked list.
     *
     * @param obj The object which is to be removed from the linked list.
     */
    void deletion(MyNode obj);

    /**
     * Searches the object in linked list.
     *
     * @param uniqueNumber It is the unique number by which object will be identified.
     * @return Returns the searched object.
     */
    MyNode getObject(int uniqueNumber);

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