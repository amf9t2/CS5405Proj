package code;

//DemoFrame POJO
import javax.swing.*;
import java.awt.*;
/**
 @author Altamash M Fakki
 @version 2.0
 */
/**DemoFrame extends jFrame*/
public class DemoFrame extends JFrame
{
    /**Constructor for DemoFrame*/
    public DemoFrame(JApplet demo, String str) {
        super(str);
        
        setSize(1300,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().add(demo);
        if(demo instanceof JApplet){
            demo.init();
        }
    }
}