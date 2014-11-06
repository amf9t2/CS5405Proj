package code;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.concurrent.*;


/**
 @author Altamash M Fakki
 @version 2.0
 */
/** DigitalClock class extends JLabel implements Runnable*/
//References

public class DigitalClock extends JLabel implements Runnable
{
    
    public DigitalClock()
    {
        setHorizontalAlignment(JLabel.HORIZONTAL);
		setForeground(Color.BLACK);//not honored some places
		setText(new Date().toString());
		setFont( new Font("Aerial",Font.BOLD,14));
        
        Executor executor = Executors.newFixedThreadPool(1);
        executor.execute(this);
    }
    
    public void run(){
        while(true){
            setText(new Date().toString());
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ex){
            };
        }
    }
}
