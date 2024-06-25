package ar.edu.unlp.info.oo2.ejercicio_22_SubteWay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubteWayTest {

    private SubteWay subteWay;
    private BuilderSangucheClasico builderClasico;
    private BuilderSangucheSinTACC builderSinTACC;
    private BuilderSangucheVegano builderVegano;
    private BuilderSangucheVegetariano builderVegetariano;

    @BeforeEach
    void setUp() {
        builderClasico = new BuilderSangucheClasico();
        builderSinTACC = new BuilderSangucheSinTACC();
        builderVegano = new BuilderSangucheVegano();
        builderVegetariano = new BuilderSangucheVegetariano();
    }

    @Test
    void testConstruirSangucheClasico() {
        subteWay = new SubteWay(builderClasico);
        Sanguche sanguche = subteWay.construirSanguche();
        
        assertEquals(4, sanguche.getPartes().size());
        assertEquals(500, sanguche.getPrecio());
    }

    @Test
    void testConstruirSangucheSinTACC() {
        subteWay = new SubteWay(builderSinTACC);
        Sanguche sanguche = subteWay.construirSanguche();
        
        assertEquals(4, sanguche.getPartes().size());
        assertEquals(618, sanguche.getPrecio());
    }

    @Test
    void testConstruirSangucheVegano() {
        subteWay = new SubteWay(builderVegano);
        Sanguche sanguche = subteWay.construirSanguche();
        
        assertEquals(3, sanguche.getPartes().size());
        assertEquals(620, sanguche.getPrecio());
    }

    @Test
    void testConstruirSangucheVegetariano() {
        subteWay = new SubteWay(builderVegetariano);
        Sanguche sanguche = subteWay.construirSanguche();
        
        assertEquals(3, sanguche.getPartes().size());
        assertEquals(420, sanguche.getPrecio());
    }
}
