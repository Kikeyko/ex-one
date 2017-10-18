package com.jx.dev.example;
import org.joda.time.DateTime;

public class DemoJodaTime {
	public static void main(String[] x) {
		DateTime now = new DateTime();
		DateTime threeMonths = now.plusMonths(3);

		System.out.println("3 month later : " + threeMonths);
	}
}