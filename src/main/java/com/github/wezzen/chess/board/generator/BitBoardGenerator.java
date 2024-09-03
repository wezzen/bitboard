package com.github.wezzen.chess.board.generator;

import com.github.wezzen.chess.Color;

/**
 * Interface for generating a chessboard and arranging pieces on it for each color.
 */
public interface BitBoardGenerator {

    long pawns(final Color color);

    long knights(final Color color);

    long bishops(final Color color);

    long rooks(final Color color);

    long queen(final Color color);

    long king(final Color color);

}
