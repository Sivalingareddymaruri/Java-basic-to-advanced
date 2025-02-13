class Calc {  // Declares a class

    public int add(int n1, int n2) {  // Declares a method called add
        return n1 + n2;
    }
}

public class Class_object {  // Defines another class ClassObject
    public static void main(String[] args) {  // Main method where execution begins
        int num1 = 4;
        int num2 = 5;
        
        Calc calcObj = new Calc();  // Creates an object of Calc.In if we need new objects thne we have to create new object using new keyword
        //the object is Calc() and we assign it to a new varaible called calcObj
        int result = calcObj.add(num1, num2);  // Calls the add method by using the object reference called calcObj
        
        System.out.println(result);  // Output: 9
    }
}
