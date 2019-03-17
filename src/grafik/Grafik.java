/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafik;

import javax.swing.JFrame;

/**
 *
 * @author Dev
 */
public class Grafik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Komputer Grafik");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MainPanel panel = new MainPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
