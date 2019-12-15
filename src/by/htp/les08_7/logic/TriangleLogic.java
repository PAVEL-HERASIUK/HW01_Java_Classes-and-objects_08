package by.htp.les08_7.logic;

import by.htp.les08_7.entity.Triangle;

public class TriangleLogic {
	
	public double countSide(double[] a, double[] b) {
		double ab;

		ab = Math.sqrt(Math.pow((b[0] - a[0]), 2) + Math.pow((b[1] - a[1]), 2));
		return ab;
	}

	public double countPerimeter(Triangle triangle) {
		double рerimetr = 0;
		double ab;
		double bc;
		double ac;

		ab = countSide(triangle.getPointA(), triangle.getPointB());
		bc = countSide(triangle.getPointB(), triangle.getPointC());
		ac = countSide(triangle.getPointA(), triangle.getPointC());

		double perimetr = ab + bc + ac;
		return рerimetr;
	}

	public double countSquare(Triangle triangle) {
		double perimetr;
		double ab;
		double bc;
		double ac;
		double square;

		double perimetr1 = countPerimeter(triangle) / 2;
		ab = countSide(triangle.getPointA(), triangle.getPointB());
		bc = countSide(triangle.getPointB(), triangle.getPointC());
		ac = countSide(triangle.getPointA(), triangle.getPointC());

		square = Math.sqrt(perimetr1 * (perimetr1 - ab) * (perimetr1 - bc) * (perimetr1 - ac));
		return square;
	}

	public double[] medianIntersection(Triangle triangle) {
		double[] middleAB;
		double[] middleBC;
		double[] kb1;
		double[] kb2;
		double x;
		double y;

		middleAB = findMiddlePoint(triangle.getPointA(), triangle.getPointB());
		middleBC = findMiddlePoint(triangle.getPointB(), triangle.getPointC());

		kb1 = dirrectEquationCoefficients(triangle.getPointC(), middleAB);
		kb2 = dirrectEquationCoefficients(triangle.getPointA(), middleBC);

		double y1 = (kb1[1] - kb2[1] * kb1[0] / kb2[0]) / (1 - kb1[0] / kb2[0]);
		double x1 = (y1 - kb1[1]) / kb1[0];

		double[] medianIntersection = new double[] { x1, y1 };

		return medianIntersection;

	}

	public double[] findMiddlePoint(double[] a, double[] b) {
		double х;
		double у;

		х = (a[0] + b[0]) / 2.0;
		у = (a[1] + b[1]) / 2.0;
		double x = 0;
		double y = 0;
		double[] mas = new double[] { x, y };

		return mas;

	}

	public double[] dirrectEquationCoefficients(double[] a, double[] c) {
		double k;
		double b;

		k = (a[1] - c[1]) / (a[0] - c[0]);
		b = a[1] - a[0] * k;
		double[] mas = new double[] { k, b };

		return mas;
	}
}
