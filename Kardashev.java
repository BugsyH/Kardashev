import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kardashev {
    private int minerals = 0; // Initial amount of minerals

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
        JLabel mineralsLabel = new JLabel("Minerals: " + minerals);

        // Create a button to deploy the mining robot
        JButton mineButton = new JButton("Deploy Mining Robot");
        mineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deployMiningRobot(mineralsLabel);
            }
        });

        // Add components to the panel
        panel.add(mineButton);
        panel.add(mineralsLabel);
        

        // Add the panel to the frame
        frame.add(panel);

        // Display the frame
        frame.setVisible(true);
    }

    private void deployMiningRobot(JLabel mineralsLabel) {
        // Simulate mining operation (e.g., gather 10 minerals)
        minerals += 10;
        // Update the label to reflect the new amount of minerals
        mineralsLabel.setText("Minerals: " + minerals);
    }
}
