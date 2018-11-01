package LambdaExpression;

import java.util.Arrays;
import java.util.Comparator;

//thinking in java P197
public class Parcel7 {
    public Contents contents() {
        return new Contents(){
            private int i = 11;

            public int value() {
                return i;
            }
        };
    }

    //Anonymous new Comparator<String>() can be replaced with lambda less... (Ctrl+F1)
    //Inspection info: This inspection reports all anonymous classes which can be replaced with lambda expressions
    //Lambda syntax is not supported under Java 1.7 or earlier JVMs
/*
    public static void sortIgnoreCase(String[] strs){
        Arrays.sort(strs, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.compareToIgnoreCase(o2);
            }
        });
    }
*/
    public static void sortIgnoreCase(String[] strs){
        Arrays.sort(strs,(String o1, String o2)->o1.compareToIgnoreCase(o2));
    }

    public static void main(String[] args){
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
        System.out.println(c.value());
        String[] testString ={"d","c","b"};
        sortIgnoreCase(testString);
        for(String i : testString){
            System.out.println(i);
        }
    }
}

