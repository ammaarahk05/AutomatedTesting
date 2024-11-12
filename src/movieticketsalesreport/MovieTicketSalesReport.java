/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movieticketsalesreport;

/**
 *
 * @author ammaa
 */
public class MovieTicketSalesReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarations
        double[][] sales = {
             {3000, 1500, 1700},  // Total Sales for the Napolean movie for January, February & March
             {3500, 1200, 1600}   // Total Sales for the Oppenheimer movie for January, February & March
        };
        
        // Initialize total sales for Napolean & Oppenheimer 
             double napoleanTotal = 0;
             double oppenheimerTotal = 0;
        
        // Use a For Loop to loop through the 2D array to calculate totals
        // Use i to represent each technician (row)
        // Use j to represent each month (column)
        // Outer loop - goes through technicians (rows)
             for (int i = 0; i < sales.length; i++) {
        // Inner loop - goes through months (columns)
             for (int j = 0; j < sales[i].length; j++) {
        // Add repair costs for Joe (if i == 0)
               if (i == 0) {
            napoleanTotal += sales[i][j];
        }
        // Add repair costs for Jane (if i == 1)
               else {
            oppenheimerTotal += sales[i][j];
        }
    }
}
        
        // Display the report
            System.out.println("MOVIE TICKET SALES REPORT - 2024");
            System.out.println("NAME\t\t\tJAN\t\tFEB\t\tMAR");
            System.out.println("---------------------------------------------------------------");

            System.out.println("Napolean\t\t " + sales[0][0] + "\t " + sales[0][1] + "\t " + sales[0][2]);
            System.out.println("Oppenheimer\t\t " + sales[1][0] + "\t " + sales[1][1] + "\t " + sales[1][2]);
            
            System.out.println();
        
        // Print the total movie sales for both movies (Napolean & Oppenheimer)
            System.out.println("Total movie ticket sales for Napolean: " + napoleanTotal);
            System.out.println("Total vmovie ticket sales for Oppenheimer: " + oppenheimerTotal);
            
            System.out.println();

        // Call the method to determine the top performing movie
            Sales salesClass = new Sales();
            int topMovieIndex = salesClass.TopSales(sales);
    
        // Display the top performing movie
            if (topMovieIndex == 0) {
        System.out.println("Top performing movie: Oppenheimer");
            } else if (topMovieIndex == 1) {
        System.out.println("Top performing movie: Napolean");
    
        
    }
    
}
}
        
        
        
    
    

