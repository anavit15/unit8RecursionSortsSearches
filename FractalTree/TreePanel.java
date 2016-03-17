//********************************************************************
//  KochPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BasicStroke;


public class TreePanel extends JPanel
{
   private final int PANEL_WIDTH = 800;
   private final int PANEL_HEIGHT = 800;
   
  
   private double bAngle;
   private double lFraction;
   private double width;
   public TreePanel ()
   {
      setBackground (Color.white);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
      bAngle=25;
      lFraction=.5;
   }

   public void drawTree (Graphics2D g2, double x1, double y1, double angle, double length)
   {
       if (length<=1)
       {
           return;
       }
       
       else 
       {
           double x2=x1-(Math.sin(Math.toRadians(angle))*length);
           double y2=y1-(Math.cos(Math.toRadians(angle))*length);
           
//            if (length<21)
//            {
//                g2.setColor(Color.GREEN);
//            }
//            else
//            {
//                Color color =new Color(164,72,1);
//                g2.setColor(color);
//             }
           
           float width=(float)(length*((.4*.5)));
           g2.setStroke(new BasicStroke(width));
           
           g2.draw(new Line2D.Double(x1,y1,x2,y2));
           drawTree(g2,x2,y2,angle-bAngle,(length-5));
           drawTree(g2,x2,y2,angle+bAngle,(length-5));
           
        }
           
   }
   
   public void paintComponent (Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2=(Graphics2D)g;
      g2.setColor(Color.BLACK);
      drawTree(g2,400,700,0,60);
   }

}
