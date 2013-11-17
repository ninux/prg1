package shop;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommentTest {

	/**
	 * Test that the given information on a comment is stored
	 * correctly.
	 */
	@Test
	public void testCommentCreation()
	{
		Comment comment1 = new Comment("Max Power", "a", 1);
		assertEquals("Max Power", comment1.getAuthor());
		assertEquals(1, comment1.getRating());
	}

}
