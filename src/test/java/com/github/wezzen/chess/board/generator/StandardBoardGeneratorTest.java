package com.github.wezzen.chess.board.generator;

import com.github.wezzen.chess.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardBoardGeneratorTest {

    @Test
    void creatingInstanceTest() {
        assertDoesNotThrow(StandardBoardGenerator::new);
    }

    @Test
    void pawnsGenerationTest() {
        final long whitePawns = new StandardBoardGenerator().pawns(Color.WHITE);
        final long blackPawns = new StandardBoardGenerator().pawns(Color.BLACK);
        assertEquals(8, Long.bitCount(whitePawns));
        assertEquals(8, Long.bitCount(blackPawns));
        final long pawns = 0xFFL;
        assertEquals(pawns << 8, whitePawns);
        assertEquals(pawns << (6 * 8), blackPawns);
    }

    @Test
    void knightsGenerationTest() {
        final long whiteKnights = new StandardBoardGenerator().knights(Color.WHITE);
        final long blackKnights = new StandardBoardGenerator().knights(Color.BLACK);
        assertEquals(2, Long.bitCount(whiteKnights));
        assertEquals(2, Long.bitCount(blackKnights));
        final long knights = 0b1000010;
        assertEquals(knights, whiteKnights);
        assertEquals(knights << (8 * 7), blackKnights);
    }

    @Test
    void bishopsGenerationTest() {
        final long whiteBishops = new StandardBoardGenerator().bishops(Color.WHITE);
        final long blackBishops = new StandardBoardGenerator().bishops(Color.BLACK);
        assertEquals(2, Long.bitCount(whiteBishops));
        assertEquals(2, Long.bitCount(blackBishops));
        final long bishops = 0b100100;
        assertEquals(bishops, whiteBishops);
        assertEquals(bishops << (8 * 7), blackBishops);
    }

    @Test
    void rooksGenerationTest() {
        final long whiteRooks = new StandardBoardGenerator().rooks(Color.WHITE);
        final long blackRooks = new StandardBoardGenerator().rooks(Color.BLACK);
        assertEquals(2, Long.bitCount(whiteRooks));
        assertEquals(2, Long.bitCount(blackRooks));
        final long rooks = 0b10000001L;
        assertEquals(rooks, whiteRooks);
        assertEquals(rooks << (8 * 7), blackRooks);
    }

    @Test
    void queensGenerationTest() {
        final long whiteQueen = new StandardBoardGenerator().queen(Color.WHITE);
        final long blackQueen = new StandardBoardGenerator().queen(Color.BLACK);
        assertEquals(1, Long.bitCount(whiteQueen));
        assertEquals(1, Long.bitCount(blackQueen));
        final long queens = 0b10000L;
        assertEquals(queens, whiteQueen);
        assertEquals(queens << (8 * 7), blackQueen);
    }

    @Test
    void kingsGenerationTest() {
        final long whiteKing = new StandardBoardGenerator().king(Color.WHITE);
        final long blackKing = new StandardBoardGenerator().king(Color.BLACK);
        assertEquals(1, Long.bitCount(whiteKing));
        assertEquals(1, Long.bitCount(blackKing));
        final long kings = 0b01000L;
        assertEquals(kings, whiteKing);
        assertEquals(kings << (8 * 7), blackKing);
    }
}