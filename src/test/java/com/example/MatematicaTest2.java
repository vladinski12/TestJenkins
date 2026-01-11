package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

public class MatematicaTest2 {

    Matematica matematica;

    @Before
    public void setUp() {
        matematica = new Matematica();
    }

    @Test
    public void testRaportCorect() {
        double rezultat = matematica.raport(12, 3);
        double rezultatAsteptat = 4;
        assertEquals(rezultatAsteptat, rezultat, 0.1);
    }

    @Test

    public void testRaportExceptie() {
        try {
            matematica.raport(
                    34, 0);
            fail("Metoda nu arunca exceptie");

        } catch (IllegalArgumentException er) {

        }

    }
}
