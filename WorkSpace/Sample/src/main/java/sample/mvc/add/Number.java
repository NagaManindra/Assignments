package sample.mvc.add;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Number {
	@NotNull
	double Number1;
	double Number2;
	@NotBlank
	String operation;

	public Number() {
		super();
	}

	public Number(double number1, double number2, String operation) {
		super();
		Number1 = number1;
		Number2 = number2;
		this.operation = operation;
	}

	public double getNumber1() {
		return Number1;
	}

	public void setNumber1(double number1) {
		Number1 = number1;
	}

	public double getNumber2() {
		return Number2;
	}

	public void setNumber2(double number2) {
		Number2 = number2;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "Number [Number1=" + Number1 + ", Number2=" + Number2 + "]";
	}

}
