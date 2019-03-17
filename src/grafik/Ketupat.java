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
public class Ketupat {
    public Ketupat(Graphics g, double position, double offsetY, double size){
        Graphics2D g2 = (Graphics2D)g;
        size = size/2;
        g2.drawString("Ketupat", (int) position, (int) offsetY);
        
        double x = position;
        double y = offsetY + 5;
        double x1_size = x + size;
        double y1_size = y + size;
        double x2_size = x1_size + size;
        double y2_size = y1_size + size;
        
        Point2D atas = new Point2D.Double(x1_size, y);
        Point2D kiri = new Point2D.Double(x, y1_size);
        Point2D bawah = new Point2D.Double(x1_size, y2_size);
        Point2D kanan = new Point2D.Double(x2_size, y1_size);
        Line2D l5 = new Line2D.Double(atas, kiri);
        Line2D l6 = new Line2D.Double(kiri, bawah);
        Line2D l7 = new Line2D.Double(bawah, kanan);
        Line2D l8 = new Line2D.Double(kanan, atas);
        g2.draw(l5);
        g2.draw(l6);
        g2.draw(l7); 
        g2.draw(l8);
    }
}
