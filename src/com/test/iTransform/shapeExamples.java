package com.test.iTransform;
abstract class Shape {
    abstract void draw();
}

class Line extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a line.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

class Cube extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a cube.");
    }
}

public class shapeExamples {

	public static void main(String[] args) {
      Shape[] shapes = new Shape[]{new Line(), new Rectangle(), new Cube()};
        
        for (Shape shape : shapes) {
            shape.draw();
        }
	}

}

/*
 * The line Shape[] shapes = new Shape[]{new Line(), new Rectangle(), new
 * Cube()}; is an example of polymorphism, a key concept in object-oriented
 * programming.
 * 
 * Here’s what’s happening in this line:
 * 
 * Shape[] shapes declares an array of Shape references. Remember, while you
 * can’t instantiate an abstract class, you can declare and use a reference
 * variable of the abstract class type. new Shape[]{new Line(), new Rectangle(),
 * new Cube()}; creates new instances of Line, Rectangle, and Cube, and assigns
 * their references to the elements of the Shape array. So, even though Shape is
 * an abstract class and you can’t create an instance of it, you can create
 * instances of its subclasses (Line, Rectangle, Cube) and refer to these
 * instances using a Shape reference.
 * 
 * This allows us to treat objects of different classes in a uniform way (as
 * Shape objects), which is the essence of polymorphism. In the loop that
 * follows, each shape is drawn, and the correct draw() method is called
 * depending on the actual type of the object, even though the type of the
 * reference is just Shape. This is known as dynamic method dispatch. It’s a
 * powerful feature that lets you write more flexible and reusable code.
 */




