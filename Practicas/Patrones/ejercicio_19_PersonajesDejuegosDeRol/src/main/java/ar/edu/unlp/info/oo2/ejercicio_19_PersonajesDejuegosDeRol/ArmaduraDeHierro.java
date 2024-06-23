package ar.edu.unlp.info.oo2.ejercicio_19_PersonajesDejuegosDeRol;

public class ArmaduraDeHierro extends Armadura {
	
    public int recibirAtaque(int danio) {
        return (int) Math.ceil(danio * 0.575);  // Reducción promedio del 42.5%
    }
    
}
