package day13;

import java.util.Random;

public class LottoMachine {
    private int[] nums;

    public LottoMachine() {
        nums = new int[6];
    }

    public void createLottoNums() {
        //Random lottonums = new Random();

        for (int i = 0; i < nums.length; i++) {
            //boolean isUnique;
            //do {
                //isUnique = true;
                //int num = lottonums.nextInt(20) + 1; 
        	nums[i] = new Random().nextInt(20) + 1;
        }
    }
               
         //nums[i] = num;
        
                
                
//                for (int j = 0; j < i; j++) {
//                    if (nums[j] == nums[i]) {
//                        isUnique = false;
//                        break;
//                    }
//                }
//            } while (!isUnique);
//        }
//    }

//    public void checkLottoNums() throws DuplicateException {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    throw new DuplicateException();
//                }
//            }
//        }
//    }
        public void checkLottoNums() throws DuplicateException {
        	for(int i=0;i<nums.length;i++) {
        		for(int j=0;j<i;j++) {
        			if(nums[i]==nums[j]) {
        				throw new DuplicateException();
        			}
        		}
        	}
        }

    public int[] getNums() {
        return nums;
    }
}


