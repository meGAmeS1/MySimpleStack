package dcll.FLEM;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by flemoal on 09/02/15.
 */
public class ItemTest extends TestCase {
	@Test
	public void testItemGetterSetterAndConstructor() {
		String testString = "Test Item 1";
		String testStringSetter = "Test Item 2";

		Item itemTestes = new Item(testString);
		assertEquals(itemTestes.getItem(), testString);

		itemTestes.setItem(testStringSetter);
		assertEquals(itemTestes.getItem(), testStringSetter);
	}
}
