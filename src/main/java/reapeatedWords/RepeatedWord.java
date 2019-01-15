package reapeatedWords;

import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {


    public String repeatedWords(String string){
        Set<String> set = new HashSet<>();
        String[] splited = string.split(" ");

        for(int i = 0; i<splited.length; i++){
            if(set.contains(splited[i])){
                return splited[i].toLowerCase();

            }
            set.add(splited[i]);
        }
        return "no repeated words";
    }
}
