package ch07_01;

public class SmartPhoneExample {
	
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시", "핑크");
		
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		
		System.out.println("와이파이 상태 : " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("안녕하세요");
		myPhone.receiveVoice("안녕하세요");
		myPhone.sendVoice("반갑습니다.");
		myPhone.hangUp();
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
