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
	// metodo para retornar a area do retangulo
	public double Area() {
		//verificando se a largura e altura sao numeros positivos
		
		if(getWidth() <= 0 || getHeight() <= 0) {
			throw new IllegalArgumentException("Largura e altura devem ser números positivos");
		}
		return getWidth() * getHeight();
	}
	// metodo que retorna o perimetro
	public double Perimeter() {
		return 2 * (getWidth() + getHeight());
	}
	//metodo que retorna a diagonal 
	public double Diagonal() {
		return Math.sqrt((getWidth()*getWidth()) + (getHeight() * getHeight()));
	}
	
}
