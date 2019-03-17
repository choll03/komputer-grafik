/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafik;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Dev
 */
public class Trapesium {
    public Trapesium(Graphics g, double position, double offsetY, double size){
        Graphics2D g2 = (Graphics2D)g;
        g2.drawString("Trapesium", (int) position, (int) offsetY);
        
        double x = position;
        double y = offsetY + 5;
        double x1_size = x + (size + 50);
        double y1_size = y + (size - 20);
        double miring = 20;
        
        Point2D atas_kiri = new Point2D.Double((x+miring), y);
        Point2D atas_kanan = new Point2D.Double((x1_size-miring), y);
        Point2D bawah_kiri = new Point2D.Double(x, y1_size);
        Point2D bawah_kanan = new Point2D.Double(x1_size, y1_size);
        Line2D l5 = new Line2D.Double(atas_kiri, bawah_kiri);
        Line2D l6 = new Line2D.Double(bawah_kiri, bawah_kanan);
        Line2D l7 = new Line2D.Double(bawah_kanan, atas_kanan);
        Line2D l8 = new Line2D.Double(atas_kanan, atas_kiri);
        g2.draw(l5);
        g2.draw(l6);
        g2.draw(l7); 
        g2.draw(l8);
    }
}
