public class reverseString {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("hello");
        for (int i=0; i<sb.length()/2;i++){
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(back);

            sb.setCharAt(i,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
