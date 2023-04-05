package ch07_03;

public class SmartPhoneExample {
	
	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("갤럭시", "핑크색");
		
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
	}
}
