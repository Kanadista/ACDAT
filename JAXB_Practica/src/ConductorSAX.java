

public class ConductorSAX {
    public static void main (String[] args){
        String nombreArchivo = "apuestas.xml";
        PruebaSAX1 probando = new PruebaSAX1 (nombreArchivo);
        probando.leerArchivo();
    }// Fin main

} // Fin conductorSAX
