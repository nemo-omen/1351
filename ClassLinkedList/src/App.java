import java.util.Scanner;


public class App {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // String name = input.nextLine();
        // System.out.println(name);
        // double num = input.nextDouble();
        // System.out.println(num);
        // input.nextLine();
        // String newName = input.nextLine();
        // System.out.println(newName);
        
        
        

        StudentNode headObj = null;
        StudentNode currObj;
        StudentNode lastObj;

        int numStudents = input.nextInt();
        input.nextLine();
        int inputCount = numStudents;
        String[] names = new String[numStudents];
        double[] averages = new double[numStudents];
        
        int i = 0;
        
        
        while(inputCount > 0) {
            String name = input.nextLine();
            double avg = input.nextDouble();
            input.nextLine();
            names[i] = name;
            averages[i] = avg;
            inputCount--;
            i++;
        }

        headObj = new StudentNode("", 0.0);
        lastObj = headObj;
        
        for(i = 0; i < numStudents; i++) {
            currObj = new StudentNode(names[i], averages[i]);
            lastObj.insertAfter(currObj);
            lastObj = currObj;
        }

        System.out.println("This program will store class data (names and grades) in a linked list.\n");
        System.out.println("Linked list of student names and grades:");
        
        

        currObj = headObj.getNext();

        while(currObj != null) {
            currObj.printNodeData();
            currObj = currObj.getNext();
        }
    }
}
