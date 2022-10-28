package org.example;

import org.joda.time.LocalTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class Algorithmstest {

    FunnyAlgorithms f = new FunnyAlgorithms();
    static String stringcheck;
    static String stringcheck2;
    static String stringcheck3;
    static String stringcheck4;
    static String stringcheck5;
    static String incorrectstringcheck;
    static String incorrectstringcheck2;
    static String incorrectstringcheck3;
    static String incorrectstringcheck4;
    static String incorrectstringcheck5;

    static int [] arraycrescente = {1,2,3,4,5,6,7,8,9,10};
    static int [] arraydecrescente = {10,9,8,7,6,5,4,3,2,1};
    static int [] arraydisordinato = {3,4,1,2,7,5,8,9,10};


    @BeforeClass
    public  static void inizializzazione(){

        LocalTime tempo_inizio = new LocalTime();
        System.out.println("Ora inizio test: " + tempo_inizio.toString());
        stringcheck = "-3";
        stringcheck2 = "500";
        stringcheck3 = "-10";
        stringcheck4 = "32767";
        stringcheck5 = "-3";
        incorrectstringcheck = "2 3";
        incorrectstringcheck2 = "32768";
        incorrectstringcheck3 = "A3";
        incorrectstringcheck4 = "2.3";
        incorrectstringcheck5 = "-32769";

}

    @AfterClass
    public static void fineesecuzione(){
        LocalTime tempo_fine = new LocalTime();
        System.out.println("Ora inizio test: " + tempo_fine.toString());
    }

    @Test
    public void test_stringtoIntConverter(){
        assertEquals(-3,f.stringToIntConverter(stringcheck));
        assertEquals(500,f.stringToIntConverter(stringcheck2));
        assertEquals(-10,f.stringToIntConverter(stringcheck3));
        assertEquals(32767,f.stringToIntConverter(stringcheck4));
        assertEquals(-3,f.stringToIntConverter(stringcheck5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ExceptionTest_IllegalArgumentException(){
        f.stringToIntConverter(incorrectstringcheck2);
    }

    @Test(expected = NumberFormatException.class)
    public void ExceptionTest_NumberFormatException(){
        f.stringToIntConverter(incorrectstringcheck);
        f.stringToIntConverter(incorrectstringcheck3);
        f.stringToIntConverter(incorrectstringcheck4);
        f.stringToIntConverter(incorrectstringcheck5);
    }

    //test selecionts sort
    @Test(expected = IllegalArgumentException.class)
    public void selectionSortException(){
        f.selectionSort(arraydisordinato,4);
    }



}
