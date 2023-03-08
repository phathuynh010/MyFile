
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PHÁT
 */
public class bai1_SwingcontrolDemo extends JFrame{
    JLabel jLabel_header;
    JLabel jLabel_status;
    JCheckBox jCheckbox_apple;
    JCheckBox jCheckbox_mango;
    JCheckBox jCheckbox_peer;
    JLabel jLabel_apple;
    JLabel jLabel_mango;
    JLabel jLabel_peer;
    public bai1_SwingcontrolDemo() {
    init();
    this.setVisible(true);
    }
    public void init(){
        this.setTitle("Bài 1");
        this.setSize(500,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
