import javax.swing.*;
import java.awt.*;

public class Kardashev {
    private float energyProduction = 0; // Initial energy production
    private float energyConsumption = 0; // Initial energy consumption
    private float energyStorage = 0; // Initial energy storage
    private float energyStorageMax = 1000; // Maximum energy storage


    public static void main(String[] args) {
        // Create an instance of the game
        Kardashev game = new Kardashev();
        game.createAndShowGUI();
    }

    private void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("Kardashev");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel to hold components
        JPanel panel = new JPanel();

        // Create a label to display the amount of minerals
        JLabel energyProductionLabel = new JLabel("Energy Production: " + energyProduction+ " W");
        JLabel energyConsumptionLabel = new JLabel("Energy Consumption: " + energyConsumption+ " W");
        JLabel energyStorageLabel = new JLabel("Energy Storage: " + energyStorage+ "/" + energyStorageMax + " kWh");

        // Create a button to deploy the mining robot
        JButton mineButton = new JButton("Deploy Solar Panel");

        // Add components to the panel
        panel.add(energyProductionLabel);
        panel.add(energyConsumptionLabel);
        panel.add(energyStorageLabel);
        panel.add(mineButton);
        

        // Add the panel to the frame
        frame.add(panel);

        // Display the frame
        frame.setVisible(true);
    }
}
