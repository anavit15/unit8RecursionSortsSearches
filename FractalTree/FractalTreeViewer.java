//********************************************************************
//  KochSnowflakeViewer.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of recursion.
//  @gcschmit (19 July 2014): converted from an applet to an application
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FractalTreeViewer extends JFrame
{
    private final int WIDTH = 800;
    private final int HEIGHT = 800;

    private JLabel titleLabel;
    private TreePanel drawing;
    private JPanel panel, tools;
    private JFrame frame;

    public static void main(String[] args)
    {
        FractalTreeViewer viewer = new FractalTreeViewer();
    }

    public FractalTreeViewer()
    {
        titleLabel = new JLabel ("Fractal Tree Snowflake");
        //titleLabel.setForeground (Color.black);

        drawing = new TreePanel ();

        panel = new JPanel();
        panel.add (drawing);

        frame = new JFrame();
        frame.setTitle("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }

}
