package hastable;

import LinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Hashtable {
    public  int size;
    public KeyVal[] bucket;

    public Hashtable(){
        this.size= 16;
        this.bucket= new KeyVal[this.size];
    }

    //A method/function named GetHash that takes in a key and returns the index in the array the key is stored
    public int getHashIndex(Object key){
        return  key.hashCode() % this.size;
    }

    //a method/function named add that takes in both the key and value. This method should hash the key and add the key and value pair to the table.

    public void add (Object key,Object value ){
        // new keyval obj and mapped key/value
        KeyVal keyval = new KeyVal(key, value);

        //first hash the key to find the index and then add keyval
        bucket[getHashIndex(key)] = keyval;
    }

    //A method/function named contains that takes in the key and returns if the key exists in the table already.
    public Boolean contains (Object key){
        //null check
        if(bucket[getHashIndex(key)] == null){
            return false;
        }
        return bucket[getHashIndex(key)].key == key;
    }

        //A method/function named Find that takes in the key and returns the value from key/value pair.
    public Object find (Object key){
        if(contains(key) == true){
            return bucket[getHashIndex(key)].value;
        }
        return  null;
    }
}
