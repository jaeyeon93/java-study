package study;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void study() throws Exception {
        LinkedList<String> list = new LinkedList<String>();
        list.add("first");
        list.add("second");

        assertEquals(2, list.size());
        assertEquals("first", list.get(0));
        assertEquals(true, list.contains("first"));
        assertEquals("first",list.remove(0));
        assertEquals(false, list.contains("first"));

    }
}
