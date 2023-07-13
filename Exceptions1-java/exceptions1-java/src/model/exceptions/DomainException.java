package model.exceptions;

public class DomainException extends RuntimeException { //RuntimeException me permite não tratar as exceções pois é genérico e abrange "todas".
    
    public DomainException (String msg) { // permite que a exceção personalizada seja instanciada, passando uma msg para ela, que por sua vez fica armazenada na exceção.
        super(msg);
    }


}
