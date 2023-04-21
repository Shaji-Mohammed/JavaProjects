package sudoku.problemDomain;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final int gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(int gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public int getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}