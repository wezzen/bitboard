package com.github.wezzen.chess.board;

import com.github.wezzen.chess.board.generator.BitBoardGenerator;
import com.github.wezzen.chess.board.generator.StandardBoardGenerator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class BitBoardTest {

    private static final long STANDARD_BOARD_FULL_MASK = 0xFFFF00000000FFFFL;

    @Test
    void BitBoardCreatingInstance() {
        assertDoesNotThrow(() -> new BitBoard(Mockito.mock(BitBoardGenerator.class)));
    }

    @Test
    void boardTest() {
        final BitBoard bitBoard = new BitBoard(new StandardBoardGenerator());
        assertEquals(STANDARD_BOARD_FULL_MASK, bitBoard.board);
    }

}