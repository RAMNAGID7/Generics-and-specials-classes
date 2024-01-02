// Assignment: 4
// Author: Ram Nagid, ID: 318692779
package set;
/**
 * Possible main check for ArrayQueue.
 */
public class mainSet {
    public static void main(String[] args) {
        SimpleSet e1 = new SimpleSet(4);
        SimpleSet e2 = new SimpleSet(2);
        System.out.println(e1.isEmpty());
        e1.add(7);
        e1.add(1);
        e1.add(6);
        e1.add(5);
        e2.add(3);
        e2.add(4);
        e2.add(2);
        e2.add(11);
        e1.add(7);
        e2.add(11);
        System.out.println();
        System.out.println(e2.size());
        System.out.println();
        System.out.println(e1.isEmpty());
        System.out.println();
        e1.getSet();
        System.out.println();
        e2.getSet();
        System.out.println();
        System.out.println(e1.contains(7));
        System.out.println();
        System.out.println(e1.remove(7));
        System.out.println();
        System.out.println(e1.contains(7));
        System.out.println();
        e1.getSet();
        e1.add(7);
        e2.add(7);
        System.out.println("set1:");
        e1.getSet();
        System.out.println("set2:");
        e2.getSet();
        System.out.println("union:");
        (SetUtils.union(e1, e2)).getSet();
        System.out.println("intersection:");
        (SetUtils.intersection(e1, e2)).getSet();
        System.out.println("difference:");
        (SetUtils.difference(e1, e2)).getSet();
        System.out.println("symmetricDifference");
        (SetUtils.symmetricDifference(e1, e2)).getSet();
    }
}
