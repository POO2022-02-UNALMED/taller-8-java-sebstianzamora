package futbol;

public abstract class Futbolista implements Comparable{
	private String nombre;
	private int  edad;
	private final String posicion;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}

	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+", y juega de "+getPosicion();
	}
	
	public boolean equals(Futbolista f) {
		return this == f;
	}
	
	public abstract boolean jugarConLasManos();

}