package ar.edu.unlp.info.oo2.ejercicio_20_PersonajesDeJuegosDeRol;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJuego {

	FactoryPersonaje magoFactory;
	FactoryPersonaje guerreroFactory;
	FactoryPersonaje arqueroFactory;
	Personaje mago;
	Personaje guerrero;
	Personaje arquero;
	
	@BeforeEach
	void setUp() throws Exception {
		magoFactory = new FactoryPersonajeMago();
		guerreroFactory = new FactoryPersonajeGuerrero();
		arqueroFactory = new FactoryPersonajeArquero();
		mago = magoFactory.crearPersonaje();
		guerrero = guerreroFactory.crearPersonaje();
		arquero = arqueroFactory.crearPersonaje();
	}

	
    @Test
    void testGuerreroAtacaMago() {
        int vidaInicialMago = mago.getVida();
        guerrero.atacar(mago);
        assertEquals( vidaInicialMago - 8 , mago.getVida() );
    }

    @Test
    void testArqueroAtacaGuerrero() {
        int vidaInicialGuerrero = guerrero.getVida();
        arquero.atacar(guerrero);
        assertEquals( vidaInicialGuerrero - 3 , guerrero.getVida() );
    }

    @Test
    void testMagoAtacaArquero() {
        int vidaInicialArquero = arquero.getVida();
        mago.atacar(arquero);
        assertEquals( vidaInicialArquero - 2 , arquero.getVida() );
    }

    @Test
    void testReduccionDeDañoArmaduraDeCuero() {
        Armadura armaduraDeCuero = new ArmaduraDeCuero();
        int dañoEsperado = 8;
        assertEquals( dañoEsperado , armaduraDeCuero.recibirAtaque(8) );
    }

    @Test
    void testReduccionDeDañoArmaduraDeHierro() {
        Armadura armaduraDeHierro = new ArmaduraDeHierro();
        int dañoInicial = 8;
        int dañoEsperado = (int) Math.ceil(dañoInicial * 0.575);
        assertEquals( dañoEsperado , armaduraDeHierro.recibirAtaque(dañoInicial) );
    }

    @Test
    void testReduccionDeDañoArmaduraDeAcero() {
        Armadura armaduraDeAcero = new ArmaduraDeAcero();
        int dañoInicial = 8;
        int dañoEsperado = (int) Math.ceil(dañoInicial * 0.425);
        assertEquals( dañoEsperado , armaduraDeAcero.recibirAtaque(dañoInicial) );
    }
    
}
