package study;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTest {

    @Test
    public void study() throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");

        assertEquals(2, list.size());
        assertEquals("first", list.get(0));
        assertEquals(true, list.contains("first"));
        assertEquals("first",list.remove(0));
        assertEquals(false, list.contains("first"));
    }

    @Test
    public void noGenerics() throws Exception {
        ArrayList list = new ArrayList();
        list.add("this is string");
        list.add(1);

        String first = (String)list.get(0);
        int second = (int)list.get(1);

    }

    @Test
    public void useGenerics() throws Exception {
        ArrayList<String> values = new ArrayList<String>();
        values.add("first");
        values.add("second");

        String first = values.get(0);
        String second = values.get(1);
    }
}

