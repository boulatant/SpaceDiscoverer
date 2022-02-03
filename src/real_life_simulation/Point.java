/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package real_life_simulation;

import java.awt.Color;

/**
 *
 * @author bulat
 */
public class Point {

    double x;
    double y;
    double z;
    double weight;
    Color color;

    public Point(double x_p, double y_p, double z_p, double w, Color c) {
        x = x_p;
        y = y_p;
        z = z_p;
        weight = w;
        color = c;
    }
}
