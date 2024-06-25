package day16;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;
public class SerialTest2 {
   public static void main(String[] args) throws Exception{ 
      FileInputStream fis = 
    		  new FileInputStream("c:/iotest/test1.ser"); 
      ObjectInputStream ois = new ObjectInputStream(fis); 
      Date value1 = (Date)ois.readObject();
      Date value2 = (Date)ois.readObject(); //object 형으로 강제 형변환 함.(자손이 조상꺼 가져오려고) //역직렬화 writeobject 한거 다시 읽어올때
      System.out.println("Date객체 데이터 : " + value1); 
      System.out.println("Date객체 데이터 : " + value2); //2 데이터객체는 3초만큼의 차이
      ois.close();
      fis.close();
   }
}



