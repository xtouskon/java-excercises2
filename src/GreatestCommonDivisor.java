public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15,30));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        int min = Math.min(first, second);
        int gcd = 1;
        for (int i = 1 ; i <= min  ; i++){
           int f1 = first % i;
           int f2 = second % i;
            if ( (f1 == 0) && (f2 == 0)){
                gcd = i;
            }
        }
    return gcd;
    }

}
