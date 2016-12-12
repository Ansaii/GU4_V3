package testenv;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import arrays.Array7x7;

public class ArrayDisplay extends JPanel {
	private JLabel[][] arrayLabels = new JLabel[7][7];
	private JLabel[] rowLabels = new JLabel[7];
	private JLabel[] colLabels = new JLabel[7];
//	private JTextField[] colFields = new JTextField[7];
//	private JTextField[] rowFields = new JTextField[7];

	public ArrayDisplay() {
		setLayout(new GridLayout(8, 8));
		setBorder(new EmptyBorder(10,10,10,10));
		
		for (int row = 0; row < arrayLabels.length; row++) {
				colLabels[row] = new JLabel(Integer.toString(row), JLabel.CENTER);
				colLabels[row].setForeground(Color.LIGHT_GRAY);
				add(colLabels[row]);
			for (int col = 0; col < arrayLabels[row].length; col++) {
				arrayLabels[row][col] = new JLabel("0", JLabel.CENTER);
				arrayLabels[row][col].setPreferredSize(new Dimension(50, 50));
				arrayLabels[row][col].setOpaque(true);
				arrayLabels[row][col].setBackground(Color.DARK_GRAY);
				arrayLabels[row][col].setForeground(Color.WHITE);
				arrayLabels[row][col].setBorder(new LineBorder(Color.WHITE, 2));
				add(arrayLabels[row][col]);
			}
		}
		
		add(Box.createRigidArea(new Dimension(50,50)));
		
		for (int i = 0; i < rowLabels.length; i++) {
			
			rowLabels[i] = new JLabel(Integer.toString(i), JLabel.CENTER);
			rowLabels[i].setForeground(Color.LIGHT_GRAY);
			add(rowLabels[i]);
		}
	}
	
	public void updateDisplay(Array7x7 array7x7) {
		for(int row = 0; row < arrayLabels.length; row ++) {
			for(int col = 0; col < arrayLabels.length; col ++) {
				arrayLabels[row][col].setText(Integer.toString(array7x7.getElement(row, col)));
			}
		}
	}
}
