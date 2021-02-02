package com.homeworkoop.in;

public class Main {
	public static void main(String[] args) {
		
        //lesson cat
		Cat cat = new Cat("кот",34,"ест Корм");
		System.out.println(cat);

		//Lesson rektangl
		int summ = cat.rectangl(10,30);
		System.out.println("Всего есть сторон у трехугольника: " + summ+" Стороны");


		Cat cat2 = new Cat();


	}
}
