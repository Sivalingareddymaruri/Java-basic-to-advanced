public class operators {
    public static void main(String a[]) {
        int a1=7;
        int b=5;
        int result=a1+b;
        int result1=a1-b;
        int result2=a1*b;
        int result3=a1/b; //gives quoitent
        int result4=a1%b; //gives remainder
        a1 +=2; //shortcutmethod we can do it for -,*,/,%
        b++; // another shortcut we can do decrement also
        //int res=++a1; // pre-increment this gives output 8  It increments and after fetch the value
        int res=a1++; //post-increment this gives output 7 It first fetch the value and then increment
        
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(a1);
        System.out.println(b);
        System.out.println(res);

        
    }
    
}
