
public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public Portero(){
		super();
	}
	
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+", y juega de "+getPosicion()+" con el dorsal "+dorsal+". Le han marcado "+golesRecibidos;
	}
	
	public int compareTo(Object obj) {
		if (obj instanceof Futbolista ) {
			int x = this.golesRecibidos -  ((Portero) obj).golesRecibidos;
			return Math.abs(x);
		}
		else {
			return 0;
		}
		
	}

}