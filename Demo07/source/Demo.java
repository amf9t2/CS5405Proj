package code;

import javax.swing.*;
import java.awt.*;
import static java.lang.Math.*;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.awt.event.*;
/**
 @author Altamash M Fakki
 @version 2.0
 */
/**Demo extends JApplet*/
public class Demo extends JApplet {
    //**Declare JMenu */
    JMenu menuTwoDimension, menuThreeDimension;
    //**Declare JMenuItem */
    JMenuItem mItemAuthor, mItemProbDescription, mItemReferences, mItemBubbleSort
             ,mItemSelectionSort, mItemMergeSort, mItemQuickSort, mItemHeapSort, mItemShellSort;
    //**Declare JInternalFrame*/
    JInternalFrame author, probDescription, references, iFrame;
    //**Declare Container*/
    Container c = this.getContentPane();
    //**Declare JDesktopPane*/
    JDesktopPane desktop = new JDesktopPane();
    //**Declare MenuItemHandler*/
    MenuItemHandler menuItemHandler;
    //**Declare Arrylist to store list of sorting alg**//
    ArrayList<Sort> lstSortAlg ;
    
    /**Constructor */
    public Demo(){
    }
    
    /**Applet initialisation*/
    public void init(){
        manageMenu();
        createList();
        c.setBackground(Color.CYAN);
        c.add(desktop);
        
        iFrame = new AuthorIdentificationInternalFrame();
        desktop.add(iFrame);
        setVisible(true);
        setSize(1300,600);
    }
    /**Main method */
    public static void main(String[] args){
        new DemoFrame(new Demo(), "Project");
    }
    /**Paint method */
    public void paint(Graphics g){
        super.paint(g);
    }
    
    //**Create list of all sorting algorithm object */
    public void createList(){
        lstSortAlg = new ArrayList<Sort>();
        
        Sort bubble = new BubbleSort();
        Sort selection = new SelectionSort();
        Sort merge = new MergeSort();
        
        Sort quick = new QuickSort();
        Sort heap = new HeapSort();
        Sort shell = new ShellSort();
        
        lstSortAlg.add(bubble);
        lstSortAlg.add(selection);
        lstSortAlg.add(merge);
        
        lstSortAlg.add(quick);
        lstSortAlg.add(heap);
        lstSortAlg.add(shell);
    }
    
    public void manageMenu(){
        menuItemHandler = new MenuItemHandler();
        
        //create menubar
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        
        //create menus
        JMenu menuAbout = new JMenu("About");
        mb.add(menuAbout);
        
        //create MultiTasking
        JMenu menuMultitasking = new JMenu("Multitasking");
        mb.add(menuMultitasking);
        
        //Create Demo
        JMenu menuSingleDemo = new JMenu("Demo");
        mb.add(menuSingleDemo);
        
        JMenu clock = new JMenu("Digital Clock");
        mb.add(new DigitalClock());
        
        mItemAuthor = new JMenuItem("AuthorIdent...");
        mItemAuthor.addActionListener(menuItemHandler);
        
        mItemProbDescription = new JMenuItem("Prob Desc...");
        mItemProbDescription.addActionListener(menuItemHandler);
        
        mItemReferences = new JMenuItem("Refrences");
        mItemReferences.addActionListener(menuItemHandler);
        
        mItemBubbleSort = new JMenuItem("Bubble Sort");
        mItemBubbleSort.addActionListener(menuItemHandler);
        
        mItemSelectionSort = new JMenuItem("Selection Sort");
        mItemSelectionSort.addActionListener(menuItemHandler);
        
        mItemMergeSort = new JMenuItem("Merge Sort");
        mItemMergeSort.addActionListener(menuItemHandler);
        
        mItemQuickSort = new JMenuItem("Quick Sort");
        mItemQuickSort.addActionListener(menuItemHandler);
        
        mItemHeapSort = new JMenuItem("Heap Sort");
        mItemHeapSort.addActionListener(menuItemHandler);
        
        mItemShellSort = new JMenuItem("Shell Sort");
        mItemShellSort.addActionListener(menuItemHandler);
        
        //create submenu
        menuMultitasking.addSeparator();
        
        menuAbout.add(mItemAuthor);
        menuAbout.add(mItemProbDescription);
        menuAbout.add(mItemReferences);
        
        menuSingleDemo.add(mItemBubbleSort);
        menuSingleDemo.add(mItemSelectionSort);
        menuSingleDemo.add(mItemMergeSort);
        menuSingleDemo.add(mItemQuickSort);
        menuSingleDemo.add(mItemHeapSort);
        menuSingleDemo.add(mItemShellSort);
    }
    
    /**MenuItem Handler class*/
    private class MenuItemHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent ae){
            
            if(ae.getSource() == mItemAuthor)
            {
                iFrame = new AuthorIdentificationInternalFrame();
            }
            else if(ae.getSource() == mItemProbDescription){
                iFrame = new AssignmentDescriptionInternalFrame();
            }
            else if(ae.getSource() == mItemReferences){
                iFrame = new RefrencesInternalFrame();
            }
            else if(ae.getSource() == mItemBubbleSort){
                iFrame = new SortingDemoInternalFrame(lstSortAlg.get(0));
            }
            else if(ae.getSource() == mItemSelectionSort){
                iFrame = new SortingDemoInternalFrame(lstSortAlg.get(1));
            }
            else if(ae.getSource() == mItemMergeSort){
                iFrame = new SortingDemoInternalFrame(lstSortAlg.get(2));
            }
            else if(ae.getSource() == mItemQuickSort){
                iFrame = new SortingDemoInternalFrame(lstSortAlg.get(3));
            }
            else if(ae.getSource() == mItemHeapSort){
                iFrame = new SortingDemoInternalFrame(lstSortAlg.get(4));
            }
            else if(ae.getSource() == mItemShellSort){
                iFrame = new SortingDemoInternalFrame(lstSortAlg.get(5));
            }
            
            desktop.add(iFrame);
            setIFrameProperties(iFrame);
        }
        /**Set IFrame properties */
        public void setIFrameProperties(JInternalFrame iFrame){
            try{
            iFrame.moveToFront();
            } catch(Exception e){
                System.out.println(e.toString());
            }
        }
    }
    
}