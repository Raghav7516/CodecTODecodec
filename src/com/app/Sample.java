package com.app;

import org.apache.commons.codec.binary.Base64;


public class Sample {

	public static void main(String[] args) {
		String password="pawan250593";
		byte[] arr=password.getBytes();
		byte[] encod=Base64.encodeBase64(arr);
		String encoded=new String(encod);
		System.out.println(encoded);
		System.out.println("=============================================");
		byte[] arr1=encoded.getBytes();
		byte[] decod=Base64.decodeBase64(arr1);
		String decoded=new String(decod);
		System.out.println(decoded);
	}

}
