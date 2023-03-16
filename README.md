# Car

# class description

Car.java defines a class ”Car” that creates a car shape consisting of a top rectangle, bottom rectangle,
and two circles for wheels. The class includes instance variables for the car’s color, position, and each of its
components. It also has methods to change the car’s color and move it to a new position.
DrawShapes.java defines a class ”DrawShapes” that extends JFrame and includes a constructor that takes a
Car object as a parameter. It creates a JPanel that prompts the user to choose a color for the car’s wheels,
which is then used to fill the circles. The class also includes methods for drawing the car’s components and
making the JFrame visible.


# Analysis
- Input: Car object as input in the constructor, user will input car color, and wheel color.

- Output: Graphical representation of the car object, with a dialog prompt that requests the user to choose
a color for the car’s wheels.The user’s input is then processed and used to update the color of the car’s wheels.

- Process: Car.java has instance variables to represent the current color of the car and its position. It
also has methods to change the car’s color and move it to a new position.
DrawShapes.java defines a Java class named DrawShapes that extends JFrame and takes a Car object as
a parameter. It creates a window with a size of 320x320 pixels and a JPanel to draw the Car object. The
paintComponent method of the JPanel is overridden to draw the car and prompt the user for a color choice
for the wheels. The chosenColor is then used to fill and draw the left and right wheel circles of the Car
object.

# Execution
![runCar3](https://user-images.githubusercontent.com/106381596/225746718-771a0583-b05f-45ab-baa3-b508630502df.png)
![runCar2](https://user-images.githubusercontent.com/106381596/225746723-fa2fea3a-4485-4ee2-a5b5-4ea01a8c9d60.png)
![runCar1](https://user-images.githubusercontent.com/106381596/225746725-0a51b099-4d15-4083-9ca5-63f4c311e3cb.png)

