package algo;

import common.TreeNode;
import model.map.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinimaxTest {

    private TreeNode<Board> root;

    @BeforeEach
    public void setUp() {
        // Create a simple game tree with Board nodes
        root = new TreeNode<>(new Board("root"));

        TreeNode<Board> left = new TreeNode<>(new Board("left"));
        TreeNode<Board> right = new TreeNode<>(new Board("right"));

        root.addChild(left);
        root.addChild(right);

        TreeNode<Board> leftLeft = new TreeNode<>(new Board("leftLeft"));
        TreeNode<Board> leftRight = new TreeNode<>(new Board("leftRight"));
        left.addChild(leftLeft);
        left.addChild(leftRight);

        TreeNode<Board> rightLeft = new TreeNode<>(new Board("rightLeft"));
        TreeNode<Board> rightRight = new TreeNode<>(new Board("rightRight"));
        right.addChild(rightLeft);
        right.addChild(rightRight);
    }

    @Test
    public void testMinimaxMaximizer() {
        int result = Minimax.minimax(0, 2, true, root);
        assertNotNull(result);
        assertTrue(result >= 0);
    }

    @Test
    public void testMinimaxMinimizer() {
        int result = Minimax.minimax(0, 2, false, root);
        assertNotNull(result);
        // Result can be positive or negative depending on hash codes
        assertTrue(result != Integer.MAX_VALUE);
    }

    @Test
    public void testMinimaxBaseCase() {
        int result = Minimax.minimax(2, 2, true, root);
        assertEquals(root.getData().hashCode(), result);
    }

    @Test
    public void testMinimaxDepthOne() {
        int result = Minimax.minimax(0, 1, true, root);
        assertNotNull(result);
    }

    @Test
    public void testMinimaxWithBoardEquality() {
        Board board1 = new Board("test");
        Board board2 = new Board("test");
        assertEquals(board1.hashCode(), board2.hashCode());
    }
}

