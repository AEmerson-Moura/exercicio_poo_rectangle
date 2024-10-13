package entities;

public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double Area() {
		return getWidth() * getHeight();
	}
	public double Perimeter() {
		return 2 * (getWidth() + getHeight());
	}
	public double Diagonal() {
		return Math.sqrt((getWidth()*getWidth()) + (getHeight() * getHeight()));
	}
	
}
