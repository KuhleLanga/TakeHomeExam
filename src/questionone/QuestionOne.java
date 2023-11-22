/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questionone;

/**
 *
 * @author Kuhle Langa
 */
public class QuestionOne {

    public interface IEstateAgent {
        double EstateAgentSales(double[] propertySales);
        double EstateAgentCommission(double estateAgentSales);
        int TopEstateAgent(double[] totalSales);
    }

    public static class EstateAgent implements IEstateAgent {
        @Override
        public double EstateAgentSales(double[] propertySales) {
            double totalSales = 0;
            for (double sale : propertySales) {
                totalSales += sale;
            }
            return totalSales;
        }

        @Override
        public double EstateAgentCommission(double estateAgentSales) {
            return 0.02 * estateAgentSales;
        }

        @Override
        public int TopEstateAgent(double[] totalSales) {
            double maxSales = 0;
            int topAgentIndex = 0;

            for (int i = 0; i < totalSales.length; i++) {
                if (totalSales[i] > maxSales) {
                    maxSales = totalSales[i];
                    topAgentIndex = i;
                }
            }

            return topAgentIndex;
        }
    }

    public static void main(String[] args) {
        // Two-dimensional array to store property sales for two estate agents
        double[][] propertySales = {
                {800000, 1500000, 2000000},
                {700000, 1200000, 1600000}
        };

        // Array to store total sales for each estate agent
        double[] totalSales = new double[propertySales.length];

        // Create an instance of EstateAgent class
        EstateAgent estateAgentCalculator = new EstateAgent();

        // Calculate total property sales and 2% commission for each estate agent
        for (int i = 0; i < propertySales.length; i++) {
            totalSales[i] = estateAgentCalculator.EstateAgentSales(propertySales[i]);

            System.out.println("Estate Agent " + (i + 1) + " Total Sales: R " + totalSales[i]);
            System.out.println("Estate Agent " + (i + 1) + " Commission: R " +
                    estateAgentCalculator.EstateAgentCommission(totalSales[i]));
            System.out.println();
        }

        // Identify and display the top-performing estate agent
        int topAgentIndex = estateAgentCalculator.TopEstateAgent(totalSales);
        System.out.println("Top Estate Agent: Estate Agent " + (topAgentIndex + 1));
    }
}
