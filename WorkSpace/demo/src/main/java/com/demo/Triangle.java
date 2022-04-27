package com.demo;

public class Triangle {
	private point pointA;
	private point pointB;
	private point pointC;

	public point getPointA() {
		return pointA;
	}

	public void setPointA(point pointA) {
		this.pointA = pointA;
	}

	public point getPointB() {
		return pointB;
	}

	public void setPointB(point pointB) {
		this.pointB = pointB;
	}

	public point getPointC() {
		return pointC;
	}

	public void setPointC(point pointC) {
		this.pointC = pointC;
	}

	public void display() {
		System.out.println(getPointA().getX());
	}

}
