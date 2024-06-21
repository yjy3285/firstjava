package day13;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapLab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        while (countryPopulation.size() < 5) {
            System.out.print("나라이름을 입력하세요 : ");
            String country = scanner.nextLine();
            
            if (countryPopulation.containsKey(country)) {
                System.out.println("*나라명 " + country + "는 이미 저장되었습니다.*");
                continue;
            }

            System.out.print("인구 수를 입력하세요 : ");
            int population = Integer.parseInt(scanner.nextLine());

            countryPopulation.put(country, population);
            System.out.println("*저장되었습니다.*");
        }
        scanner.close();

        System.out.println("\n5개가 모두 입력되었습니다.");
        System.out.print("입력된 데이터 : ");
        
        boolean first = true;
        for (String country : countryPopulation.keySet()) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(country + "(" + countryPopulation.get(country) + ")");
            first = false;
        }
    }
}
