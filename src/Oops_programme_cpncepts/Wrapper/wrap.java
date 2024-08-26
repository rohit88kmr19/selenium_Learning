package Oops_programme_cpncepts.Wrapper;

public class wrap {
    public static void main(String[] args) {
        int a=10;// Int data type , primitive data type

        // Whybuse wrapper classes-> when working with collection framework, storing null values as object can be null,
        // convert between  primitivae data types and Strings, perform mathematical operations.

        // primitive to wrapper

        int a1=10;
        Integer b=a1;
        //Integer.MAX_VALUE;

        System.out.println(a);// doesnt  nhave any func
        System.out.println(b); // Extra Utilities  are added.




        // Wrapper to Primitive
        Integer a2=40; //Autoboxing - Int is converted into Integer automatically.
        int value =a2; //Unboxing  - Integer to int.

        System.out.println(a2);// It has lot of func
        System.out.println(value);// Here les functions as it will
    }

}
