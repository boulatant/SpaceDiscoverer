/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package real_life_simulation;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author bulat
 */
public class Real_life_simulation extends JFrame {

    public static Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
    public static int width;
    public static int height;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        width = resolution.width;
        height = resolution.height;
        // TODO code application logic here
        Real_life_simulation rls = new Real_life_simulation();
    }

    public Real_life_simulation() {
        setBounds(0, 0, width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Real Life Simulation");
        setResizable(false);
        setUndecorated(true);
        add(new Project(this,width,height));
        setVisible(true);
    }
}
