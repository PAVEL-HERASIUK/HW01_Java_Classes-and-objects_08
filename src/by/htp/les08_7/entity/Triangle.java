package by.htp.les08_7.entity;

import java.util.Arrays;

public class Triangle {
	// 7. Описать класс, представляющий треугольник. Предусмотреть методы для
	// создания объектов, вычисления площади, периметра и точки пересечения медиан.
	private double[] pointA = new double[2];
	private double[] pointB = new double[2];
	private double[] pointC = new double[2];

	public Triangle() {
	}

	public Triangle(double[] pointA, double[] pointB, double[] pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public double[] getPointA() {
		return pointA;
	}

	public void setPointA(double[] pointA) {
		this.pointA = pointA;
	}

	public double[] getPointB() {
		return pointB;
	}

	public void setPointB(double[] pointB) {
		this.pointB = pointB;
	}

	public double[] getPointC() {
		return pointC;
	}

	public void setPointC(double[] pointC) {
		this.pointC = pointC;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(pointA);
		result = prime * result + Arrays.hashCode(pointB);
		result = prime * result + Arrays.hashCode(pointC);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (!Arrays.equals(pointA, other.pointA))
			return false;
		if (!Arrays.equals(pointB, other.pointB))
			return false;
		if (!Arrays.equals(pointC, other.pointC))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + Arrays.toString(pointA) + ", pointB=" + Arrays.toString(pointB) + ", pointC="
				+ Arrays.toString(pointC) + "]";
	}
}
