
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        arrayReverse();

    }
    public static void arrayReverse(){

        String[] favAnimals = new String[5];

        favAnimals[0]= "Cat";
        favAnimals[1]= "Dog";
        favAnimals[2]= "Chicken";
        favAnimals[3]= "Pig";
        favAnimals[4]= "Duck";

        for(int i = favAnimals.length-1; i<favAnimals.length; i--){
            System.out.println(favAnimals[i]);
        }


//        ArrayList <String> favAnimals = new ArrayList<>();
//        favAnimals.add("Cat");
//        favAnimals.add("Dog");
//        favAnimals.add("Chicken");
//        favAnimals.add("Pig");
//        favAnimals.add("Duck");
//        for(int i = favAnimals.size()-1; i<favAnimals.size(); i--){
//            System.out.println(favAnimals.get(i));
//        }

    }
}
