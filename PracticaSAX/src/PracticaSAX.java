


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.*;
import org.xml.sax.*;
public class PracticaSAX {
    XMLReader procesadorXML;
    GestorContenido gestor;
    InputSource archivoXML;
    public PracticaSAX (String nombreArchivo){
        try {
            SAXParserFactory parserFactory = SAXParserFactory.newInstance();
            SAXParser parser = parserFactory.newSAXParser();
            procesadorXML = parser.getXMLReader();
        } catch (SAXException ex) {
            Logger.getLogger(PracticaSAX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(PracticaSAX.class.getName()).log(Level.SEVERE, null, ex);
        }
        gestor = new GestorContenido();
        procesadorXML.setContentHandler(gestor);
        archivoXML = new InputSource(nombreArchivo);
    }
    void leerArchivo(){
        try {
            procesadorXML.parse(archivoXML);
        } catch (IOException ex) {
            Logger.getLogger(PracticaSAX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(PracticaSAX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
// Fin PruebaSAX1

