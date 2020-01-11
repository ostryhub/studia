package Zadanie1;

// wyjatek "bazowy"
class ExceptionA extends Exception
{
}

// wyjatek "dziedziczacy" po "bazowym"
class ExceptionB extends ExceptionA
{
}

public class Zad1
{
    private static void throwExceptionA() throws ExceptionA
    {
        throw new ExceptionA();
    }

    private static void throwExceptionB() throws ExceptionB
    {
        throw new ExceptionB();
    }

    // tutaj widac ze jak sie rzuca dwa wyjatki gdzie jeden dziedziczy po drugiem okazuje sie ze catch dla wyjatka bazowego
    // nie pozwala juz dodac drugieko catch;a dla wyjatka dziedziczacego po "bazowym"
    private static void check_catch_both_separatetly()
    {
//        try
//        {
//            throwExceptionA();
//            throwExceptionB();
//        }
//        catch(ExceptionA ex)
//        {
//            System.out.println("Exception caught: "+ex);
//        }
//        catch(ExceptionB ex)
//        {
//            System.out.println("Exception caught: "+ex);
//        }
    }

    // tutaj widac ze jak rzucamy bazowy i dziedziczacy to catch jedynie dla dziedziczacego (ExceptionB) nie jest wystarczajacy
    private static void check_catch_exceptionB_only()
    {
//        try
//        {
//            throwExceptionA();
//            throwExceptionB();
//        }
//        catch(ExceptionB ex)
//        {
//            System.out.println("Exception caught: "+ex);
//        }
    }

    // tutaj widac ze jak rzucamy bazowy i dziedziczacy to catch jedynie dla bazowego (ExceptionA) jest wystarczajacy
    // ten catch wychwyci oba wyjatki
    private static void check_catch_exceptionA_only()
    {
        try
        {
            throwExceptionA();
            throwExceptionB();
        }
        catch(ExceptionA ex)
        {
            System.out.println("Exception caught: "+ex);
        }
    }

    public static void main(String[] args)
    {
        check_catch_both_separatetly();
        check_catch_exceptionB_only();
        check_catch_exceptionA_only();
    }
}
