package ch07_02;

public class SmartPhone extends Phone {
	public SmartPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		System.out.println("SmarthPhone(String model, String color) 생성자 실행됨");
	}

}
