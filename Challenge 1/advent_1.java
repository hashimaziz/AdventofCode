import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class advent_1{
    public static void main(String args[]){
        int previous = 0;
        int newVal = 0;
        int count = 0;
        int line = 0;
        try{
            File name = new File("/Users/hashimaziz/Desktop/Advent of Code/Challenge 1/advent_1.txt");
            Scanner reader = new Scanner(name);
            while(reader.hasNextLine()){
                newVal = Integer.parseInt(reader.nextLine());

                if(newVal > previous){
                    count += 1;
                }
                line += 1;
                previous = newVal;
                System.out.println(line);
            }

            reader.close();
            System.out.println("There have been " + count + " increases");

        } catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}