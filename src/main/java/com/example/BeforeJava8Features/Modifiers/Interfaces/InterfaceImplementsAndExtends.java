package com.example.BeforeJava8Features.Modifiers.Interfaces;

/**
 * @author saumitra chauhan
 */

public interface InterfaceImplementsAndExtends {
}

class childClassImplementsOrExtends {

}

/*
interface ChildInterface1 implements InterfaceImplementsAndExtends {

}
*/

interface ChildInterface2 extends InterfaceImplementsAndExtends {

}

/*
interface childInterface3 implements childClassImplementsOrExtends {

}
*/

/*
interface childInterface4 extends  childClassImplementsOrExtends {

}
*/

/*
  Interfaces only extends other interfaces.
  Implements keyword is not allowed and class can't be extended by interfaces
  It also means interfaces do not extend Object class
*/

