// Assignment: 4
// Author: Ram Nagid, ID: 318692779
package set;

/**
 * The SetUtils class provides utility methods for working with sets.
 *
 * @param <E> the type of elements in the sets
 */
public class SetUtils<E> {

    /**
     * Computes the union of two sets.
     *
     * @param set1 the first set
     * @param set2 the second set
     * @return a new set that contains all elements from both sets
     */
    public static SimpleSet union(SimpleSet set1, SimpleSet set2) {
        SimpleSet unionSet = new SimpleSet(set1.size() + set2.size());
        for (int i = 0; i <= set1.size(); i++) {
            unionSet.add(set1.getElement(i));
        }
        for (int i = 0; i <= set2.size(); i++) {
            unionSet.add(set2.getElement(i));
        }
        return unionSet;
    }

    /**
     * Computes the intersection of two sets.
     *
     * @param set1 the first set
     * @param set2 the second set
     * @return a new set that contains elements present in both sets
     */
    public static SimpleSet intersection(SimpleSet set1, SimpleSet set2) {
        SimpleSet intersectionSet = new SimpleSet(set1.size());
        for (int i = 0; i < set1.size(); i++) {
            if (set2.contains(set1.getElement(i))) {
                intersectionSet.add(set1.getElement(i));
            }
        }
        return intersectionSet;
    }

    /**
     * Computes the difference of two sets.
     *
     * @param set1 the first set
     * @param set2 the second set
     * @return a new set that contains elements present in the first set but not in the second set
     */
    public static SimpleSet difference(SimpleSet set1, SimpleSet set2) {
        SimpleSet differenceSet = new SimpleSet(set1.size() + set2.size());
        for (int i = 0; i <= set1.size(); i++) {
            differenceSet.add(set1.getElement(i));
        }
        Object temp = 0;
        for (int i = 0; i < set2.size(); i++) {
            if (differenceSet.contains(set2.getElement(i))) {
                temp = set2.getElement(i);
                differenceSet.remove(temp);
            }
        }
        return differenceSet;
    }

    /**
     * Computes the symmetric difference of two sets.
     *
     * @param set1 the first set
     * @param set2 the second set
     * @return a new set that contains elements present in either set but not in both sets
     */
    public static SimpleSet symmetricDifference(SimpleSet set1, SimpleSet set2) {
        SimpleSet sdSet = new SimpleSet(set1.size());
        for (int i = 0; i <= set1.size(); i++) {
            sdSet.add(set1.getElement(i));
        }
        for (int i = 0; i <= set2.size(); i++) {
            sdSet.add(set2.getElement(i));
        }
        SimpleSet delete = intersection(set1, set2);
        for (int i = 0; i < delete.size(); i++) {
            if (sdSet.contains(delete.getElement(i))) {
                sdSet.remove(delete.getElement(i));
            }
        }
        return sdSet;
    }
}
