package nl.avans.hball.views;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseFrame extends JFrame 
{
	private static final long serialVersionUID = 8364197030531992052L;
	
	public static final int SCREENWIDTH = 1366;
	public static final int SCREENHEIGHT = 768;

	public BaseFrame(JPanel panel)
	{
		super("HAXBALL - Michiel Schuurmans, Jack Evers");
		this.setSize(new Dimension(SCREENWIDTH,SCREENHEIGHT));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
