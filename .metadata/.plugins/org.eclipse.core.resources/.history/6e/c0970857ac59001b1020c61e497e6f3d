
public class Jugador implements Comparable<Jugador> {

	private String nombre;
	private float puntuacion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public float getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public void incrementarPuntuacion(int numero) {
		
		this.puntuacion += numero;
	}
	
	public boolean hePerdido() {
		
		if(this.puntuacion > 7) {
			
			return true;
			
		}else {
			
			return false;
		}
		
	}
	
	
	@Override
	public int compareTo(Jugador o) {
		// TODO Auto-generated method stub
		float puntuacion1 = this.puntuacion;
		float puntuacion2 = o.puntuacion;
		int resultado;
		
		if(puntuacion1 > puntuacion2) {
			
			resultado = 1;
			
		}else if(puntuacion1 == puntuacion2){
			
			resultado = 0;
			
		}else {
			
			resultado = -1;
		}
		
		return resultado;
	}
	
	
}
