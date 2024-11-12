/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package movieticketsalesreport;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author ammaa
 */
public class MovieTicketsNGTest {
    
    public MovieTicketsNGTest() {
    }

    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales(){
        // Set up the Sales object and total sales value
    Sales sales = new Sales();
    double[] salesCosts = {3000, 1500, 1700};

    // Calculate the total repair costs
    double totalCosts = sales.SalesCosts(salesCosts);

    // Debug output
    System.out.println("Calculated total sales costs: " + totalCosts);

    // Check if the total is as expected
    assertEquals(15500.0, totalCosts, "The calculated total sales costs should be 6200");
}
        
 
    @Test
    public void TopMovieSales_ReturnsTopMovie() {
        Sales sales = new Sales();
    double[][] salesRepairs = {
        {3000, 1500, 1700},  // Napoleans' total sales for the first 3 months
        {3500, 1200, 1600}   // Oppenheimers' total sales for the first 3 months
    };
    int topTechnicianIndex = sales.TopSales(sales);
    assertEquals(0, topTechnicianIndex, "Oppenheimer should be the top movie.");
}
        

}
        
    
    

