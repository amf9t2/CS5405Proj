package code;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 @author Altamash M Fakki
 @version 2.0
 */
/** AuthorIdentificationInternalFrame class extends JInternalFrame*/
public class AuthorIdentificationInternalFrame extends JInternalFrame
{
	String authorDescription = "Demonstration of Assignment for Java, GUI and Visualization: CS 5405 \nFor \nDr. Chaman Lal Sabharwal \n \nPresented by \nAltamash M Fakki, amf9t2@mst.edu \n \nStatement: This is my original code, No IDE used. \n ";
    /**Decalre Dimension*/
	int w=1000, h=500;
    
    /**Constructor for Circle*/
    public AuthorIdentificationInternalFrame ()
    {
        super("Author", true, true, true,true);
        setSize(new Dimension(w,h));
        setVisible(true);
        setOpaque(true);
    }
    
    /**Paint method */
    public void paint(Graphics g)
	{
        super.paintComponent (g);
        drawString(g,authorDescription,50,50);
	}
    
    /**Draws identification string*/
    private void drawString(Graphics g, String text, int x, int y) {
        for (String line : text.split("\n"))
            g.drawString(line, x, y += g.getFontMetrics().getHeight());
    }
}
