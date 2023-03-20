package com.example.ExceptionHandling;

import java.io.*;

public class TryCatchFinallyBlockTemplates {

    public static void main(String[] args) throws IOException {

        System.out.println("Program Begins");

        TryCatch.Calling();
        TryMultipleCatch.Calling();
        TryMultipleCatchWithSameExceptionOrChildExceptionRepeat.Calling();
        TryCatchFinally.Calling();
        MultipleTryCatch.Calling();
        TryCatchTryFinally.Calling();
        TryOnly.Calling();
        CatchOnly.Calling();
        FinallyOnly.Calling();
        TryFinallyCatch.Calling();
        TryCatchWithStatementInBetween.Calling();
        TryMultipleCatchWithStatementInBetween.Calling();
        TryCatchFinallyWithStatementInBetween.Calling();
        NestedTryCatch.Calling();
        TryCatchFinallyInsideCatchBlock.Calling();
        TryCatchFinallyInsideFinallyBlock.Calling();
        MultipleTryBlock.Calling();
        MultipleFinallyBlock.Calling();
        CatchAndFinallyBlock.Calling();
        TryWithResources.Calling();
        MultiCatchBlock.Calling();

        System.out.println("Program Ends");

    }
}


class TryCatch {

    public static void Calling(){
        System.out.println("Inside TryCatch Class");
        try {

        } catch (Exception e) {

        }
    }
}
//      Simple Try Catch

class TryMultipleCatch {

    public static void Calling(){
        System.out.println("Inside TryMultipleCatch Class");
        try {

        } catch (ArithmeticException e) {

        } catch (Exception e) {

        }
    }
}
//      Exception hierarchy must be from child to parent else CE

class TryMultipleCatchWithSameExceptionOrChildExceptionRepeat {

    public static void Calling(){
        System.out.println("Inside TryMultipleCatchWithSameExceptionOrChildExceptionRepeat Class");
        try {

        } catch (Exception e) {

        }
//        catch (ArithmeticException e) {
//
//        }
//        catch (Exception e) {
//
//        }
    }
}
//      Exception or its child class should not get repeated
//      CE: exception j.l.AE has already been caught
//      CE: exception j.l.E has already been caught

class TryCatchFinally {

    public static void Calling(){
        System.out.println("Inside TryCatchFinally Class");
        try {

        } catch (Exception e) {

        } finally {

        }
    }
}
//      Simple Try Catch Finally Block

class MultipleTryCatch {

    public static void Calling(){
        System.out.println("Inside MultipleTryCatch Class");
        try {

        } catch (Exception e) {

        }
        try {

        } catch (Exception e) {

        }
    }
}
//      2 Try Catch Template which have no link in between them

class TryCatchTryFinally {

    public static void Calling(){
        System.out.println("Inside TryCatchTryFinally Class");
        try {

        } catch (Exception e) {

        }
        try {

        } finally {

        }
    }
}
//      Try Catch Block and Try Finally Block which have no link in between them

class TryOnly {

    public static void Calling(){
        System.out.println("Inside TryOnly Class");
//        try {
//
//        }
    }
}
//      Try Block needs either catch or finally block CE: 'try' without 'catch', 'finally' or resource declarations

class CatchOnly {

    public static void Calling(){
        System.out.println("Inside CatchOnly Class");
//        catch (Exception e) {
//
//        }
    }
}
//      Catch Block needs a Try block CE: 'catch' without 'try'

class FinallyOnly {

    public static void Calling(){
        System.out.println("Inside FinallyOnly Class");
//        finally {
//
//        }
    }
}
//      Finally Block needs a Try Block CE: 'finally' without 'try'

class TryFinallyCatch {

    public static void Calling(){
        System.out.println("Inside TryFinallyCatch Class");
        try {

        } finally {

        }
//        catch(Exception e) {
//
//        }
    }
}
//      CE: 'catch' without 'try'

class TryCatchWithStatementInBetween {

    public static void Calling(){
        System.out.println("Inside TryCatchWithStatementInBetween Class");
//        try {
//
//        }
//        System.out.println("Between Statement");
//        catch (Exception e) {
//
//        }
    }
}
//      CE 1 : 'try' without 'catch', 'finally' or resource declarations
//      CE 2 :'catch' without 'try'

class TryMultipleCatchWithStatementInBetween {

    public static void Calling(){
        System.out.println("Inside TryMultipleCatchWithStatementInBetween Class");
//        try {
//
//        } catch (Exception e) {
//
//        }
//        System.out.println("Between Statement");
//        catch (Exception e) {
//
//        }
    }
}
//      CE : 'catch' without 'try'

class TryCatchFinallyWithStatementInBetween {

    public static void Calling(){
        System.out.println("Inside TryCatchFinallyWithStatementInBetween Class");
//        try {
//
//        } catch (Exception e) {
//
//        }
//        System.out.println("Between Statement");
//        finally {
//
//        }
    }
}
//      CE : 'finally' without 'try'

class NestedTryCatch {

    public static void Calling(){
        System.out.println("Inside NestedTryCatch Class");
        try {
            try {

            } catch (Exception e) {

            }
        } catch (Exception e) {

        }
    }
}
//      Simple Nested Try catch Block

class TryCatchFinallyInsideCatchBlock {

    public static void Calling(){
        System.out.println("Inside TryCatchFinallyInsideCatchBlock Class");
        try {

        } catch (Exception e) {
            try {

            } catch (Exception f) {

            } finally {

            }
        }

    }
}
//      Try Catch finally Block can be nested inside catch block

class TryCatchFinallyInsideFinallyBlock {

    public static void Calling(){
        System.out.println("Inside TryCatchFinallyInsideFinallyBlock Class");
        try {

        } finally {
            try {

            } catch (Exception e) {

            } finally {

            }
        }
    }
}
//      Try Catch finally Block can be nested inside finally block

class MultipleTryBlock {

    public static void Calling(){
        System.out.println("Inside MultipleTryBlock Class");
//        try {
//
//        }
//        try{
//
//        }catch (Exception e) {
//
//        }
    }
}
//      Inside a single template only 1 try block is allowed which should be immediately followed by catch or finally block

class MultipleFinallyBlock {

    public static void Calling(){
        System.out.println("Inside MultipleFinallyBlock Class");
        try {

        } finally {

        }
//        finally{
//
//        }
    }
}
//      CE : 'finally' without 'try'

class CatchAndFinallyBlock {

    public static void Calling(){
        System.out.println("Inside CatchAndFinallyBlock Class");
//        catch (Exception e) {
//
//        } finally {
//
//        }
    }
}
//      CE 1: 'catch' without 'try'
//      CE 2: 'finally' without 'try'

class TryWithResources{
    public static void Calling() throws IOException {
        System.out.println("In TryWithResources Class");
        try(BufferedReader br1 = new BufferedReader(new FileReader("abc.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("def.txt"))) {
//            br1 = new BufferedReader(new FileReader("def.txt"));

        }
    }
}
// In 1.6v or before catch or finally was required to close any resource opened in try block but
// from 1.7v onwards we can use try with resources and define auto-closeable resources in the try block.
// These resources will be automatically closed by the jvm with the auto-closeable interface which eventually
// reduces the work of catch and finally for the closing part.
// These resources can't be reinitialised. The variables are final else CE

class MultiCatchBlock {
    public static void Calling(){
        System.out.println("In MultiCatchBlock Class");
        try {
            System.out.println(10/0);
            String str = null;
            System.out.println(str.length());
        } catch(ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }

//        try {
//            System.out.println(10/0);
//            String str = null;
//            System.out.println(str.length());
//        } catch (ArithmeticException | Exception e){
//            System.out.println(e.getMessage());
//        }
    }
}
// From 1.7v onwards we can club different exceptions into one catch block if the handling code is the same
// But there should not be any parent-child | child-parent relationships between the exceptions else CE