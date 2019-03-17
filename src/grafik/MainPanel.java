/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Dev
 */
class MainPanel extends JPanel{
    private double x = 800;
    private double y = 500;
    private double offsetX = 80;
    private double offsetY = 60;
    private double size = 80;
    
    public MainPanel() {
        this.setPreferredSize(new Dimension((int) this.x, (int) this.y));
        this.setBackground(Color.WHITE);
    }
    public void paintComponent(Graphics g) {
          super.paintComponent(g);
//          double position1 = (this.x + (1 * this.offsetX)) - this.x;
//          double position2 = position1 + 100;
//          double position3 = position2 + 100;
//          double position4 = position3 + 150;
          Graphics2D g2 = (Graphics2D)g;
          g2.setColor(Color.RED);
          Rectangle2D rec = new Rectangle2D.Double(this.offsetX, this.offsetY, 200, 100);
          g2.draw(new Arc2D.Double(this.offsetX, this.offsetY - 25, 100, 50, 0, 180, Arc2D.OPEN));
          g2.draw(new Arc2D.Double(this.offsetX + 100, this.offsetY - 25, 100, 50, 0, 180, Arc2D.OPEN));
          g2.draw(new Arc2D.Double(this.offsetX - 25, this.offsetY, 50, 50, 90, 180, Arc2D.OPEN));
          g2.draw(new Arc2D.Double(this.offsetX - 25, this.offsetY + 50, 50, 50, 90, 180, Arc2D.OPEN));
          g2.draw(new Arc2D.Double(this.offsetX, this.offsetY + 75, 100, 50, 180, 180, Arc2D.OPEN));
          g2.draw(new Arc2D.Double(this.offsetX + 100, this.offsetY + 75, 100, 50, 180, 180, Arc2D.OPEN));
          g2.draw(new Arc2D.Double(this.offsetX + 175, this.offsetY, 50, 50, 270, 180, Arc2D.OPEN));
          g2.draw(new Arc2D.Double(this.offsetX + 175, this.offsetY + 50, 50, 50, 270, 180, Arc2D.OPEN));
          g2.draw(rec);
          
          int py = (int) (this.offsetY + 200);
          int px = (int) this.offsetX;
          Polygon panah = new Polygon();
          panah.addPoint(px + 50, py);
          panah.addPoint(px + 50, py+ 100);
          panah.addPoint(px, py +100);
          panah.addPoint(px + 75, py + 150);
          panah.addPoint(px + 150, py+ 100);
          panah.addPoint(px + 100, py + 100);
          panah.addPoint(px + 100, py);
          g2.draw(panah);
          
          g2.draw(new Ellipse2D.Double(this.offsetX + 280, this.offsetY, 200, 200));
          g2.draw(new Ellipse2D.Double(this.offsetX + 320, this.offsetY + 50, 30, 30));
          g2.draw(new Ellipse2D.Double(this.offsetX + 420, this.offsetY + 50, 30, 30));
          QuadCurve2D q = new QuadCurve2D.Float();
          q.setCurve(this.offsetX + 320, this.offsetY + 150, this.offsetX + 370 , this.offsetY+200, this.offsetX + 420, this.offsetY + 150 );
          g2.draw(q);
          q.setCurve(this.offsetX + 350, this.offsetY + 150, this.offsetX + 370 , this.offsetY+200, this.offsetX + 420, this.offsetY + 150 );
          g2.draw(q);
          
          
          
          
//          QuadCurve2D q = new QuadCurve2D.Float();
//          q.setCurve(10, 10, 250, 100, 500, 10 );
//            CubicCurve2D c = new CubicCurve2D.Double();
//            c.setCurve(5, 10, 90, 60, 5, 250, 100, 10);
//            Rectangle2D rec = new Rectangle2D.Double(this.offsetX, 10, 200, 100);
//            g2.draw(rec);
//            g2.draw(new RoundRectangle2D.Double(220 + this.offsetX, 10, 200, 100, 50, 50));
//            g2.draw(new Ellipse2D.Double(this.offsetX, 120, 200, 100));
//            g2.draw(new Arc2D.Double(300, 120, 200, 100, 0, 180, Arc2D.CHORD));
//            
//            Polygon panah = new Polygon();
//            panah.addPoint((int) this.offsetX, 325);
//            panah.addPoint((int) this.offsetX, 350);
//            panah.addPoint((int) (this.offsetX + 50), 350);
//            panah.addPoint((int) this.offsetX + 50, 375);
//            panah.addPoint((int) (this.offsetX + 100), 350);
//            panah.addPoint((int) (this.offsetX+ 50), 300);
//            panah.addPoint((int) (this.offsetX + 50), 325);
//            g2.draw(panah);
          
          
//          g2.drawRect(150, 55 , 100, 40);
          g2.drawString("Created By : ISMAIL", 10, (int) (this.y - 10));
//          g2.setColor(Color.BLUE);
//          new Segitiga(g2, position1, this.offsetY, this.size);
//          g2.setColor(Color.GREEN);
//          new Ketupat(g2, position2, this.offsetY, this.size);
//          g2.setColor(Color.ORANGE);
//          new Trapesium(g2, position3, this.offsetY, this.size);
//          g2.setColor(Color.RED);
//          new Segidelapan(g2, position4, this.offsetY, this.size);
    }
    
    
    
}
