package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MatematicaTest1 {

    Matematica matematica;

    @Before
    public void setUp() {
        matematica = new Matematica();
    }

    @Test
    public void testSuma() {
        int rezultat = matematica.suma(3, 12);
        int rezultatAsteptat = 15;
        assertEquals(rezultatAsteptat, rezultat);
    }

}
