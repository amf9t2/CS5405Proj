package code;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 @author Altamash M Fakki
 @version 2.0
 */
/** References class extends JInternalFrame*/
public class RefrencesInternalFrame extends JInternalFrame
{
	String ref = "";
    /**Decalre Dimension*/
	int w=1000, h=500;
    
    /**Constructor for Circle*/
    public RefrencesInternalFrame ()
    {
        super("References", true, true, true,true);
        setSize(new Dimension(w,h));
        setVisible(true);
        setOpaque(true);
    }
    
    /**Paint method */
    public void paint(Graphics g)
	{
        super.paintComponent (g);
        drawString(g,ref,50,50);
	}
    
    /**Draws identification string*/
    private void drawString(Graphics g, String text, int x, int y) {
        for (String line : text.split("\n"))
            g.drawString(line, x, y += g.getFontMetrics().getHeight());
    }
}
