package eedd.ra4.videojuego.vo;

/**
 *
 * Jugador: Clase de persistencia que representa un Jugador.
 * 
 * @author Isidoro Nevares Martín - IES Virgen de la Paloma
 * @date 03 marzo 2026
 * 
 * 
 */
public class Jugador extends Personaje {

	private static final int MULTIPLICADOR_DANIO = 20;
	private static final int EXPERIENCIA_SUBIR_NIVEL = 100;
	
	public int experiencia;

    public void ganarExperiencia(int puntos) {
        experiencia += puntos;
        if (experiencia > Jugador.EXPERIENCIA_SUBIR_NIVEL) {
            nivel++;
            experiencia = 0;
        }
    }
    
    public void ataqueEspecial(Enemigo enemigo) {
        int danio = nivel * Jugador.MULTIPLICADOR_DANIO;
        enemigo.vida -= danio;
    }
}
