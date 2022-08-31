/*
 * The MIT License
 *
 * Copyright 2022 Roliveira2208 <roliveira.29655@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package models.board;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Roliveira2208 <roliveira.29655@gmail.com>
 * @version 2022.08.31
 */
public class Board {
    private final int LENGTH = 10;
    private char[][] board;
    private int numShips = 0;
    
    public Board() {
        this.board = initBoard();
    }
    
    private char[][] initBoard() {
        char[][] matrix = new char[LENGTH][LENGTH];
        for (char[] row: matrix){
            Arrays.fill(row, CharSquare.WATER.getChar());
        }
        return matrix;
    }
    
     public int getNumShips() {
        return this.numShips;
    }
     
     public char[][] getBoard() {
        return this.board;
    }
}
