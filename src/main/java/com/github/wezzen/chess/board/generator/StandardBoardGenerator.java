package com.github.wezzen.chess.board.generator;

import com.github.wezzen.chess.Color;

/**
 * Standard arrangement of pieces on the board.
 */
public class StandardBoardGenerator implements BitBoardGenerator {

    @Override
    public long pawns(final Color color) {
        return switch (color) {
            case BLACK -> 0xFF000000000000L;
            case WHITE -> 0xFF00L;
        };
    }

    @Override
    public long knights(final Color color) {
        return switch (color) {
            case BLACK -> 0x4200000000000000L;
            case WHITE -> 0x42L;
        };
    }

    @Override
    public long bishops(final Color color) {
        return switch (color) {
            case BLACK -> 0x2400000000000000L;
            case WHITE -> 0x24L;
        };
    }

    @Override
    public long rooks(final Color color) {
        return switch (color) {
            case BLACK -> 0x8100000000000000L;
            case WHITE -> 0x81L;
        };
    }

    @Override
    public long queen(final Color color) {
        return switch (color) {
            case BLACK -> 0x1000000000000000L;
            case WHITE -> 0x10L;
        };
    }

    @Override
    public long king(final Color color) {
        return switch (color) {
            case BLACK -> 0x800000000000000L;
            case WHITE -> 0x8L;
        };
    }
}
