package com.example.OOPs.Overriding;/*
    @author
    saumitra chauhan
*/

public class OveridingWRTAccessModifiers {

    private void m1(){}

    void m2(){}

    protected void m3(){}

    public void m4(){}
}

class PrivateMethods extends OveridingWRTAccessModifiers {

//    Overiding concept not applicable for private methods as they can't be accessed outside the class
    private void m1(){}

//    can't decrease scope of the method(default -> private)
//    private void m2(){}

//    can't decrease scope of the method(protected -> private)
//    private void m3(){}

//    can't decrease scope of the method(public -> private)
//    private void m4(){}
}

class DefaultMethods extends OveridingWRTAccessModifiers{

//    Overiding concept not applicable for private methods as they can't be accessed outside the class
    void m1(){}

    void m2(){}

//    can't decrease scope of the method(protected -> default)
//    void m3(){}

//    can't decrease scope of the method(public -> default)
//    void m4(){}
}

class ProtectedMethods extends OveridingWRTAccessModifiers{

//    Overiding concept not applicable for private methods as they can't be accessed outside the class
    protected void m1(){}

    protected void m2(){}

    protected void m3(){}

//    can't decrease scope of the method(public -> protected)
//    protected void m4(){}
}

class PublicMethods extends OveridingWRTAccessModifiers {

//    Overiding concept not applicable for private methods as they can't be accessed outside the class
    public void m1(){}

    public void m2(){}

    public void m3(){}

    public void m4(){}
}

// When people are overiding the method, the reduced scope may hurt the existing code as now the child class method with reduced scope is being used