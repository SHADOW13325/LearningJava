package com.example.Modifiers.ClassNames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModifierApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ModifierApplication.class, args);
		MultipleClasses multipleClasses = new MultipleClasses();
		multipleClasses.print();
		A a = new A();
		a.print();
		B b = new B();
		b.print();
		C c = new C();
		c.print();
		PublicClass publicClass = new PublicClass();
		publicClass.print();
		D d = new D();
		d.print();
		E e = new E();
		e.print();
		F f = new F();
		f.print();
	}

}


