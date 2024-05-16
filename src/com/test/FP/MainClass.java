package com.test.FP;

public class MainClass {
    //Example of factory DEsign Pattern
	public static void main(String[] args) {
		ShapeFactory shapeFactoryObj = new ShapeFactory();
		Shape shapeObj = shapeFactoryObj.getShape("CIRCLE");
		shapeObj.draw();
	}

}
