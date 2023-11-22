/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questionone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import questionone.QuestionOne.EstateAgent;


/**
 *
 * @author Kuhle Langa
 */
public class QuestionOneTest {
    
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        // Arrange
        EstateAgent estateAgent = new EstateAgent();
        double[] propertySales = {800000, 1500000, 2000000};

        // Act
        double totalSales = estateAgent.EstateAgentSales(propertySales);

        // Assert
        assertEquals(4300000, totalSales, 0.001); // Use an appropriate delta value for double comparison
    }

    @Test
    public void CalculateTotalCommission_ReturnsCommission() {
        // Arrange
        EstateAgent estateAgent = new EstateAgent();
        double totalSales = 4300000; // Assuming total sales from the previous test

        // Act
        double commission = estateAgent.EstateAgentCommission(totalSales);

        // Assert
        assertEquals(86000, commission, 0.001); // Use an appropriate delta value for double comparison
    }

    @Test
    public void TopAgent_ReturnsTopPosition() {
        // Arrange
        EstateAgent estateAgent = new EstateAgent();
        double[] totalSales = {4300000, 3800000}; // Assuming total sales for two estate agents

        // Act
        int topAgentIndex = estateAgent.TopEstateAgent(totalSales);

        // Assert
        assertEquals(0, topAgentIndex);
    }
    
}
