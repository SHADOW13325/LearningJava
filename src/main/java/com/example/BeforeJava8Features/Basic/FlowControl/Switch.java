package com.example.BeforeJava8Features.Basic.FlowControl;

/**
 * @author saumitra chauhan
 * @since 11-07-2023 18:15
 */

public class Switch {

    public static void main(String[] args) {

        int x = 10;

//        variation 1
        switch (x) { }

//        case, default, or '}' expected
//        switch (x)
//        switch (x);

//        case, default, or '}' expected
//        switch (x){System.out.println("Inside Switch");}

        final int y = 20;

        switch (x) {
            case 10 :
                System.out.println("Hello, Friend");
                break;
            case y :
                System.out.println("Inside case y as y is final variable");
                break;
//                constant expression required
//            case x :
//                System.out.println("Inside case x");
//                break;
            default:
                System.out.println("Default case");
        }

//        perfectly valid as both switch argument and case labels can be expressions.
//        case label should be constant expression
        switch (x + 1) {
            case 10 :
                System.out.println("First case 10");
                break;
            case 10 + 20 + 30 :
                System.out.println("Second case 20");
        }

//        switch argument limit is the range of the expression resultant type.
        byte b = 10;
        switch (b) { // Here it is byte [-128, 127]
            case 10:
                System.out.println("case 10");
                break;
//                incompatible types: possible lossy conversion from int to byte
//            case 1000:
//                System.out.println("case 1000");
        }

        switch (b + 1) { // Here it is int => max(int, byte, int)
            case 10:
                System.out.println("case 10");
                break;
            case 1000:
                System.out.println("case 1000");
        }

//        CE: duplicate case label
//        switch (x) {
//            case 97:
//                System.out.println("Inside case 97");
//                break;
//            case 'a':
//                System.out.println("Inside case 'a");
//        }

        for (int i = 0; i < 4; i++){
            System.out.printf("%nIteration : %d%n", (i + 1));
            switch (i){
                default:
                    System.out.printf("case default ");
                case 0:
                    System.out.printf("case 0 ");
                case 1:
                    System.out.printf("case 1 ");
                    break;
                case 2:
                    System.out.printf("case 2 ");
            }
        }


    }
}

/*
    Switch Features :-
    1. Allowed argument type for switch statements are:-
        Till 1.4v -> byte, char, short, int
        Till 1.5v => 1.4v arguments, Byte, Character, Short, Integer, Enum
        1.7v and after => 1.5v arguments, String
        boolean is not allowed as then we can only have 2 cases which will make no diff between switch and if-else
        long is not allowed as int range is enough for total cases
    2. Curly braces are mandatory.
    3. Case and default both are optional
    4. Independent statement inside switch is not allowed. Must be under case or default.
    5. Every switch argument must be an expression.
    6. Fall through inside a switch -> Once a case label is matched with switch argument, all statements starting from
       that matched case label are executed until a break statement or end of switch is encountered. It helps in defining
       common actions for multiple cases (code reusability).
    7. The default case is matched if no case label is matched. We can take a default case at most 1 time in a switch.
       We can define it anywhere in the switch but recommended to write as the last case.

    Case Label Features: -
    1. Every case label must be a constant expression.
    2. Case labels value must be in the range of the switch argument expression.
    3. Duplicate case labels are not allowed.

 */