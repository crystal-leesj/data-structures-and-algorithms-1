package leftjoin;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void leftJoinSmall() {
        LeftJoin classToTest = new LeftJoin();

        Map<String, String> mapleft = new HashMap();
        Map<String, String> mapright = new HashMap();

        //make the mapleft
        String key1 = "fond";
        String value1 = "Bye";
        mapleft.put(key1, value1);

        //make the mapright
        String key2 = "fond";
        String value2 = "Hello";
        mapright.put(key2, value2);

        List<List<String>> actual = classToTest.LeftJoin(mapleft, mapright);
        List<List<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList("fond", "Bye", "Hello")));

        assertEquals(expected, actual);
    }
    @Test
    public void leftJoinIsEmpty() {
        LeftJoin classToTest = new LeftJoin();

        Map<String, String> mapleft = new HashMap();
        Map<String, String> mapright = new HashMap();

        //make the mapleft
        String key1 = "fond";
        String value1 = "Bye";
        mapleft.put(key1, value1);

        //make the mapright
        String key2 = "bond";
        String value2 = "Hello";
        mapright.put(key2, value2);

        List<List<String>> actual = classToTest.LeftJoin(mapleft, mapright);
        List<List<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList("fond", "Bye", null)));

        assertEquals(expected, actual);
    }


    @Test
    public void leftJoinLarge() {
        LeftJoin classToTest = new LeftJoin();

        Map<String, String> mapleft = new HashMap();
        Map<String, String> mapright = new HashMap();

        //make the mapleft
        String key1 = "fond";
        String value1 = "Bye";
        String key3 = "wrath";
        String value3 = "anger";
        mapleft.put(key1, value1);
        mapleft.put(key3,value3);

        //make the mapright
        String key2 = "fond";
        String value2 = "Hello";
        String key4 = "wrath";
        String value4 = "delight";
        mapright.put(key2, value2);
        mapright.put(key4,value4);

        List<List<String>> actual = classToTest.LeftJoin(mapleft, mapright);
        List<List<String>> expected = new ArrayList<>();

        expected.add(new ArrayList<>(Arrays.asList("wrath", "anger", "delight")));
        expected.add(new ArrayList<>(Arrays.asList("fond", "Bye", "Hello")));

        assertEquals(expected, actual);
    }
}