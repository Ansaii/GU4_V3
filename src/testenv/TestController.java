package testenv;


import javax.swing.*;

import arrays.Array7;
import arrays.Array7x7;

public class TestController extends JFrame {
	private ArrayPanel panel;
	private Array7x7 array7x7;
	
	public TestController(ArrayPanel panel) {
		array7x7 = new Array7x7();
		panel.updateDisplay(array7x7);
		panel.setController(this);
		this.panel = panel;
	}
	
	public Array7x7 getArray7x7() {
		return array7x7;
	}
	
	public void getRow(int row) {
		Array7 array7 = array7x7.getRow(row);
		panel.updateRow(array7);
	}
	
	public void setRow(int row, Array7 array7) {
		array7x7.setRow(row, array7);
		panel.updateDisplay(array7x7);
	}
	
	public void getCol(int col) {
		Array7 array7 = array7x7.getCol(col);
		panel.updateRow(array7);
	}
	
	public void setCol(int col, Array7 array7) {
		array7x7.setCol(col, array7);
		panel.updateDisplay(array7x7);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ArrayPanel panel = new ArrayPanel();
				new TestController(panel);
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(panel);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
