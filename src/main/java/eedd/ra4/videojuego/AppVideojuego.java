package eedd.ra4.videojuego;

import eedd.ra4.videojuego.vo.Enemigo;
import eedd.ra4.videojuego.vo.Jugador;

/**
 *
 * AppVideojuego: Clase que realiza el tratamiento de un videojuego.
 * 
 * @author Isidoro Nevares Martín - IES Virgen de la Paloma
 * @date 4 dic 2025
 * 
 * 
 */

public class AppVideojuego {
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        jugador.nombre = "Héroe";
        jugador.vida = 100;
        jugador.nivel = 5;
        jugador.experiencia = 50;

        Enemigo enemigo = new Enemigo();
        enemigo.nombre = "Orco";
        enemigo.vida = 80;
        enemigo.nivel = 3;
        enemigo.tipo = "Guerrero";
        
        jugador.atacar(enemigo);

        System.out.println("Vida del enemigo: " + enemigo.vida);
    }
}
