import javax.swing.*;
import java.awt.*;

public class lab3 extends JFrame {

    public static void main(String[] args) {
        new lab3("lab3_task1", 650, 400);
    }

    lab3(String s, int w, int h) {

        super(s);
        setSize(w, h);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jpanel = new JPanel();
        Font myFont1 = new Font("Serif", Font.ITALIC, 18);
        Color textColor = new Color(150, 75, 0);

        JButton drawEllipse = new JButton("Draw green ellipse");
        drawEllipse.addActionListener(actionEvent -> {
            Graphics g = getContentPane().getGraphics();
            g.setColor(textColor);
            g.setFont(myFont1);
            g.drawString("Ellipse",100,270);
            g.drawString("Green",102,290);
            
            g.setColor(Color.GREEN);
            g.fillOval(75, 100, 100, 150);
        });
        jpanel.add(drawEllipse);

        JButton drawTriangle = new JButton("Draw blue equilateral triangle");
        drawTriangle.addActionListener(actionEvent -> {
            Graphics g = getContentPane().getGraphics();
            g.setColor(textColor);
            g.setFont(myFont1);
            g.drawString("Equilateral triangle",250,270);
            g.drawString("Blue",310,290);
            
            g.setColor(Color.BLUE);
            Polygon p = new Polygon();
            p.addPoint(240, 250);
            p.addPoint(410, 250);
            p.addPoint(325, 100);

            
            g.fillPolygon(p);
        });
        jpanel.add(drawTriangle);

        JButton drawPentagon = new JButton("Draw red pentagon");//8
        drawPentagon.addActionListener(actionEvent -> {
            Graphics g = getContentPane().getGraphics();
            g.setColor(textColor);
            g.setFont(myFont1);
            g.drawString("Pentagon", 490, 270);
            g.drawString("Red", 510, 290);

            g.setColor(Color.RED);
            Polygon p = new Polygon();
            p.addPoint(480, 245);
            p.addPoint(570, 245);
            p.addPoint(600, 160);
            p.addPoint(525, 100);
            p.addPoint(450, 160);
            
            g.fillPolygon(p);
        });
        jpanel.add(drawPentagon);

        add(jpanel);

        jpanel.revalidate();
        jpanel.repaint();
        revalidate();
        repaint();
    }
}
