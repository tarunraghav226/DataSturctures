package interfaces;

import node.PrimitiveNode;

public interface PrimitiveInterface {
    /**
     * Inserts an object in linked list.
     *
     * @param obj The object which is to inserted in linked list.
     */
    void insertion(PrimitiveNode obj);

    /**
     * Removes the given object from the linked list.
     *
     * @param data The data which is to be removed from the linked list.
     */
    void deletion(int data);

    /**
     * Searches the object in linked list.
     *
     * @param uniqueNumber It is the unique number by which object will be identified.
     * @return Returns the searched object.
     */
    PrimitiveNode getObject(int uniqueNumber);

    /**
     * It updates the object of linked list.
     *
     * @param uniqueNumber It is the unique number by which object will be identified.
     * @param newData      It is the new data which is to saved in object.
     */
    void update(int uniqueNumber, int newData);

    /**
     * It sorts the linked list.
     */
    void sort();
}
