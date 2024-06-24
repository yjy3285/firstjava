package day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLab {

    public static void main(String[] args) {
        
        String wordToCount = "yesterday";   
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("c:/iotest/yesterday.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += countOccurrences(line, wordToCount);
            }
            System.out.println(wordToCount + " 라는 단어는 " + count + "개 있습니다.");
        } catch (IOException e) {
            System.err.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    private static int countOccurrences(String line, String word) {
        int count = 0;
        int index = 0;

        while ((index = line.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        return count;
    }
}



