package com.company;

public class Circle {//オブジェクト

	public int radius;//半径のフィールド

	public Circle() {
		this.radius = 5;//コンストラクタ　引数なし
	}

	public Circle(int radius) {
		this.radius = radius;
	}//コンストラクタ　引数あり

	public double getArea() { return (radius * radius * 3.14); }//メソッド面積

	public double getCircumference() {
		return (2 * radius * 3.14);
	}//メソッド円周率
	// fuga
}
