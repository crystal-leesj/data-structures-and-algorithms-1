package hastable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void getHashIndex() {
        Hashtable classToTest = new Hashtable();
        Object key = "Hi";
         int actual = classToTest.getHashIndex(key);
         int expected = key.hashCode() % 16;
         assertEquals(expected,actual);
    }

    @Test
    public void addStrings() {
        Hashtable classToTest = new Hashtable();
        Object key = "Hi";
        Object value = "Bye";
        classToTest.add(key,value);
        Boolean expected = classToTest.contains(key);
        assertTrue("It got added", expected);
    }

    @Test
    public void addIntegers() {
        Hashtable classToTest = new Hashtable();
        Object key = "Hi";
        Object value = 2;
        classToTest.add(key,value);
        Boolean expected = classToTest.contains(key);
        assertTrue("It got added", expected);
    }

    @Test
    public void containsIsEmpty() {
        Hashtable classToTest = new Hashtable();
        Object key = "Hi";
        Object value = 2;
        Boolean expected = classToTest.contains(key);
        assertFalse("Doesn't contain", expected);
    }

    @Test
    public void findIsNull() {
        Hashtable classToTest = new Hashtable();
        Boolean expected= classToTest.find("hi") == null;
        assertTrue("Doesn't contain", expected);
    }
    @Test
    public void findInteger() {
        Hashtable classToTest = new Hashtable();
        classToTest.add("hi", 45);
        Object actual= classToTest.find("hi");
        assertEquals(45, actual);
    }
}