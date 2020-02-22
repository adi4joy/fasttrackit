package org.fasttrackit.curs3;

public class fConditionalOperators {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        System.out.println("Equality operator : ==");
        System.out.println("Equality operator can be applied to literals: 2==3 " + (2 == 3));
        int a = 2, b = 2;
        System.out.println("Equality operator can be applied to variables: int a=2, b=2 then a==b is " + (a == b));
        System.out.println("For objects, the equality operator will compare the address of the object, not their content");
        String str1 = new String("value");
        String str2 = new String("value");
        System.out.println("For example two distinct strings with the same content, won't be equal : String str1 = new String(\"value\"), str2= new String(\"value\"), then str1==str2 is " + (str1 == str2));
        System.out.println("Identical string literals will point to the same object, so they will be equal : \"abc\"==\"abc\" is " + ("abc" == "abc"));

        System.out.println("---------------------------------------------------------");
        System.out.println("Not Equal operator : !=");
        System.out.println("Not Equal operator can be applied to literals: 2!=3 " + (2 != 3));
        a = 2;
        b = 2;
        System.out.println("Not Equal operator can be applied to variables: int a=2, b=2 then a!=b is " + (a != b));
        System.out.println("For objects, the equality operator will compare the address of the object, not their content");
        System.out.println("For example two distinct strings with the same content, won't be equal : String str1 = new String(\"value\"), str2= new String(\"value\"), then str1!=str2 is " + (str1 != str2));
        System.out.println("Identical string literals will point to the same object, so they will be equal : \"abc\"!=\"abc\" is " + ("abc" != "abc"));

        System.out.println("---------------------------------------------------------");
        System.out.println("Strictly Greater Than operator : >");
        System.out.println("Strictly Greater operator can be applied to literals: 2>3 is " + (2 > 3));
        a = 2;
        b = 3;
        System.out.println("Strictly Greater operator can be applied to variables: int a=2, b=3 then a>b is " + (a > b));
        a = 5;
        b = 5;
        System.out.println("For equal numbers Strictly Greater operator will return false : int a=5, b=5 then a>b is " + (a > b));

        System.out.println("---------------------------------------------------------");
        System.out.println("Greater Or Equal Than operator : >=");
        System.out.println("Greater Or Equal Than operator can be applied to literals: 2>=3 is " + (2 >= 3));
        a = 2;
        b = 3;
        System.out.println("Greater Or Equal Than operator can be applied to variables: int a=2, b=3 then a>=b is " + (a >= b));
        a = 5;
        b = 5;
        System.out.println("For equal numbers Greater Or Equal Than operator will return true : int a=5, b=5 then a>=b is " + (a >= b));

        System.out.println("---------------------------------------------------------");
        System.out.println("Strictly Smaller Than operator : <");
        System.out.println("Strictly Smaller Than operator can be applied to literals: 2<3 is " + (2 < 3));
        a = 2;
        b = 3;
        System.out.println("Strictly Smaller Than operator can be applied to variables: int a=2, b=3 then a<b is " + (a < b));
        a = 5;
        b = 5;
        System.out.println("For equal numbers Strictly Smaller Than operator will return false : int a=5, b=5 then a<b is " + (a < b));

        System.out.println("---------------------------------------------------------");
        System.out.println("Smaller Or Equal Than operator : <=");
        System.out.println("Smaller Or Equal Than operator can be applied to literals: 2<=3 is " + (2 <= 3));
        a = 2;
        b = 3;
        System.out.println("Smaller Or Equal Than operator can be applied to variables: int a=2, b=3 then a<=b is " + (a <= b));
        a = 5;
        b = 5;
        System.out.println("For equal numbers Smaller Or Equal Than operator will return true : int a=5, b=5 then a<=b is " + (a <= b));
    }
}
