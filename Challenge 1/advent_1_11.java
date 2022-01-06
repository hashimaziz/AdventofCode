import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

class advent_1_11{
    public static void main(String args[]){
        int count = 0;
        int intArray[];    //declaring array
        intArray = new int[2000];
        int n = 0;
        int i = 0;
        int valA = 0;
        int valB = 0;
        try{
            File name = new File("/Users/hashimaziz/Desktop/Advent of Code/Challenge 1/advent_1.txt");
            Scanner reader = new Scanner(name);
            while(reader.hasNextLine()){
                intArray[n] = Integer.parseInt(reader.nextLine());
                n += 1;
            }
            /*
            for(int p = 0; p < intArray.length; p++){
                System.out.println(intArray[p]);
            }
            */
            reader.close();
            while(i + 3 < intArray.length){
                valA = intArray[i] + intArray[i + 1] + intArray[i + 2];
                valB = intArray[i + 1] + intArray[i + 2] + intArray[i + 3];
                //System.out.println(valA + ", " + valB);
                if(valA < valB){
                    count += 1;
                }
                i += 1;
            }

            System.out.println("There have been " + count + " increases");

        } catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}