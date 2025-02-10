public class Ternary_operator {
    public static void main(String[] args) {
        int x=5;
        int result=0;
        //if(x%2==0)
            //result=10;
        //else
            //result=20;
        //?:
        result= x%2 == 0 ? 10 : 20;
        System.out.println(result);
    }
    
}
