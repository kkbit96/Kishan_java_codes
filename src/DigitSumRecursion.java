public class DigitSumRecursion {
    //sum of digits of a number using recursion
    public static int digitSum(int num){
        if(num==0){
            return 0;
        }
        return num%10 + digitSum(num/10);
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println(digitSum(num));
    }
}
