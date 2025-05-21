package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.builders.BuilderSangucheClasico;
import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.builders.BuilderSangucheSinTACC;
import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.builders.BuilderSangucheVegano;
import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.builders.BuilderSangucheVegetariano;

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
        assertEquals(500, sanguche.calcularPrecio());
    }

    @Test
    void testConstruirSangucheSinTACC() {
        subteWay = new SubteWay(builderSinTACC);
        Sanguche sanguche = subteWay.construirSanguche();
        assertEquals(618, sanguche.calcularPrecio());
    }

    @Test
    void testConstruirSangucheVegano() {
        subteWay = new SubteWay(builderVegano);
        Sanguche sanguche = subteWay.construirSanguche();
        assertEquals(620, sanguche.calcularPrecio());
    }

    @Test
    void testConstruirSangucheVegetariano() {
        subteWay = new SubteWay(builderVegetariano);
        Sanguche sanguche = subteWay.construirSanguche();
        assertEquals(420, sanguche.calcularPrecio());
    }
}
