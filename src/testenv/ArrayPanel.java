package testenv;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import arrays.Array7;
import arrays.Array7x7;

public class ArrayPanel extends JPanel {
	private JButton btnGetRow = new JButton("Get row #");
	private JButton btnSetRow = new JButton("Set row #");
	private JButton btnGetCol = new JButton("Get col #");
	private JButton btnSetCol = new JButton("Set col #");

	private JTextField tfRow = new JTextField("0");
	private JTextField tfCol = new JTextField("0");

	private JLabel labelRow = new JLabel("Row #:");
	private JLabel labelCol = new JLabel("Col #:");

	private JTextField[] colFields = new JTextField[7];
	private JTextField[] rowFields = new JTextField[7];

	private JPanel inputPanel = new JPanel(new GridLayout(8, 1));
	private JPanel rowPanel = new JPanel(new GridLayout(1, 9));
	private JPanel colPanel = new JPanel(new GridLayout(8, 1));
	private JPanel centerPanel = new JPanel(new BorderLayout());

	private ArrayDisplay arrayDisplay = new ArrayDisplay();
	private TestController controller;

	public ArrayPanel() {
		ButtonListener bl = new ButtonListener();

		setBorder(new EmptyBorder(20, 20, 20, 20));
		setLayout(new BorderLayout());

		// Create and add center panel
		centerPanel.add(arrayDisplay, BorderLayout.CENTER);
		add(centerPanel);

		// Add listener to buttons
		btnGetRow.addActionListener(bl);
		btnSetRow.addActionListener(bl);
		btnGetCol.addActionListener(bl);
		btnSetCol.addActionListener(bl);

		// Add buttons to input panel and add it
		inputPanel.setBorder(new EmptyBorder(0, 10, 0, 0));
		inputPanel.add(labelRow);
		inputPanel.add(tfRow);
		inputPanel.add(btnGetRow);
		inputPanel.add(btnSetRow);

		inputPanel.add(labelCol);
		inputPanel.add(tfCol);
		inputPanel.add(btnGetCol);
		inputPanel.add(btnSetCol);

		add(inputPanel, BorderLayout.EAST);

		// Add text fields to row panel and add it to center panel
		rowPanel.setBorder(new EmptyBorder(0, 0, 0, 10));
		rowPanel.add(Box.createRigidArea(new Dimension(50, 50)));
		rowPanel.add(Box.createRigidArea(new Dimension(50, 50)));
		for (int i = 0; i < rowFields.length; i++) {
			rowFields[i] = new JTextField("0");
			rowFields[i].setPreferredSize(new Dimension(50, 50));
			rowPanel.add(rowFields[i]);
		}
		centerPanel.add(rowPanel, BorderLayout.SOUTH);

		// Add text fields to col panel and add it to center panel
		for (int i = 0; i < colFields.length; i++) {
			colFields[i] = new JTextField("0");
			colFields[i].setPreferredSize(new Dimension(50, 50));
			colPanel.add(colFields[i]);
		}
		centerPanel.add(colPanel, BorderLayout.WEST);
	}

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int row = Integer.parseInt(tfRow.getText());
			int col = Integer.parseInt(tfCol.getText());

			if (e.getSource() == btnGetRow) {
				controller.getRow(row);
			} else if (e.getSource() == btnSetRow) {
				Array7 array7 = new Array7();
				for (int i = 0; i < rowFields.length; i++) {
					array7.setElement(i, Integer.parseInt(rowFields[i].getText()));
				}
				controller.setRow(row, array7);
			} else if (e.getSource() == btnGetCol) {
				controller.getCol(col);
			} else if (e.getSource() == btnSetCol) {
				Array7 array7 = new Array7();
				for (int i = 0; i < colFields.length; i++) {
					array7.setElement(i, Integer.parseInt(colFields[i].getText()));
				}
				controller.setCol(col, array7);
			}

		}

	}

	public void updateRow(Array7 array7) {
		for (int i = 0; i < rowFields.length; i++) {
			rowFields[i].setText(Integer.toString(array7.getElement(i)));
		}
	}

	public void updateCol(Array7 array7) {
		for (int i = 0; i < colFields.length; i++) {
			colFields[i].setText(Integer.toString(array7.getElement(i)));
		}
	}

	public void updateDisplay(Array7x7 array7x7) {
		arrayDisplay.updateDisplay(array7x7);
	}

	public void setController(TestController controller) {
		this.controller = controller;
	}
}
