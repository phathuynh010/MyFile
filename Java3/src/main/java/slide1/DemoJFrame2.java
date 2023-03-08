/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author PHÁT
 */
public class DemoJFrame2 extends WindowAdapter implements WindowListener{
    JFrame fr;

    public DemoJFrame2() {
        fr = new JFrame("JFrame");
        fr.setSize(500,300);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.addWindowListener(this);
        
    }
    public void windowClosed(WindowEvent e){
        System.exit(0);
    }
    
    public static void main(String[] args) {
        DemoJFrame2 dfr = new DemoJFrame2();
    }
}
