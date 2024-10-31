package seminars.third.coverage;

public class SomeService {

    public String fizzBuzz(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return "" + i;
        }
    }

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        } else if (nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double discountedAmount = 0;
        if (purchaseAmount >= 0) {
            if (discountAmount >= 0 && discountAmount <= 100) {
                discountedAmount = purchaseAmount - (purchaseAmount * discountedAmount);
            } else {
                throw new ArithmeticException("Скида должна быть от 0 до 100%");
            }
        } else {
            throw new ArithmeticException("Сумма покупки не может быть отрицательной");
        }
        return discountedAmount;
    }

    public int luckySum(int a, int b, int c) {
        int sum = 0;

        if (a != 13) {
            sum += a;
        }
        if (b != 13) {
            sum += b;
        }
        if (c != 13) {
            sum += c;
        }
        return sum;
    }


}