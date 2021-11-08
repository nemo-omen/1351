import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static double sum (ArrayList<Double> list) {
        double sum = 0;

        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();

        System.out.println("This program will store numbers in an ArrayList and compute the sum of numbers.");
        System.out.println("The numbers will be read in one at a time. A 0 will terminate the input.");
        
        double newDouble = input.nextDouble();

        while(newDouble != 0.0) {
            list.add(newDouble);
            newDouble = input.nextDouble();
        }

        String alistOutput = "The items in the ArrayList are [";
        
        for(int i = 0; i < list.size(); i++) {
            alistOutput += list.get(i).toString();
            if(i == list.size() - 1) {
                alistOutput += "]";
            } else {
                alistOutput += ", ";
            }
        }

        System.out.println(alistOutput);
        

        System.out.printf("There are %d items in the ArrayList%n", list.size());
        System.out.printf("The sum of items in the ArrayList is %.1f%n", sum(list));
    }
}