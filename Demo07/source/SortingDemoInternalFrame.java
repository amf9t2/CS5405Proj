package code;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.*;
/**
 @author Altamash M Fakki
 @version 2.0
 */
/** SortingDemoInternalFrame class extends JInternalFrame*/
public class SortingDemoInternalFrame extends JInternalFrame implements Runnable
{
    Sort sort;
    int w=1000, h=500;
    JButton btnStart, btnPause, btnStop ;
    Container c = getContentPane();
    ButtonHandler handler ;

    private int speed = 10;
    private boolean resumed = true;

    /**Constructor for SortingDemoInternalFrame*/
    public SortingDemoInternalFrame (Sort sortObj)
    {
        super(sortObj.getClass().getName() + "Demo", true, true, true,true);
        setSize(new Dimension(w,h));
        setVisible(true);
        setOpaque(true);
        c.setLayout(new FlowLayout());
        this.sort = sortObj;

        Executor executor = Executors.newFixedThreadPool(1);
        executor.execute(this);

        addControls();

        
        c.add(btnStart);
        c.add(btnPause);
        c.add(btnStop);
        
        GridPanel gp = new GridPanel();
        c.add(gp);
        moveToFront();
    }
    
    /**Paint method */
    public void paint(Graphics g)
	{
        super.paintComponent (g);
        sort.algorithm();
	}
    
    public void addControls(){
        handler = new ButtonHandler() ;
        btnStart = new JButton("Start");
        btnPause = new JButton("Pause");
        btnStop = new JButton("Stop");
        btnStart.addActionListener(handler);
        btnPause.addActionListener(handler);
        btnStop.addActionListener(handler);
    }
    public void run(){
//        while (true)
//        {
//            if (resumed)
//            {
//
//                repaint();
//                    // wait to see
//            //try {Thread.sleep(speed);}
//            //	catch (InterruptedException ex){}
//            }
//            // wait to see
//            try {
//                Thread.sleep(speed);
//            }
//            catch (InterruptedException ex){}
//        }
    }

    public void start(){

    }

    public void pause(){

    }

    public void stop(){

    }
    private class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            JButton btn = (JButton) ae.getSource();
            
            if(btn == btnStart){
                
            }
            else if(btn == btnPause){
                
            }
            else if(btn == btnStop){
                
            }
        }
    }


}
