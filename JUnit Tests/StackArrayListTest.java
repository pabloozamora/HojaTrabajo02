import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackArrayListTest {

	@Test
	void testPush() {
		StackArrayList<Integer> stack = new StackArrayList<>();
		stack.push(1);
		int resultado = stack.pull();
		assertEquals(1,resultado);
	}

	@Test
	void testCount() {
		StackArrayList<Integer> stack = new StackArrayList<>();
		stack.push(1);
		int resultado = stack.count();
		assertEquals(1,resultado);
	}

	@Test
	void testIsEmpty() {
		StackArrayList<Integer> stack = new StackArrayList<>();
		stack.push(1);
		boolean resultado = stack.isEmpty();
		assertEquals(false,resultado);
	}

}
