package day15;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CopyLab {
	
	public static void main(String[] args) {
		String sourceFile = "c:/iotest/sample.txt";
		LocalDate cd = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd");
		String formattedDate = cd.format(formatter);
		
		String destination = "c:/iotest/sample_"+ formattedDate + ".txt";
		
		try(
				BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(destination, true)) 
					
				
				) {
			String line;
			while ((line = reader.readLine())!=null) {
				writer.write(line);
				writer.newLine();
			}
			System.out.println("저장 완료되었습니다.");
		}catch(IOException e) {
			if(e instanceof java.io.FileNotFoundException) {
				System.out.println("sample.txt 파일을 찾을 수 없습니다.");
				
			}else {
				System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
			}
		}
		
		
		
		}

}
