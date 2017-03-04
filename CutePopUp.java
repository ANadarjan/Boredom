package theGame;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.SystemColor;

import javax.swing.JLabel;

public class CutePopUp {
	
	private JFrame frame;	
	/**
	 * Launch the application.
	 */	 
	public static void popup() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try 
				{
				CutePopUp window = new CutePopUp();
				window.frame.setVisible(true);
				}
				catch (Exception e) {
				e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	 
	public CutePopUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// FRAME
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("CUTE LOL :3");
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 265, 225);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		// GIF IMAGE 
		JLabel Image = new JLabel("");
		Image imageGif = new ImageIcon(this.getClass().getResource("/Cute.gif")).getImage();
		Image.setIcon(new ImageIcon(imageGif));
		Image.setBounds(29, 21, 199, 145);
		frame.getContentPane().add(Image);

	}

}