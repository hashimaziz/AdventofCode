import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class advent_2_1{
    public static void main(String args[]){
        String strArray[];    //declaring array
        strArray = new String[1000];
        int horizontal = 0;
        int depth = 0;
        int aim = 0;
        int n = 0;
        try{
            File name = new File("/Users/hashimaziz/Desktop/Advent of Code/Challenge 2/advent_2.txt");
            Scanner reader = new Scanner(name);
            while(reader.hasNextLine()){
                strArray[n] = reader.nextLine();
                n += 1;
            }
            for(int i = 0; i < strArray.length; i++){
                if(strArray[i].length() == 9){ //forward
                    char number = strArray[i].charAt(8);
                    int num = Character.getNumericValue(number);
                    horizontal += num;
                    depth += aim * num;
                }
                if(strArray[i].length() == 6){ //down
                    char number = strArray[i].charAt(5);
                    int num = Character.getNumericValue(number);
                    aim += num;
                }
                if(strArray[i].length() == 4){ //up
                    char number = strArray[i].charAt(3);
                    int num = Character.getNumericValue(number);
                    aim -= num;
                }
            }
            

            reader.close();
            int mult = horizontal * depth;
            System.out.println("The multiplied value is: " + mult);

        } catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}