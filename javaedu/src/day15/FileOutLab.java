package day15;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutLab {
	public static void main(String[] args) {
		String path = "C:/Temp";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
		}
		try (FileWriter writer = new FileWriter("C:/Temp/event.txt", true);
				PrintWriter out = new PrintWriter(writer);) { //append모드 아니라면 filewriter 객체 생성 안해도 됨.
			LocalDate td = LocalDate.of(2024, 5, 5);
			int yearNum = td.getYear();
			int monthNum = td.getMonthValue();
			int dateNum = td.getDayOfMonth();
			DayOfWeek day = td.getDayOfWeek();
			String korday = day.getDisplayName(TextStyle.FULL, Locale.KOREAN);

			out.printf("%d년 %d월 %d일은 %s입니다.\r\n", yearNum, monthNum, dateNum, korday);
			LocalDate ld = LocalDate.of(2024, 8, 15);
			int yearNum2 = ld.getYear();
			int monthNum2 = ld.getMonthValue();
			int dateNum2 = ld.getDayOfMonth();
			DayOfWeek day2 = ld.getDayOfWeek();
			String korday2 = day2.getDisplayName(TextStyle.FULL, Locale.KOREAN);

			out.printf("%d년 %d월 %d일은 %s입니다.\r\n", yearNum2, monthNum2, dateNum2, korday2);

			System.out.println("저장이 완료되었습니다.");

		} catch (Exception e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");

		}
	}
}
