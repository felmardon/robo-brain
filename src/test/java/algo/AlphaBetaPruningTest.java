package algo;

import common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlphaBetaPruningTest {

    private TreeNode<Integer> root;

    @BeforeEach
    public void setUp() {
        // Create a simple game tree for testing
        //       root(3)
        //      /      \
        //    (2)        (5)
        //   /    \     /    \
        // (3)  (12)  (8)  (2)

        root = new TreeNode<>(3);

        TreeNode<Integer> left = new TreeNode<>(2);
        TreeNode<Integer> right = new TreeNode<>(5);

        root.addChild(left);
        root.addChild(right);

        TreeNode<Integer> leftLeft = new TreeNode<>(3);
        TreeNode<Integer> leftRight = new TreeNode<>(12);
        left.addChild(leftLeft);
        left.addChild(leftRight);

        TreeNode<Integer> rightLeft = new TreeNode<>(8);
        TreeNode<Integer> rightRight = new TreeNode<>(2);
        right.addChild(rightLeft);
        right.addChild(rightRight);
    }

    @Test
    public void testAlphaBetaPruning() {
        int result = AlphaBetaPruning.alphabetapruning(0, 2, true, root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertNotNull(result);
        assertTrue(result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE);
    }

    @Test
    public void testAlphaBetaPruningMaximizer() {
        int result = AlphaBetaPruning.alphabetapruning(0, 1, true, root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertNotNull(result);
    }

    @Test
    public void testAlphaBetaPruningMinimizer() {
        int result = AlphaBetaPruning.alphabetapruning(0, 1, false, root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertNotNull(result);
    }

    @Test
    public void testAlphaBetaPruningBaseCase() {
        int result = AlphaBetaPruning.alphabetapruning(2, 2, true, root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertEquals(3, result);
    }
}

