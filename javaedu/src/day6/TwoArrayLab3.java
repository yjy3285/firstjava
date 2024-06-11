package day6;

public class TwoArrayLab3 {
    public static void main(String[] args) {
        
        int[][] gameTime = {
            {5, 2, 1, 0, 2, 3, 6}, // 1주차
            {4, 3, 2, 1, 1, 0, 5}, // 2주차
            {3, 1, 2, 1, 3, 1, 3}, // 3주차
            {4, 3, 1, 0, 4, 2, 7}  // 4주차
        };

        
        int[] daySum = new int[7]; 
        
        int[] weekSum = new int[4]; 

        
        for (int i = 0; i < gameTime.length; i++) { 
            for (int j = 0; j < gameTime[i].length; j++) { 
                daySum[j] += gameTime[i][j]; 
            }
        }

        
        for (int i = 0; i < gameTime.length; i++) {
            for (int j = 0; j < gameTime[i].length; j++) {
                weekSum[i] += gameTime[i][j]; 
            }
        }

        
        String[] days = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        
        for (int i = 0; i < daySum.length; i++) {
            System.out.println(days[i] + ": " + daySum[i] + "시간");
        }
        System.out.println();

        
        
        for (int i = 0; i < weekSum.length; i++) {
            System.out.println((i + 1) + "주차: " + weekSum[i] + "시간");
        }
    }
}
