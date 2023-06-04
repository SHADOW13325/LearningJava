package com.example.BeforeJava8Features.Collections.Generics;

/**
 * @author saumitra chauhan
 * @param <T>
 */
// extends more than 1 interface
class BoundedTypes1<T extends Runnable & Comparable> {}

// extends a class and more than 1 interface
class BoundedTypes2<T extends Number & Runnable & Comparable>{}

// class comes before interface while extending
//class  BoundedTypes3<T extends Runnable & Number>{}

// can't extends more than 1 class
//class BoundedTypes4<T extends Number & Thread>{}

// implements keyword not allowed for interface. Use extends
//class BoundedTypes5<T implements Runnable>{}

//super keyword not allowed for class. Use extends
//class BoundedTypes6<T super String>{}