package day5;

public class ArrayLab2 {
	

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		int start = 4;
        int end = 20;
        int range = end - start + 1;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + (i % range); 
        }
        System.out.print("모든 원소의 값 : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {  //끝에 , 제거해줌
                System.out.print(", ");
            }
        }

		System.out.println();
		
		int sumV = 0;
		for(int d : nums)
			sumV += d;
		System.out.println("모든 원소의 합 : " + sumV);
		
	}

}
