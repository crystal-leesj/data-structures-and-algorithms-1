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
    public void getHashIndexInteger() {
        Hashtable classToTest = new Hashtable();
        Object key = 23;
        int actual = classToTest.getHashIndex(key);
        int expected = key.hashCode() % 16;
        assertEquals(expected,actual);
    }
    @Test
    public void getHashIndexLongString() {
        Hashtable classToTest = new Hashtable();
        Object key = "LongStringValue";
        int actual = classToTest.getHashIndex(key);
        int expected = key.hashCode() % 16;
        assertEquals(expected,actual);
    }
    //STARTING ADD METHOD TEST
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
    public void addFalse() {
        Hashtable classToTest = new Hashtable();
        Object key = "Hi";
        Object value = 2;
        Boolean expected = classToTest.contains(key);
        assertFalse("It didn;t get added", expected);
    }
    //STARTING CONTAINS METHOD TEST
    @Test
    public void containsIsEmpty() {
        Hashtable classToTest = new Hashtable();
        Object key = "Hi";
        Object value = 2;
        Boolean expected = classToTest.contains(key);
        assertFalse("Doesn't contain", expected);
    }
    @Test
    public void containsInteger() {
        Hashtable classToTest = new Hashtable();
        Object key = "Hi";
        Object value = 2;
        classToTest.add(key, value);
        Boolean expected = classToTest.contains(key);
        assertTrue("it does contain", expected);
    }

    @Test
    public void containsKey() {
        Hashtable classToTest = new Hashtable();
        Object key = "Hi";
        Object value = 2;
        classToTest.add(key, value);
        int expected2 = 2;
        Boolean expected = classToTest.contains(key);
        assertEquals(expected2,2);
        assertTrue("it does contain", expected);
    }
    //STARTING FIND METHOD TEST
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
    @Test
    public void findString() {
        Hashtable classToTest = new Hashtable();
        classToTest.add("hi", "bye");
        Object actual= classToTest.find("hi");
        assertEquals("bye", actual);
    }
}