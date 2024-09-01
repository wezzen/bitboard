package com.github.wezzen.chess;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void simpleTest() {
        assertDoesNotThrow(() -> Main.main(Mockito.any()));
    }

}