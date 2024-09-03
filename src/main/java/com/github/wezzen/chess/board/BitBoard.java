package com.github.wezzen.chess.board;

import com.github.wezzen.chess.Color;
import com.github.wezzen.chess.board.generator.BitBoardGenerator;

/**
 * Chessboard with bit logic.
 */
public class BitBoard {

    private static final int NUM_PLAYERS = 2;
    
    private static final int WHITE_INDEX = 0;
    
    private static final int BLACK_INDEX = 1;
    
    /**
     * Boards for each type of figure.
     */
    final long[][] bitBoards = new long[NUM_PLAYERS][BitBoardIndices.NUM_PIECES];
    final long boardWhite;
    final long boardBlack;
    /**
     * Combined board with all of figure.
     */
    final long board;

    public BitBoard(final BitBoardGenerator generator) {
        bitBoards[WHITE_INDEX][BitBoardIndices.PAWNS] = generator.pawns(Color.WHITE);
        bitBoards[WHITE_INDEX][BitBoardIndices.KNIGHTS] = generator.knights(Color.WHITE);
        bitBoards[WHITE_INDEX][BitBoardIndices.BISHOP] = generator.bishops(Color.WHITE);
        bitBoards[WHITE_INDEX][BitBoardIndices.ROOK] = generator.rooks(Color.WHITE);
        bitBoards[WHITE_INDEX][BitBoardIndices.QUEEN] = generator.queen(Color.WHITE);
        bitBoards[WHITE_INDEX][BitBoardIndices.KING] = generator.king(Color.WHITE);

        bitBoards[BLACK_INDEX][BitBoardIndices.PAWNS] = generator.pawns(Color.BLACK);
        bitBoards[BLACK_INDEX][BitBoardIndices.KNIGHTS] = generator.knights(Color.BLACK);
        bitBoards[BLACK_INDEX][BitBoardIndices.BISHOP] = generator.bishops(Color.BLACK);
        bitBoards[BLACK_INDEX][BitBoardIndices.ROOK] = generator.rooks(Color.BLACK);
        bitBoards[BLACK_INDEX][BitBoardIndices.QUEEN] = generator.queen(Color.BLACK);
        bitBoards[BLACK_INDEX][BitBoardIndices.KING] = generator.king(Color.BLACK);

        boardWhite = packPieces(WHITE_INDEX);

        boardBlack = packPieces(BLACK_INDEX);
        
        board = boardWhite | boardBlack;
    }

    private long packPieces(final int index) {
        long packed = 0L;
        for (final long piece : bitBoards[index]) {
            packed |= piece;
        }
        return packed;
    }
    
}
