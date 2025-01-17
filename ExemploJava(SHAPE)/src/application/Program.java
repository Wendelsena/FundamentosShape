package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectagle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {

		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectagle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.2f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Retangle area: " + String.format("%.2f", s2.area()));
		

	}

}
