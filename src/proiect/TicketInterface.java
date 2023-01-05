package proiect;

import javax.swing.*;
import java.awt.*;

public class TicketInterface {
    	TicketInterface(){
    		// Create a new JFrame
            JFrame frame = new JFrame("Ticket");
            // Set the size of the frame
            frame.setSize(600, 400);
            // Set the default close operation
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Set the layout of the frame
            frame.setLayout(new BorderLayout());

            // Create a label for the top of the frame
            JLabel ticketLabel = new JLabel("Nume tichet", SwingConstants.CENTER);
            // Add the label to the top of the frame
            frame.add(ticketLabel, BorderLayout.NORTH);

            // Create a panel for the center of the frame
            JPanel centerPanel = new JPanel();
            // Set the layout of the panel
            centerPanel.setLayout(new GridLayout(2, 1));
            // Add the panel to the center of the frame
            frame.add(centerPanel, BorderLayout.CENTER);

            // Create a panel for the left side of the center panel
            JPanel leftPanel = new JPanel();
            // Set the layout of the panel
            leftPanel.setLayout(new BorderLayout());
            // Add the panel to the left side of the center panel
            centerPanel.add(leftPanel);

            // Create a label for the top of the left panel
            JLabel descriptionLabel = new JLabel("Descriere");
            // Add the label to the top of the left panel
            leftPanel.add(descriptionLabel, BorderLayout.NORTH);

            // Create a text field for the center of the left panel
            JTextField descriptionTextField = new JTextField();
            // Add the text field to the center of the left panel
            leftPanel.add(descriptionTextField, BorderLayout.CENTER);

            // Create a panel for the right side of the center panel
            JPanel rightPanel = new JPanel();
            // Set the layout of the panel
            rightPanel.setLayout(new BorderLayout());
            // Add the panel to the right side of the center panel
            centerPanel.add(rightPanel);

            // Create a label for the top of the right panel
            JLabel specificationsLabel = new JLabel("Specificatii");
            // Add the label to the top of the right panel
            rightPanel.add(specificationsLabel, BorderLayout.NORTH);

            // Create a text field for the center of the right panel
            JTextField specificationsTextField = new JTextField();
            // Add the text field to the center of the right panel
            rightPanel.add(specificationsTextField, BorderLayout.CENTER);

            // Create a text field for the bottom of the right panel
            JTextField additionalTextField = new JTextField();
            // Add the text field to the bottom of the right panel
            rightPanel.add(additionalTextField, BorderLayout.SOUTH);

            // Set the frame to be visible
            frame.setVisible(true);
        }
    	public static void main(String[] args) {
    		new TicketInterface();
    	}
}
