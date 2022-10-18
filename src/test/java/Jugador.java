
public class Jugador extends Futbolista implements Comparable{
	public short golesMarcados;
	public byte dorsal;
	
	public boolean jugarConLasManos() {
		return false;
	}

	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}

	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	public int compareTo(Object obj) {
		if (obj instanceof Futbolista ) {
			int x = this.getEdad() - ((Jugador) obj).getEdad();
			return Math.abs(x);
		}
		else {
			return 0;
		}
		
	}
	
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+", y juega de "+getPosicion()+" con el dorsal "+dorsal+". Ha marcado "+golesMarcados;
	}

}