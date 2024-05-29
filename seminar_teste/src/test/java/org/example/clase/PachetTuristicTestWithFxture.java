package org.example.clase;

import dubluri.AreFake;
import dubluri.FaraFake;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class PachetTuristicTestWithFxture {
    private PachetTuristic pachet;
    @Before
    public void setUp() throws Exception {
        IPersoana persoana = new PersoanaFake();
        ((PersoanaFake) persoana).setVarsta(70);
        this.pachet = new PachetTuristic(persoana, "Paris", 100.0);
    }
    @Test
    @Category(AreFake.class)
    public void testAplicaDiscountCuZero(){
        this.pachet.aplicaDiscountVarstnici(0);
        assertEquals(100.0, this.pachet.getPret(), 0.01);
    }
    @Test
    @Category(AreFake.class)
    public void testAplicaDiscountCuSutaLaSuta(){
        this.pachet.aplicaDiscountVarstnici(100);
        assertEquals(0.0, this.pachet.getPret(), 0.01);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAplicaDsocuntNegativ(){
        this.pachet.aplicaDiscountVarstnici(-10);
    }
    @Test(timeout = 10)
    public void testPerformantaAplicareDiscount(){
        this.pachet.aplicaDiscountVarstnici(10);
    }
}