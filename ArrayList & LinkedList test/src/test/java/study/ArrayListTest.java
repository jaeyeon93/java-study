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

//    @Test
//    public void noGenerics() throws Exception {
//        ArrayList list = new ArrayList();
//        list.add("this is string");
//
//
//    }
}

