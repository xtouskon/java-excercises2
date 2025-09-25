public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(15,35,677));
        System.out.println(hasSameLastDigit(15,33,677));
        System.out.println(hasSameLastDigit(15,35,675));
        System.out.println(hasSameLastDigit(15,35,1677));



    }
public static boolean isValid (int number){
      return number >= 10 && number <= 1000;
}
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;

        return lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3;

    }

}
