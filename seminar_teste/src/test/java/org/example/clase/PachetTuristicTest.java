package org.example.clase;

import dubluri.AreFake;
import dubluri.FaraFake;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;


public class PachetTuristicTest {
    @Test
    @Category(FaraFake.class)
    public void poateAplicaDiscount(){
        IPersoana client=new Persoana("Mihai", "1021103123456");
        PachetTuristic pachet= new PachetTuristic(client, "Paris", 100.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(90.0, pachet.getPret(), 0.01);
    }

    @Test
    @Category(FaraFake.class)
    public void testBoundaryAplicaDiscount(){
        IPersoana client=new Persoana("Mihai", "2590304117187");
        PachetTuristic pachet = new PachetTuristic(client, "Paris", 100.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(90.0, pachet.getPret(), 0.01);
    }
    @Test
    @Category(AreFake.class)
    public void testFakeAplicaDiscount(){
        PersoanaFake persoan = new PersoanaFake();
        persoan.setVarsta(65);
        PachetTuristic pachet = new PachetTuristic(persoan, "Paris", 50.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(45.0, pachet.getPret(), 0.01);
    }
    @Test
    @Category(AreFake.class)
    public void testFakeNuAplicaDiscount(){
        PersoanaFake persoan = new PersoanaFake();
        persoan.setVarsta(21);
        PachetTuristic pachet = new PachetTuristic(persoan, "Paris", 50.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(50.0, pachet.getPret(), 0.01);
    }
}