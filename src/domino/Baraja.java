package domino;

import java.util.ArrayList;
import java.util.Random;

public class Baraja {

	ArrayList<Ficha> baraja = new ArrayList();
	Random aleatorio =new Random();

	public void armarBaraja() {
		//para que las fichas no se repitan ya que ficha(a,b)=ficha(b,a)
		int contador=0;
		// vamos a crear las fichas con un buble de creacion;
		for (int lado1 = 0; lado1 < 7; lado1++) {
			for (int lado2 = contador; lado2 < 7; lado2++) {
				baraja.add(new Ficha(lado1, lado2));
				}
			contador++;	
		}
	}
	
	public void repartir( Jugador jugador) {
		int cualFicha=aleatorio.nextInt(baraja.size());
		for (int cuantas=0;cuantas<7;cuantas++) {
			jugador.getJuego().add(baraja.get(cualFicha));
			baraja.remove(cualFicha);
		}

	};
}
