package com.example.lab1;

import com.example.lab1.details.Body;
import com.example.lab1.details.Engine;
import com.example.lab1.details.Seat;
import com.example.lab1.details.Wheels;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Отримання бінів з контексту
		Body body = (Body) context.getBean("body");
		Engine engine = (Engine) context.getBean("engine");
		Seat seat = (Seat) context.getBean("seat");
		Wheels wheels = (Wheels) context.getBean("wheels");

		// Виведення даних в терміналі
		System.out.println("Body Details:");
		System.out.println("Height: " + body.getHeight());
		System.out.println("Width: " + body.getWidth());

		System.out.println("\nEngine Details:");
		System.out.println("Type: " + engine.getType());
		System.out.println("Cylinders: " + engine.getCylinders());
		System.out.println("Displacement: " + engine.getDisplacement());

		System.out.println("\nSeat Details:");
		System.out.println("Seat: " + seat.getSeat());

		System.out.println("\nWheels Details:");
		System.out.println("Number of Wheels: " + wheels.getNumberWheels());
	}
}
