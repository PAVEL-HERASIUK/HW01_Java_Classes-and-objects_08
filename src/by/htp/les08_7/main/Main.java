package by.htp.les08_7.main;

import by.htp.les08_7.entity.Triangle;
import by.htp.les08_7.logic.TriangleLogic;
import by.htp.les08_7.view.PrintTriangleValues;

public class Main {

	public static void main(String[] args) {

		Triangle triangle = new Triangle(new double[] { 0, 0 }, new double[] { 0, 3 }, new double[] { 4, 0 });
		TriangleLogic trlogic = new TriangleLogic();

		PrintTriangleValues print = new PrintTriangleValues();
		print.printPointCoordinates(" Треугольник сверху A ", triangle.getPointA());
		print.printPointCoordinates(" Треугольник сверху B ", triangle.getPointB());
		print.printPointCoordinates(" Треугольник сверху C ", triangle.getPointC());
		print.printValues(" Периметр ", trlogic.countPerimeter(triangle));
		print.printValues(" Квадрат ", trlogic.countSquare(triangle));
		print.printPointCoordinates(" Срединное пересечение ", trlogic.medianIntersection(triangle));
	}
}
