package chess;

public class ChessException extends RuntimeException{

    public static final double serialVersionUID = 1L;

    public ChessException(String message){
        super(message);
    }
}
