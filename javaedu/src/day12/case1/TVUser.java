package day12.case1;
public class TVUser {
	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
	}
}
//전원 키고 끄는 등 메서드 이름이 다르기에 samsungTV->lgTV로 변경 시 에러 뜸.(규격화 안되어있어서)