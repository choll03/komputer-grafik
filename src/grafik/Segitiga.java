/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafik;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JPanel;

/**
 *
 * @author Dev
 */
public class Segitiga extends JPanel{

    
    public Segitiga(Graphics g, double position, double offsetY, double size) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawString("Segitiga", (int) position, (int) offsetY);
        
        double x = position;
        double y = offsetY + 5;
        double x_size = x + size;
        double y_size = y + size;
        Point2D atas_kiri = new Point2D.Double(x, y);
        Point2D bawah_kiri = new Point2D.Double(x, y_size);
        Point2D bawah_kanan = new Point2D.Double(x_size, y_size);
        Line2D l2 = new Line2D.Double(atas_kiri, bawah_kiri);
        Line2D l3 = new Line2D.Double(bawah_kiri, bawah_kanan);
        Line2D l4 = new Line2D.Double(bawah_kanan, atas_kiri);
        g2.draw(l2);
        g2.draw(l3);
        g2.draw(l4);
    }
    
}
