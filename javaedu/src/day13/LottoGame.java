package day13;
import day7.MethodLab7;

public class LottoGame {
	public static void main(String[] args) {
		LottoMachine lottoMachine = new LottoMachine(); //객체 생성
		
		lottoMachine.createLottoNums();
		
		try {
			lottoMachine.checkLottoNums();
			MethodLab7.printArray(lottoMachine.getNums()); //printarray 호출이 try 블럭 안에 있어야 함.
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
		} 
	}

}
