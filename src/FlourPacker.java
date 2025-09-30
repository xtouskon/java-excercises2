public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(6, 3, 17));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int totalBigCount = bigCount * 5;
        if (goal < 0 || bigCount < 0 || smallCount < 0) {
            return false;
        }
        if (goal == totalBigCount + smallCount) {
            return true;
        }
        if (goal < totalBigCount + smallCount) {
            if (totalBigCount > goal) {
                return smallCount >= goal % 5;
                }
            else {
                return smallCount >= goal - totalBigCount;
            }

            }
        return false;
    }


    }
