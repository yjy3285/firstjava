package day13;

import java.util.HashSet;
import java.util.Random;

public class HashSetLab1 {

    public static void main(String[] args) {
        HashSet<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();

        while (lottoNumbers.size() < 10) { //hashset이 10이 되기전까지 돌아라.
            int number = random.nextInt(21) + 10; 
            lottoNumbers.add(number);
        }

        System.out.print("오늘의 로또 번호 : ");
        int count = 0;
        for (int number : lottoNumbers) {
            System.out.print(number);
            if (++count < lottoNumbers.size()) {
                System.out.print(", ");
            }
        }
    }
}

