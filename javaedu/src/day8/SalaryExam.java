package day8;

import java.util.Random;

class SalaryExpr {
    //private 
	int bonus;

    // 기본 생성자
    public SalaryExpr() {
        this.bonus = 0;
    }

    // 보너스를 매개변수로 받는 생성자
    public SalaryExpr(int bonus) {
        this.bonus = bonus;
    }

    // 급여 계산 메서드
    public int getSalary(int grade) {
        switch (grade) {
            case 1:
                return this.bonus + 100;
            case 2:
                return this.bonus + 90;
            case 3:
                return this.bonus + 80;
            case 4:
                return this.bonus + 70; 
            default:
                return this.bonus; // 기본값, 잘못된 grade 값은 보너스만 리턴
        }
    }
}

public class SalaryExam {
    public static void main(String[] args) {
        Random random = new Random();
        int month = random.nextInt(12) + 1; 
        int grade = random.nextInt(4) + 1; 

        SalaryExpr salaryExpr;

        if (month % 2 == 0) { // 짝수 달 (보너스 달)
            salaryExpr = new SalaryExpr(100);
        } else { // 홀수 달 (보너스 달 아님)
            salaryExpr = new SalaryExpr();
        }

        int salary = salaryExpr.getSalary(grade);
        System.out.println(month + "월 " + grade + "등급의 월급은 " + salary + "입니다.");
    }
}

