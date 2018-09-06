package com.ibercode;

import java.util.Base64;

public class B64Encoder {

	public static String getEncoded(String string) {
		return  Base64.getEncoder().encodeToString(string.getBytes());
	}
	
	public static String getDecoded(String string) {
		return new String(Base64.getDecoder().decode(string));
	}

}
