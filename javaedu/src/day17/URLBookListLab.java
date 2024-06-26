package day17;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class URLBookListLab {
	public static void main(String[] args) {
		try {
			URL req = new URL(
					"http://openapi.seoul.go.kr:8088/796143536a756e69313134667752417a/json/SeoulLibraryBookRentNumInfo/1/100/");

			InputStream is = req.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			StringBuffer bf = new StringBuffer();
			String line;
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				bf.append(line);
			}

			JSONObject obj = new JSONObject(bf.toString());

			System.out.println(obj.toString());
			System.out.println(obj.keySet());
			System.out.println("[서울도서관 인기대출 도서목록 100권]");
			System.out.println();
			JSONObject lamp = obj.getJSONObject("SeoulLibraryBookRentNumInfo");
			JSONArray row = lamp.getJSONArray("row");

			for (Object e : row) {
				JSONObject jo = (JSONObject) e;
				System.out.println(jo.getString("TITLE"));
				System.out.println("\t" + jo.getString("AUTHOR"));
				System.out.println("\t" + jo.getString("PUBLISHER"));

			}
		} catch (Exception e) { //cathch,finally는 생략 가능
			System.out.println("오류: " + e.getMessage());
		}
	}

}
