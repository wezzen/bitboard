package com.github.wezzen.chess.board;

import com.github.wezzen.chess.Color;
import com.github.wezzen.chess.board.generator.BitBoardGenerator;

/**
 * Chessboard with bit logic.
 */
public class BitBoard {

    /**
     * Boards for each type of figure.
     */
    final long[] bitBoards = new long[BitBoardIndices.TOTAL];
    /**
     * Combined board with all of figure.
     */
    final long board;

    public BitBoard(final BitBoardGenerator generator) {
        bitBoards[BitBoardIndices.WHITE_PAWNS] = generator.pawns(Color.WHITE);
        bitBoards[BitBoardIndices.WHITE_KNIGHTS] = generator.knights(Color.WHITE);
        bitBoards[BitBoardIndices.WHITE_BISHOP] = generator.bishops(Color.WHITE);
        bitBoards[BitBoardIndices.WHITE_ROOK] = generator.rooks(Color.WHITE);
        bitBoards[BitBoardIndices.WHITE_QUEEN] = generator.queen(Color.WHITE);
        bitBoards[BitBoardIndices.WHITE_KING] = generator.king(Color.WHITE);

        bitBoards[BitBoardIndices.BLACK_PAWNS] = generator.pawns(Color.BLACK);
        bitBoards[BitBoardIndices.BLACK_KNIGHTS] = generator.knights(Color.BLACK);
        bitBoards[BitBoardIndices.BLACK_BISHOP] = generator.bishops(Color.BLACK);
        bitBoards[BitBoardIndices.BLACK_ROOK] = generator.rooks(Color.BLACK);
        bitBoards[BitBoardIndices.BLACK_QUEEN] = generator.queen(Color.BLACK);
        bitBoards[BitBoardIndices.BLACK_KING] = generator.king(Color.BLACK);

        long b = 0L;
        for (int i = 0; i < BitBoardIndices.TOTAL; i++) {
            b |= bitBoards[i];
        }
        board = b;
    }

}
