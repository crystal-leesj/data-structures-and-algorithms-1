
import java.util.Arrays;

public class arrayReverse {
    public static void main (String[] args){
        String[] favAnimals = new String[5];
    String[] newArray = new String[5];

        favAnimals[0]= "Cat";
        favAnimals[1]= "Dog";
        favAnimals[2]= "Chicken";
        favAnimals[3]= "Pig";
        favAnimals[4]= "Duck";
        arrayReverse(favAnimals);

    }
    public static void arrayReverse(String [] arrayToReverse){
        String []  reversArray= new String[arrayToReverse.length];
        int counter =0;
        for(int i = arrayToReverse.length-1; i>=0; i--){
                    reversArray[counter] = arrayToReverse[i];
                    counter ++;

            }
        System.out.println(Arrays.toString(reversArray));


    }
}
