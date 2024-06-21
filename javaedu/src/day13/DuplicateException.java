package day13;

public class DuplicateException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DuplicateException() { 
		 super("중복된 로또 번호가 발생했습니다."); 
		 } 
}
