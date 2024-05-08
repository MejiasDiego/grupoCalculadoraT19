package grupoCalculadoraT19;

import javax.swing.*;
import java.awt.*;

public class prueba extends JFrame{

	public CalculatorGrid() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setLayout(new BorderLayout());
		JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10)); // 4x4 grid with gaps of 10 pixels
        
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
        
        add(panel, BorderLayout.CENTER);
        
        setVisible(true);
    }
	public static void main(String[] args) {
		new CalculatorGrid();
	}
}
