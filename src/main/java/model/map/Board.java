package model.map;

/**
 * Represents a game board state.
 * This is a placeholder class for board representation in game trees.
 * Extend this class to implement specific board logic for your game.
 */
public class Board {
    private String state;

    /**
     * Constructs a Board with the given state.
     *
     * @param state The state of the board
     */
    public Board(String state) {
        this.state = state;
    }

    /**
     * Gets the state of the board.
     *
     * @return The board state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state of the board.
     *
     * @param state The board state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Provides a hash code based on the board state.
     *
     * @return The hash code of this board
     */
    @Override
    public int hashCode() {
        return state != null ? state.hashCode() : 0;
    }

    /**
     * Checks equality based on board state.
     *
     * @param obj The object to compare
     * @return true if boards have the same state, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Board board = (Board) obj;
        return state != null ? state.equals(board.state) : board.state == null;
    }

    /**
     * Returns a string representation of the board.
     *
     * @return The board state as a string
     */
    @Override
    public String toString() {
        return "Board{" +
               "state='" + state + '\'' +
               '}';
    }
}

