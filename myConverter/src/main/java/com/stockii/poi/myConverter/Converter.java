/*
 * converter decimal to roman and
 * converter roman to decimal
 */
package com.stockii.poi.myConverter;
/**
 * 
 * @author yueyuelucky
 * @version 1.0
 *
 */
public class Converter {
	private final static String rnums[] = { "m", "cm", "d", "cd", "c", "xc",
			"l", "xl", "x", "Mx", "v", "Mv", "M", "CM", "D", "CD", "C", "XC",
			"L", "XL", "X", "IX", "V", "IV", "I" }; // 儲存所有羅馬數字
	private final static int anums[] = { 1000000, 900000, 500000, 400000,
			100000, 90000, 50000, 40000, 10000, 9000, 5000, 4000, 1000, 900,
			500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }; // 儲存羅馬數字表示的值

	/**
	 * judge whether or not a integer
	 * @param s
	 * @return
	 */
	@SuppressWarnings("unused")
	public boolean isDigit(String s) { 
		try {
			int i = Integer.parseInt(s); 
		} catch (Exception e) {
			return false;
		}
		return true; 
	}

	/**
	 * converter decimal to roman
	 * @param num
	 * @return
	 */
	public String toRoman(int num) { 
		if (num == 0) { 
			return "ZERO";
		} else if (num < 0 || num > 3999999) { 
			return "OVERFLOW";
		}

		StringBuilder output = new StringBuilder(); 
		for (int i = 0; num > 0 && i < anums.length; i++)
		{
			while (num >= anums[i]) { 
				num -= anums[i];
				output.append(rnums[i]);
			}
		}
		return output.toString(); 
	}

	/**
	 * converter roman to decimal
	 * @param s
	 * @return
	 */
	public int toDecimal(String s) { 
		int num = 0;
		StringBuilder Buffer = new StringBuilder(s); 
		for (int i = 0; Buffer.length() > 0 && i < anums.length; i++) 
		{
			while (Buffer.indexOf(rnums[i]) == 0) { 
				num += anums[i]; 
				Buffer.delete(0, rnums[i].length()); 
			}
		}
		return num; 
	}
}
