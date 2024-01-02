// Assignment: 4
// Author: Ram Nagid, ID: 318692779
package set;

/**
 * The SimpleSet class represents a simple implementation of a set.
 *
 * @param <E> the type of elements in the set
 */
public class SimpleSet<E> implements Set {
    private int capacity;
    private E elements[];
    private int size = 0;

    /**
     * Constructs a SimpleSet object with the specified capacity.
     *
     * @param capacity the initial capacity of the set
     */
    public SimpleSet(int capacity) {
        if (size == capacity) {
            capacity++;
        }
        this.capacity = capacity;
        this.elements = (E[]) new Object[capacity];
    }

    /**
     * Constructs a SimpleSet object with a default capacity of 5.
     */
    public SimpleSet() {
        capacity = 5;
        this.elements = (E[]) new Object[capacity];
    }

    /**
     * Returns the element at the specified index in the set.
     *
     * @param index the index of the element to retrieve
     * @return the element at the specified index
     */
    public E getElement(int index) {
        return elements[index];
    }

    /**
     * Adds the specified element to the set.
     *
     * @param e the element to be added
     */
    public void add(Object e) {
        if (size >= capacity) {
            capacity += 5;
            E[] arr = (E[]) new Object[capacity];
            for (int i = 0; i < elements.length; i++) {
                arr[i] = elements[i];
            }
            elements = (E[]) new Object[capacity];
            for (int i = 0; i < elements.length; i++) {
                elements[i] = arr[i];
            }
        }
        boolean cond = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == e) {
                cond = true;
            }
        }
        if (!cond) {
            elements[size] = (E) e;
            size++;
        }
    }

    /**
     * Removes the specified element from the set.
     *
     * @param element the element to be removed
     * @return true if the element was found and removed, false otherwise
     */
    public boolean remove(Object element) {
        boolean cond = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                E temp = (E) element;
                elements[elements.length - 1] = temp;
                elements[elements.length - 1] = null;
                elements[i] = null;
                for (int j = i; j < elements.length - 1; j++) {
                    if (j + 1 < elements.length) {
                        elements[j] = elements[j + 1];
                    }
                }
                cond = true;
                size--;
            }
        }
        return cond;
    }

    /**
     * Checks if the set contains the specified element.
     *
     * @param element the element to be checked
     * @return true if the set contains the element, false otherwise
     */
    public boolean contains(Object element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the size of the set.
     *
     * @return the number of elements in the set
     */
    public int size() {
        return size;
    }

    /**
     * Returns the elements in the set.
     */
    public void getSet() {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] );
            if (i!=elements.length-1){
                System.out.print( ",");
            }
        }
        System.out.println();
    }

    /**
     * Checks if the set is empty.
     *
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                return false;
            }
        }
        return true;
    }
}
