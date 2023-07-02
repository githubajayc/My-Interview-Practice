package com.general.interview.questions;

import java.time.LocalDate;

public class DateCompare {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(2023, 02, 16);
		LocalDate d2 = LocalDate.of(2023, 01, 16);
		
		if(d1.isBefore(d2)) {
			System.out.println(d1 + "is before" + d2);
		}else if(d1.isAfter(d2)) {
			System.out.println(d1 + " is after " + d2);
		}else {
			System.out.println("Dates are equal");
		}

	}

}
