package code;
// Altamash M Fakki
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import javax.swing.border.*;

//References
//Random class

public class GridPanel extends JPanel
{
    
    /** declare width and height */
    final static int maxGap = 20;
    Border border = new LineBorder( Color.BLACK, 2 );
    JButton[] b;
    
    int min = 1;
    int max = 5;
    /**constructor for AssignmentDescriptionPanel */
    public GridPanel ()
    {
        GridLayout grid = new GridLayout(1, 5);
        setLayout(grid);
        JButton bFake = new JButton("Just fake button");
        Dimension buttonSize = bFake.getPreferredSize();
        setPreferredSize(new Dimension((int)(buttonSize.getWidth() * 2.5)+maxGap, (int)(buttonSize.getHeight() * 3.5)+maxGap * 2));
        addButton();
        repaint();
    }
    
    /** Paint method */
    public void paintComponent(Graphics g)
	{
		super.paintComponent (g);
	}
    
    public void addButton(){
        int[] randNumber = {3,5,4,1,2};
        b= new JButton[5];
        for (int i = 0; i < 5; i++)
        {
           b[i] = new JButton(String.valueOf(randNumber[i]));
           add(b[i]);
        }
    }
    
    public void Switch(int from, int to){
        JButton btnOldFrom = b[from -1];
        
        if(b[from - 1] != null && b[to -1] != null){
            b[from -1] = b[to -1];
            b[to -1] = btnOldFrom;
        }
        validate();
    }
    
    public void Replace(int from, int to){
        if(b[from -1] != null && b[to -1] != null){
             b[from -1] = b[to -1];
        }
        validate();
    }
    
}
