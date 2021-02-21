


/**
 *
 * @author Leo
 */
import org.xml.sax.helpers.*;
import org.xml.sax.*;
public class GestorContenido extends DefaultHandler {

	int numeroPartida;
	float numeroCarta;
	Jugador jugadorLeido = null;
	Jugador jugadorGanador = new Jugador();
	boolean comienzoNumeroCarta;
	boolean comienzoNombreJugador;
	int i;
	
    public GestorContenido() {
        super();
    }
    @Override
    public void startDocument(){
        System.out.println("Comienzo del documento XML");
    }
    @Override
    public void endDocument(){
        System.out.println("Fin del documento XML");
    }
    @Override
    public void startElement(String uri, String nombre, String nombreC, Attributes att){
        
    	switch(nombreC) {
    	
    		case "partida":
    			
    			numeroPartida = Integer.parseInt(att.getValue(i++));
    			
    			break;
    	
    		case "nombre":
    	
    			comienzoNombreJugador = true;
    			
    			break;
    			
    		case "numero":
    			
    			comienzoNumeroCarta = true;
    			
    			break;
    	}
    	
    }
    	
    @Override
    public void endElement(String uri, String nombre, String nombreC){
        
    	System.out.println("El ganador es"+ jugadorGanador.getNombre());
    }
    @Override
    public void characters (char[] ch, int inicio, int longitud)
            throws SAXException{
    	
    	String cad = new String(ch, inicio, longitud);
    	
    	//Analizando el jugador leido
    	
    	if(comienzoNombreJugador) {
    		
    		jugadorLeido.setNombre(cad);
    		
    		if(comienzoNumeroCarta) {
    			
    			if(jugadorGanador.compareTo(jugadorLeido) == 1) {
    				
    				jugadorGanador = jugadorLeido;
    				
    			}
    		}
    	}
    	
    	
    	
    	if(comienzoNumeroCarta) {
    		
    		jugadorLeido.incrementarPuntuacion(Integer.parseInt(cad));
    		
    		if(!jugadorLeido.hePerdido()) {
    			
    			if(jugadorGanador.compareTo(jugadorLeido) == 1) {
    				
    				jugadorGanador = jugadorLeido;
    				
    			} 
    			
    		}
    			
    	}
    /*    
        cad = cad.replaceAll("[\t\n]",""); // Quitamos tabuladores y saltos de linea
       System.out.println("\t\t" + cad); */
    		
    }
}
// FIN GestionContenido
