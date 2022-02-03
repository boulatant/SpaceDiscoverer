/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package real_life_simulation;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

/**
 *
 * @author bulat
 */
public class Project extends JPanel {

    List<Point> points = new ArrayList();
    int width_s;
    int height_s;
    double deg_convert_exp = (180 / Math.PI);
    double speed = 0.1;
    Vector3 cam_pos = new Vector3(0, 0, 0);
    Timer timer = new Timer(5, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    });

    public Project(JFrame f, int width, int height) {
        width_s = width;
        height_s = height;
        setBackground(new Color(0, 0, 0));
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                points.add(new Point(i, j, 0, 1, new Color((int) (Math.round(Math.random() * 255)), (int) (Math.round(Math.random() * 255)), (int) (Math.round(Math.random() * 255)))));
            }
        }
        /*points.add(new Point(-10, 20, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(-10, 15, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(-10, 10, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(-10, 5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(-10, 0, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(-10, -5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(-10, -10, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(-10, -15, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(-10, -20, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(-5, -20, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(0, -17.5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(5, -15, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(5, -10, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(0, -5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(2.5, -5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(-5, 0, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(0, 2.5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(2.5, 5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(5, 7.5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(5, 10, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(2.5, 15, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(-2.5, 20, 1, 5, new Color(255, 255, 255)));

        points.add(new Point(20, -20, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(20, -15, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(20, -10, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(20, -5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(20, 0, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(20, 5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(22.5, 10, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(25, 15, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(27.5, 20, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(30, 15, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(32.5, 10, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(35, 5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(35, 0, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(35, -5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(35, -10, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(35, -15, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(35, -20, 1, 5, new Color(255, 255, 255)));

        points.add(new Point(50, -20, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(50, -15, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(50, -10, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(50, -5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(50, 0, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(50, 5, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(50, 10, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(50, 15, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(50, 20, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(55, 20, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(60, 20, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(65, 20, 1, 5, new Color(255, 255, 255)));
        points.add(new Point(70, 20, 1, 5, new Color(255, 255, 255)));*/

        timer.start();
        f.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if (e.getKeyCode() == 27) {
                    System.exit(0);
                }
                if (e.getKeyCode() == 87) {
                    for (Point p : points) {
                        p.z -= speed;
                        cam_pos.z -= speed;
                    }
                }

                if (e.getKeyCode() == 83) {
                    for (Point p : points) {
                        p.z += speed;
                        cam_pos.z += speed;
                    }
                }
                if (e.getKeyCode() == 65) {
                    for (Point p : points) {
                        p.x += speed;
                        cam_pos.x += speed;
                    }
                }
                if (e.getKeyCode() == 68) {
                    for (Point p : points) {
                        p.x -= speed;
                        cam_pos.x -= speed;
                    }
                }
                if (e.getKeyCode() == 32) {
                    for (Point p : points) {
                        p.y += speed;
                        cam_pos.y += speed;
                    }
                }
                if (e.getKeyCode() == 18) {
                    for (Point p : points) {
                        p.y -= speed;
                        cam_pos.y -= speed;
                    }
                }
                if (e.getKeyCode() == 40) {
                    for (Point p : points) {
                        p.y = Math.cos(speed * 100 / deg_convert_exp) * p.y - Math.sin(speed * 100 / deg_convert_exp) * p.z;

                        p.z = Math.cos(speed * 100 / deg_convert_exp) * p.z + Math.sin(speed * 100 / deg_convert_exp) * p.y;
                    }
                }
                if (e.getKeyCode() == 38) {
                    for (Point p : points) {
                        p.y = Math.cos(-speed * 100 / deg_convert_exp) * p.y - Math.sin(-speed * 100 / deg_convert_exp) * p.z;

                        p.z = Math.cos(-speed * 100 / deg_convert_exp) * p.z + Math.sin(-speed * 100 / deg_convert_exp) * p.y;
                    }
                }
                if (e.getKeyCode() == 39) {
                    for (Point p : points) {
                        p.x = Math.cos(-speed * 100 / deg_convert_exp) * p.x + Math.sin(-speed * 100 / deg_convert_exp) * p.z;

                        p.z = Math.cos(-speed * 100 / deg_convert_exp) * p.z - Math.sin(-speed * 100 / deg_convert_exp) * p.x;
                    }
                }
                if (e.getKeyCode() == 37) {
                    for (Point p : points) {
                        p.x = Math.cos(speed * 100 / deg_convert_exp) * p.x + Math.sin(speed * 100 / deg_convert_exp) * p.z;

                        p.z = Math.cos(speed * 100 / deg_convert_exp) * p.z - Math.sin(speed * 100 / deg_convert_exp) * p.x;
                    }
                }
                if (e.getKeyCode() == 69) {
                    for (Point p : points) {
                        p.x = Math.cos(-speed * 100 / deg_convert_exp) * p.x - Math.sin(-speed * 100 / deg_convert_exp) * p.y;

                        p.y = Math.sin(-speed * 100 / deg_convert_exp) * p.x + Math.cos(-speed * 100 / deg_convert_exp) * p.y;
                    }
                }
                if (e.getKeyCode() == 81) {
                    for (Point p : points) {
                        p.x = Math.cos(speed * 100 / deg_convert_exp) * p.x - Math.sin(speed * 100 / deg_convert_exp) * p.y;

                        p.y = Math.sin(speed * 100 / deg_convert_exp) * p.x + Math.cos(speed * 100 / deg_convert_exp) * p.y;
                    }
                }

            }
        }
        );
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Point p : points) {
            if (p.z > 0) {
                g.setColor(p.color);
                double x_inScreen = p.x / p.z;
                double y_inScreen = p.y / p.z;
                //int x_inScreen = (p.x - p.weight);
                //int y_inScreen = (p.y - p.weight);
                if (p.weight / p.z <= 2) {
                    g.fillOval((int) (width_s / 2 + x_inScreen * width_s), (int) (height_s / 2 + y_inScreen * height_s), 2, 2);

                } else {
                    g.fillOval((int) (width_s / 2 + x_inScreen * width_s), (int) (height_s / 2 + y_inScreen * height_s), (int) (p.weight / p.z), (int) (p.weight / p.z));
                }
            }
        }
        g.setColor(Color.GREEN);
        g.setFont(new Font(Font.MONOSPACED, 1, 20));
        g.drawString(Double.toString(cam_pos.x), 200, 100);
        g.drawString(Double.toString(cam_pos.y), 300, 100);
        g.drawString(Double.toString(cam_pos.z), 400, 100);
//points.add(new Point((int) (Math.round(Math.random() * width_s)), (int) (Math.round(Math.random() * height_s)), 1 + (int) (Math.round(Math.random() * 5)), (int) (Math.round(Math.random() * 5)), new Color((int) (Math.round(Math.random() * 255)), (int) (Math.round(Math.random() * 255)), (int) (Math.round(Math.random() * 255)))));
        repaint();
    }
}
