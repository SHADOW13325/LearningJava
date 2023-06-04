package com.example.BeforeJava8Features.Collections.Enums;

/**
 * @author saumitra chauhan
 */
public enum DeclarationOfEnum {}

// empty enum is perfect java syntax
enum DeclarationOfEnumWithDefault {}

strictfp enum DeclarationOfEnumWithStrictfp {}

class EnumInsideClass {

    public enum InnerEnumWithPublic {}

    private enum InnerEnumWithPrivate {}

    protected enum InnerEnumWithProtected {}

    static strictfp enum InnerEnumWithDefaultAndStaticAndStrictfp {}

    public void m1(){
//        Local Enums not supported
//        enum EnumInsideMethod {
//
//        }
    }
}

enum EnumInsideEnum {

    // semicolon is must if there are members other than enum constants in the first line
    ;

    public enum InnerEnumWithPublic {}

    private enum InnerEnumWithPrivate {}

    protected enum InnerEnumWithProtected {}

    static strictfp enum InnerEnumWithDefaultAndStaticAndStrictfp {}

    public void m1(){
//        Local Enums not supported
//        enum EnumInsideMethod {
//
//        }
    }
}

// Enums can't extend another enum as every enum is the direct child class of java.lang.Enum
//enum EnumExtendingEnum extends EnumInsideEnum {}
// Enums can't extend another class as every enum is the direct child class of java.lang.Enum
//enum EnumExtendingEnum extends EnumInsideClass {}

interface InterfaceForEnum1 {

}

interface InterfaceForEnum2 {

}

enum EnumExtendingInterfaces implements InterfaceForEnum1, InterfaceForEnum2 {

}

//static modifier is redundant to inner enums