package Week1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class StringUtility {

	SUClass SUClass = new SUClass();

	@Test
	public void minL() {
		Assert.assertEquals(3L, SUClass.minL(3L, 8L));
	}

	@Test
	public void minF() {
		Assert.assertEquals(15f, SUClass.minF(15f, 20f), 0);
	}

	@Test
	public void minI() {
		Assert.assertEquals(5, SUClass.minI(5, 10));
	}

	@Test
	public void minD() {
		Assert.assertEquals(2.6, SUClass.minD(2.6, 6.4), 0);
	}

	@Test
	public void maxI() {
		Assert.assertEquals(30, SUClass.maxI(6, 30));
	}

	@Test
	public void maxD() {
		Assert.assertEquals(6.8, SUClass.maxD(4.9, 6.8), 0);
	}
	
	@Test
	public void maxI2() {
		Assert.assertEquals(30, SUClass.maxI2(6, 30));
	}

	@Test
	public void maxL() {
		Assert.assertEquals(1234L, SUClass.maxL(1234L, 123L));
	}

	@Test
	public void pow() {
		Assert.assertEquals(125, SUClass.pow(5.0, 3.0), 0);
	}
	
	@Test
	public void add() {
		int number = SUClass.addNum(12);
		assertEquals(13, number);
	}

	@Test
	public void testAddLong() {
		long number = SUClass.addNumL(10);
		assertEquals(11, number);
	}

	@Test
	public void testSubtrInt() {
		int number = SUClass.subNum(15);
		assertEquals(14, number);
	}

	@Test
	public void testSubtrLong() {
		long number = SUClass.subNumL(20);
		assertEquals(19, number);
	}

	@Test
	public void SRDouble() {
		Assert.assertEquals(6, SUClass.SRDouble(36.0), 0);
	}

	@Test
	public void CRDouble() {
		Assert.assertEquals(2, SUClass.CRDouble(8.0), 0);
	}

}