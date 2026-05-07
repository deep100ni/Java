public class RecursionPower {
    public static int calcPower(int x,int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n%2 == 0){
            return calcPower(x,n/2) * calcPower(x,n/2);
        }else{
            return calcPower(x,n/2) * calcPower(x,n/2) * x;
        }

        // Normal Method
        // int xPownm1 = calcPower(x,n-1);
        // return x * xPownm1;
    }
    public static void main(String args[]){
        int x = 2;
        int n = 3;
        System.out.println(calcPower(x,n));
    }
}
