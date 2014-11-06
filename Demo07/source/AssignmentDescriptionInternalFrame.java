// Altamash M Fakki
package code;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import javax.swing.border.*;
/**
 @author Altamash M Fakki
 @version 2.0
 */
/** AssignmentDescriptionPanel class extends JInternalFrame*/
public class AssignmentDescriptionInternalFrame extends JInternalFrame
{
    /**Problem description */
    String problemDescription = "Write a program to solve the following Algorithm visualization problem using Java’s new version of Threads. \n  Project: Combine functionality of audios, images, Multi-tasking as below: \n Menus for Demos \n MenuBar has menus : About, MultiTasking, possibly a digital clock. \n   Use internalframe (not panel).\n   Use the same problem as in HW04.\n   About has four submenus \n   Author: your name, phone etc, instructions how to load and execute the program. \n  Problem Description: as stated here \n   References You must give reference to credit the developer if you borrow any code from\n anywhere. Do not lose credit for not being able to explain your program code.\n Demos menu \n Sorting Algorithms \n Select algorithms \n Implement algorithms for visualizing the how the algorithm do the sorting \n Bubble \n sort Selection Sort  \n Merge Sort \n Quick Sort \n   Heap Sort Shell Sort  \n   Allow the user to select algorithms to compare their visually executing time.";
    /** declare width and height */
    int w=1000, h=500;
    /**Scrolla pane for text area */
    JScrollPane scrollPane;
    /**Declare Text area */
    JTextArea ta;
    /**Declare Font */
    Font font = new Font("Sarif", Font.BOLD +Font.ITALIC, 12);
    /** Border object*/
    Border border = new LineBorder( Color.BLACK, 2 );
    
    /**constructor for AssignmentDescriptionPanel */
    public AssignmentDescriptionInternalFrame ()
    {
        super("Prob Description", true, true, true,true);
        ta = new JTextArea(problemDescription,18,40);
        setSize(new Dimension(w,h));
        setVisible(true);
        setOpaque(true);
        populateTextArea();
        this.add(scrollPane);
        System.out.println("Prob desc");
    }
    
    /** Populates text area */
    public void populateTextArea(){
        ta.setForeground(Color.BLUE);
        ta.setFont(font);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setText(problemDescription);
        ta.setEnabled(false);
        ta.setBorder(border);
        scrollPane = new JScrollPane(ta);
    }
}
