/**
 * Clase DemasiadoRapidoException
 * Clase que gestiona la excepción de demasiadoRapidoException y hereda de Exception
 * @author Willy
 * @version 1.0.0
 * */
public class DemasiadoRapidoException extends Exception{
    /**
     * Metodo que recibe 1 parametro y hereda de Exception
     * @param message
     */
    public DemasiadoRapidoException(String message) {
        super(message);
    }
}
