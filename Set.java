// Assignment: 4
// Author: Ram Nagid, ID: 318692779
package set;

/**
 * The Set interface represents a collection that contains no duplicate elements.
 *
 * @param <E> the type of elements in the set
 */
public interface Set<E> {

    /**
     * Adds the specified element to the set if it is not already present.
     *
     * @param element the element to be added
     */
    void add(E element);

    /**
     * Removes the specified element from the set if it is present.
     *
     * @param element the element to be removed
     */
    boolean remove(E element);

    /**
     * Checks if the set contains the specified element.
     *
     * @param element the element to be checked
     * @return true if the set contains the element, false otherwise
     */
    boolean contains(E element);

    /**
     * Returns the number of elements in the set.
     *
     * @return the number of elements in the set
     */
    int size();

    /**
     * Checks if the set is empty.
     *
     * @return true if the set is empty, false otherwise
     */
    boolean isEmpty();
}