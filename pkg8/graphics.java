package chapter.pkg8;

import java.awt.*;
import javax.swing.*;

public class graphics extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("Algerian", Font.BOLD, 24));
        g.drawString("FOX COOKIE FOR THE WIN!!", 10, 50);

        g.setColor(Color.MAGENTA);
        g.drawLine(5, 30, 80, 30);

        // Draw the base of the cookie (a large brown circle)
        g.setColor(new Color(210, 105, 30));  // Brown color for the cookie base
        g.fillOval(50, 100, 250, 250);

        // Draw chocolate chips as small circles
        g.setColor(Color.DARK_GRAY);
        g.fillOval(90, 150, 20, 20);
        g.fillOval(180, 180, 15, 15);
        g.fillOval(250, 200, 25, 25);
        g.fillOval(150, 250, 20, 20);
        g.fillOval(220, 140, 15, 15);
        g.fillOval(120, 220, 15, 15);
        g.fillOval(190, 280, 20, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        graphics panel = new graphics();
        frame.add(panel);

        frame.setVisible(true);
    }
}
