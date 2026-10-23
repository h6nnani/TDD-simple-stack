import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sgt.SimpleStack;

public class TestSimpleStack {
    /**
     * IsEmpty()
     * Pre-condition: True
     * Returns: true on an empty stack, otherwise false
     */
    @Test 
    public void testNewStackIsEmpty() {
        SimpleStack stack = new SimpleStack();
        Assertions.assertTrue(stack.isEmpty(), "Initialised stack should be empty.");
    }

    @Test
    public void testNewStackPushIsNotEmpty() {
        SimpleStack stack = new SimpleStack();
        int item = 1;
        stack.push(item);
        Assertions.assertFalse(stack.isEmpty(), "Stack should not be empty after a push.");
    }

    /**
     * push()
     * 
     */
}
