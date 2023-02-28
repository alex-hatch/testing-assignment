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


    // the length() method:

    // Specification:

    // Calculates the number of elements contained in a list

    // Tests:

    @Test
    public void testLength1() {
        Integer[] ar = {3, 4, 5};
        List<Integer> l = makeList(ar);
        assertEquals(3, l.size());
    }

}
