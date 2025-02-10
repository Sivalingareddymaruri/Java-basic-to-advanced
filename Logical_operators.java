public class Logical_operators {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int b=5;
        int c=6;
        int x=9;
        int y=8;
        boolean result= b<c && x>y;
        boolean result1= b<c || x>y;
        boolean result2= b<c || x>y || b<1;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(!result2); //Not operator is used here to make the result change
    }
    
}
