package com.ibercode;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class B64EncoderTest {

	@Test
	void testEncrypt() {
		
		assertEquals("QUJD", B64Encoder.getEncoded("ABC"));
	}
	
	@Test
	void testDecrypt() {
		
		assertEquals("ABC", B64Encoder.getDecoded("QUJD"));
	}

}