package com.sapient.shapes;

public class fig_to_words {
	public String numberToWords(long number) {
		String words = "";
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		String val[] = {"Crores", "Lakhs", "Thousands", "hundreds", "only"};
		long inVal[] = { 10000000, 100000, 1000, 100, 1};
		for(int i=0;i<inVal.length;i++) {
			long b1 = number / inVal[i];
			number = number % inVal[i];
			if(b1 > 0) {
				if(b1 > 19) {
					words = words + tensArray[(int)b1/10] + unitsArray[(int)b1%10] + val[i];
				}
				else {
					words = words + unitsArray[(int)b1] + val[i];
				}
			}
		}

//		if (number == 0)
//			return "zero";
//		if (number < 0) {
//			number = (-1) * number;
//			return "minus " + numberToWords(number);
//		}
//		if (number / 1000 > 0) {
//			words += numberToWords(number / 1000) + " thousand ";
//			number %= 1000;
//		}
//		if (number / 100 > 0) {
//			words += numberToWords(number / 100) + " hundred ";
//			number %= 100;
//		}
//		if (number > 0) {
//			if (number < 20) {
//				words += unitsArray[number];
//			} else {
//				words += tensArray[number / 10];
//				if ((number % 10) > 0) {
//					words += "-" + unitsArray[number % 10];
//				}
//			}
//		}
//		words += " only";
		return words;
	}
}
