import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    // ONLY USE THIS FUNCTION TO CONSTRUCT LISTS FOR TESTING...
    public <E> ArrayList<E> makeList(E[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    // the add() method:

    // Specification:

    // Puts a number in the list

    // Tests:

    @Test
    public void testAdd() {
        Integer[] ar = {};
        List<Integer> l = makeList(ar);

        l.add(3);
        assertEquals(3, l.get(0));
        assertEquals(1, l.size());

        l.add(4);
        assertEquals(4, l.get(1));
        assertEquals(2, l.size());
    }


    // the contains() method:

    // Specification:

    // Checks whether or not a value is in the list

    // Tests:

    @Test
    public void testContains() {
        Integer[] ar = {2, 3, 4};
        List<Integer> l = makeList(ar);

        assertTrue(l.contains(3));
        assertFalse(l.contains(1));

    }


    // the get() method:

    // Specification:

    // Checks whether or not a value is in the list

    // Tests:

    @Test
    public void testGet() {
        Integer[] ar = {2, 3, 4};
        List<Integer> l = makeList(ar);
        assertEquals(2, l.get(0));
        assertEquals(3, l.get(1));
        assertEquals(4, l.get(2));
    }

    // the indexOf() method:

    // Specification:

    // Returns the index of the item in the list searched for

    // Tests:

    @Test
    public void testIndexOf() {
        Integer[] ar = {2, 3, 4};
        List<Integer> l = makeList(ar);

        assertEquals(0, l.indexOf(2));
        assertEquals(1, l.indexOf(3));
        assertEquals(2, l.indexOf(4));
        assertEquals(-1, l.indexOf(0));
    }

    // the remove() method:

    // Specification:

    // Removes an item in the list at the specified index.
    // Returns the item that was removed from the list.

    // Tests:

    @Test
    public void testRemove() {
        Integer[] ar = {2, 3, 4};
        List<Integer> l = makeList(ar);

        assertEquals(2, l.remove(0));
        assertEquals(3, l.remove(0));
        assertEquals(4, l.remove(0));
    }


    // the size() method:

    // Specification:

    // Calculates the number of elements contained in a list

    // Tests:

    @Test
    public void testSize() {
        Integer[] ar = {3, 4, 5};
        List<Integer> l = makeList(ar);
        assertEquals(3, l.size());
    }

    // the subList() method:

    // Specification:

    // Returns a view of the portion of this list between the first argument, inclusive
    // to the second argument, exclusive

    // Tests:

    @Test
    public void testSubList() {
        String[] ar = {"a", "b", "c", "d", "e"};
        List<String> list = makeList(ar);

        List<String> subList = list.subList(1, 4);

        assertEquals(3, subList.size());
        assertEquals("b", subList.get(0));
        assertEquals("c", subList.get(1));
        assertEquals("d", subList.get(2));

        subList.set(1, "x");

        assertEquals("x", subList.get(1));
        assertEquals("x", list.get(2));

        subList.add("y");

        assertEquals(4, subList.size());
        assertEquals(6, list.size());
        assertEquals("y", subList.get(3));
        assertEquals("e", list.get(5));
    }

}
