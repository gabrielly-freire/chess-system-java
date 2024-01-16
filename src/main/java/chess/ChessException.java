package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {

    public static final double serialVersionUID = 1L;

    public ChessException(String message){
        super(message);
    }
}
