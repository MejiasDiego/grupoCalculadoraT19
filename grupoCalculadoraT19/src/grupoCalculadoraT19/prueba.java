package grupoCalculadoraT19;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class prueba extends JFrame{
	    
	    public prueba() {
	        setTitle("Calculator");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 400);
	        setLayout(new BorderLayout());
	        
	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(4, 4, 10, 10)); // 4x4 grid with gaps of 10 pixels
	        panel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Adding empty border of 10 pixels to each side

	        String[] buttonLabels = {
	            "7", "8", "9", "/",
	            "4", "5", "6", "*",
	            "1", "2", "3", "-",
	            "C", "0", "=", "+"
	        };
	        
	        for (String label : buttonLabels) {
	            JButton button = new JButton(label);
	            button.setFont(new Font("Arial", Font.PLAIN, 20));
	            panel.add(button);
	        }
	        
	        // Adding the panel to the center of the JFrame
	        add(panel, BorderLayout.CENTER);
	        
	        setVisible(true);
	    }
	    
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new prueba();
	            }
	        });
	    }
	}
