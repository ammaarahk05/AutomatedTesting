/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieticketsalesreport;

/**
 *
 * @author ammaa
 */
public class MovieTickets implements IMovieTickets {
    
    
   
        @Override
 public int TotalMovieSales(int[] movieTicketSales){
    double total = 0;
    // Use a traditional for loop
    for (int i = 0; i < salesCosts.length; i++) {
        total += salesCosts[i];  // Add each cost to the total
    }

    return total;  // Return the total sales cost

}


       @Override 
    public String TopMovie(String[] movies, int[] totalSales){
        int topMovieIndex = 0;  // Assume Napolean is the top movie initially
    double napoleanTotal = 0;
    double oppenheimerTotal = 0;
    
    // Calculate the total for each movie
    for (int i = 0; i < sales.length; i++) {
        double totalForSales = 0;
        for (int j = 0; j < sales[i].length; j++) {
            totalForSales += sales[i][j];
        }
        
        if (i == 0) napoleanTotal = totalForSales;
        else oppenheimerTotal = totalForSales;
    }

    // Compare the totals to determine the top movie
    if (napoleanTotal > oppenheimerTotal) {
        return 0;  // Napolean
    } else {
        return 1;  // Oppenheimer
    }
}
        
        
        
        
        
        
        
    }
 
 
 
 
 
 
 
 
 
 
 


