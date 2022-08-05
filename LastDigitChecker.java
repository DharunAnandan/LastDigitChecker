public class LastDigitChecker {
    public static void main(String[] args) {
        hasSameLastDigit(12,23,32);
        isValid(10);
    }
    public static boolean hasSameLastDigit(int x,int y,int z){
        if (x>1000||x<10||y>1000||y<10||z>1000||z<10){
            System.out.println("invalid");
            return false;
        } else {
            int x1=x%10;
            int y1=y%10;
            int z1=z%10;
             if(x1==y1||y1==z1||z1==x1){
                 System.out.println("it's same");
                 return true;
             }

        }
        System.out.println("it's not same");
        return false;
    }
    public static boolean isValid(int x) {
        if (x > 1000 || x < 10) {
            System.out.println("invalid");
            return false;
        } else {
            System.out.println("valid");
            return true;
        }

    }

}
