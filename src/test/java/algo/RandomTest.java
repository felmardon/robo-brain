package algo;

import common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RandomTest {

    private TreeNode<Integer> root;

    @BeforeEach
    public void setUp() {
        root = new TreeNode<>(1);

        TreeNode<Integer> child1 = new TreeNode<>(2);
        TreeNode<Integer> child2 = new TreeNode<>(3);
        TreeNode<Integer> child3 = new TreeNode<>(4);

        root.addChild(child1);
        root.addChild(child2);
        root.addChild(child3);
    }

    @Test
    public void testRandomWithChildren() {
        Integer result = Random.random(root);
        assertNotNull(result);
        assertTrue(result == 2 || result == 3 || result == 4);
    }

    @Test
    public void testRandomWithoutChildren() {
        TreeNode<Integer> leaf = new TreeNode<>(42);
        Integer result = Random.random(leaf);
        assertEquals(42, result);
    }

    @Test
    public void testRandomReturnsValidValue() {
        for (int i = 0; i < 100; i++) {
            Integer result = Random.random(root);
            assertTrue(result >= 1 && result <= 4);
        }
    }

    @Test
    public void testRandomWithEmptyChildren() {
        TreeNode<Integer> node = new TreeNode<>(10);
        node.getChildren().clear();
        Integer result = Random.random(node);
        assertEquals(10, result);
    }

    @Test
    public void testRandomDistribution() {
        // Test that random selection has some variety
        int[] results = new int[5];
        for (int i = 0; i < 100; i++) {
            Integer result = Random.random(root);
            results[result]++;
        }

        // At least some variety should exist
        int nonZeroCount = 0;
        for (int count : results) {
            if (count > 0) nonZeroCount++;
        }
        assertGreater(nonZeroCount, 1, "Random selection should show variety");
    }

    // Helper method for custom assertion
    private void assertGreater(int actual, int expected, String message) {
        assertTrue(actual > expected, message);
    }
}

