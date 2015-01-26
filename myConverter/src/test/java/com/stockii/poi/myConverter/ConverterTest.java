/*
 * testfor Converter
 */
package com.stockii.poi.myConverter;
import org.junit.Test;
/**
 * 
 * @author yueyuelucky
 *
 */
public class ConverterTest {
	
	@Test
	public void test01(){
		Converter converter = new Converter();
		
		String a = converter.toRoman(11);
		System.out.println(a);
		
		int b = converter.toDecimal("IV");
		System.out.println(b);
	}

}
