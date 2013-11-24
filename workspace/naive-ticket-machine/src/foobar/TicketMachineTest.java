package foobar;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketMachineTest {

	@Test
	public void testTicketMachine(){
		TicketMachine tm1 = new TicketMachine(5);
		assertEquals(5, tm1.getPrice());
		assertEquals(0, tm1.getBalance());
	}

}
