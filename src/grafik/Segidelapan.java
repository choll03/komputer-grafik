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
public class Segidelapan {
    public Segidelapan(Graphics g, double position, double offsetY, double size){
        Graphics2D g2 = (Graphics2D)g;
        size = size/3;
        g2.drawString("SegiDelapan", (int) position, (int) offsetY);
        
        double x = position;
        double y = offsetY + 5;
        double x1_size = x + size;
        double y1_size = y + size;
        double x2_size = x1_size + size;
        double y2_size = y1_size + size;
        double x3_size = x2_size + size;
        double y3_size = y2_size + size;
        
        Point2D atas_kiri = new Point2D.Double(x1_size, y);
        Point2D tengah_atas_kiri = new Point2D.Double(x, y1_size);
        Point2D tengah_bawah_kiri = new Point2D.Double(x, y2_size);
        Point2D bawah_kiri = new Point2D.Double(x1_size, y3_size);
        Point2D bawah_kanan = new Point2D.Double(x2_size, y3_size);
        Point2D tengan_bawah_kanan = new Point2D.Double(x3_size, y2_size);
        Point2D tengan_atas_kanan = new Point2D.Double(x3_size, y1_size);
        Point2D atas_kanan = new Point2D.Double(x2_size, y);
        Line2D l5 = new Line2D.Double(atas_kiri, tengah_atas_kiri);
        Line2D l6 = new Line2D.Double(tengah_atas_kiri, tengah_bawah_kiri);
        Line2D l7 = new Line2D.Double(tengah_bawah_kiri, bawah_kiri);
        Line2D l8 = new Line2D.Double(bawah_kiri, bawah_kanan);
        Line2D l9 = new Line2D.Double(bawah_kanan, tengan_bawah_kanan);
        Line2D l10 = new Line2D.Double(tengan_bawah_kanan, tengan_atas_kanan);
        Line2D l11 = new Line2D.Double(tengan_atas_kanan, atas_kanan);
        Line2D l12 = new Line2D.Double(atas_kiri, atas_kanan);
        g2.draw(l5);
        g2.draw(l6);
        g2.draw(l7); 
        g2.draw(l8);
        g2.draw(l9);
        g2.draw(l10);
        g2.draw(l11);
        g2.draw(l12);
    }
}
