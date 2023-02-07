package com.solo.controller;

import com.RSA.files.RSAGeneratorUtil;
import com.RSA.files.RSAUtil;

public class RSAFilesController {
	
	public static void main(String[] args) throws Exception {  
		// Generate private and public key
		RSAGeneratorUtil.generateFiles("RSA");
		// Encrypt Text
		String encrypt = RSAUtil.encrypt("hello", "RSA");
		System.out.println("encrypt text : " + encrypt);
		// Decrypt Text
		String decrypt = RSAUtil.decrypt(encrypt, "RSA");
		System.out.println("decrypt text : " + decrypt);
	}
	
}
