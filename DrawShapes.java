/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.drawshapes;
/*
 *
 * @author Shumokh, Mawaddah, Deema
 * @version 14 February, 2023
 * Lab3 DrawShapes
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.util.Scanner;

public class DrawShapes extends JFrame {

    private static final long serialVersionUID = 1L;
    Color chosenColor; // declare an instance variable for the chosen color

    public DrawShapes(Car myShape) {
        // constructor for the DrawShapes class that takes a Car object as a parameter

        setSize(new Dimension(320, 320)); // set the size of the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the default close operation
        setVisible(true); // set the JFrame to be visible

        JPanel p; // declare a JPanel variable
        p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;

                // prompt user for color choice
                Scanner sc = new Scanner(System.in);
                System.out.println("Choose the color black/red/yellow/blue/pink "
                        + "for the car wheels :");
                String input = sc.nextLine();

                // set the chosen color based on the user's input
                switch (input) {
                    case "black":
                    case "Black":
                        chosenColor = Color.black;
                        break;
                    case "red":
                    case "Red":
                        chosenColor = Color.red;
                        break;
                    case "yellow":
                    case "Yellow":
                        chosenColor = Color.yellow;
                        break;
                    case "blue":
                    case "Blue":
                        chosenColor = Color.blue;
                        break;
                    default:
                        chosenColor = Color.pink; // default color
                        break;
                }

                g2.setPaint(myShape.cCar);
                g2.fill(myShape.rectTop);
                g2.fill(myShape.rectBottom);
                g2.setPaint(Color.pink);
                g2.draw(myShape.rectTop);
                g2.draw(myShape.rectBottom);

                // use the chosen color to draw circles
                g2.setPaint(chosenColor);
                g2.fill(myShape.circleL);
                g2.fill(myShape.circleR);
                g2.draw(myShape.circleL);
                g2.draw(myShape.circleR);
            }
        };

        setTitle("My Shapes"); // set the title of the JFrame
        this.getContentPane().add(p); // add the JPanel to the content pane
    }

    public static void main(String arg[]) {
        
        Car car = new Car(); // create a new Car object

        // prompt user for color choice
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the color black/red/yellow/blue/pink "
                + "for the car  :");
        String input2 = sc.nextLine();

        // set the color of the car based on the user's input
        if ("black".equals(input2) || "Black".equals(input2)) {
            car.setColor(Color.black);
        } else if ("red".equals(input2) || "Red".equals(input2)) {
            car.setColor(Color.red);
        } else if ("yellow".equals(input2) || "Yellow".equals(input2)) {
            car.setColor(Color.yellow);
        } else if ("blue".equals(input2) || "Blue".equals(input2)) {
            car.setColor(Color.blue);
        } else {
                    car.setColor(Color.pink); // default color
        }
        
        
        
        // Executes the following code on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            // Implementing the run() method of the Runnable interface
            @Override
            public void run() {
                // Create a new DrawShapes object and pass in the car object
                DrawShapes ds = new DrawShapes(car);
                // Move the car by 70 pixels
                car.move(70);
                // Repaint the DrawShapes object to show the updated position of the car
                ds.repaint();
            }
        });

    }
}

