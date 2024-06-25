package day16;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class StepDTO implements Serializable{	
	private static final long serialVersionUID = 123L;
	private String stepId;
	private transient String password; //직렬화 안됌->역직렬화 해도 기본값 나옴(null)
	private int age;
	private transient int score; //직렬화 안됌 ->역직렬화 해도 기본값 나옴(0)//이 멤버변수 제외하고 직렬화하겠다.
	public StepDTO(String stepId, String password, int age, int score) {
		super();
		this.stepId = stepId;
		this.password = password;
		this.age = age;
		this.score = score;
	}
	public String getStepId() {
		return stepId;
	}
	public void setStepId(String stepId) {
		this.stepId = stepId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}

public class SerialTest5 {
   public static void main(String[] args) throws Exception{ 
      FileOutputStream fos = 
    		  new FileOutputStream("c:/iotest/test3.ser"); 
      ObjectOutputStream oos = 
    		  new ObjectOutputStream(fos);
      
      StepDTO dto  = new StepDTO("unico", "@12345", 33, 100);
      oos.writeObject(dto);
      oos.close();
      fos.close();
      System.out.println("직렬화 출력 완료");      
   }
}



