
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        ArrayList<String[]> inputLines = new ArrayList<String[]>();
        Scanner in = null;
        FileOutputStream outStream = null;
        PrintWriter out = null;
        
        try(FileInputStream fileStream = new FileInputStream("EmployeeInfo.txt")) {
            in = new Scanner(fileStream);
            outStream = new FileOutputStream("EmployeeInfoTable.txt");
            out = new PrintWriter(outStream);

            out.printf("%-20s | %3s | %7s | %8s\n", "", "Hrs", "Hourly", "Weekly");
		    out.printf("%-20s | %3s | %7s | %8s\n", "Name", "Wkd", "Rate", "Pay");
            for (int i = 0; i < 47; i++) {
                out.print('-');
            }
            out.println();

            while(in.hasNextLine()) {
                String line = in.nextLine();
                String[] words = line.split("\\s+");
                inputLines.add(words);
            }

        } catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Lines:");
            double total = 0;
        for(String[] line : inputLines) {
            String first = line[0];
            String last = line[1];
            int hours = Integer.parseInt(line[2]);
            Double rate = Double.parseDouble(line[3]);
            Double pay = hours * rate;
            total += pay;
            out.printf("%-20s | %3d | $%6.2f | $%7.2f\n", first + " " + last, hours, rate, pay);
        }

        for (int i = 0; i < 47; i++) {
            out.print('-');
        }
        out.println();

        out.printf("%36s $ %,.2f%n", "Total Payroll for Week:",  total);
        

        for (int i = 0; i < 47; i++) {
            out.print('-');
        }
        // out.println();

        in.close();
		out.flush();
		out.close();
     }
}