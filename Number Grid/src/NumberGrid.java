import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class NumberGrid {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				try {
					NumberGrid window = new NumberGrid();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NumberGrid() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		JButton[] grid;
		grid = new JButton[100];
		for (int y=0; y<=99;y++) {
			Random r = new Random();
			
			 int x = r.nextInt(100)+0;
			 
			 grid[x] = new JButton("("+x+")");
			 
			 if (x % 6 ==0) {
				 
					grid[x].setBackground(Color.GREEN);
				}else if(x%3==0) {
					 grid[x].setBackground(Color.YELLOW);
					 grid[x].setForeground(Color.RED);
				 }else if ( x % 2 ==0) {
					 grid[x].setBackground(Color.BLUE);
					 grid[x].setForeground(Color.WHITE);
				 }
			 
			 frame.add(grid[x]);
			 
				
			 
					
		}
		
			
		 
		
		
		
		
		frame.setBounds(100, 100, 852, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(10, 10, 0, 0));
		
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2,3,3));
		frame.getContentPane().add(panel);
		
		
		
	}

}
