package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		Staff [] tst = new Staff[5];
		
		tst[0] = new Staff("Ubon", "The", "Ubiquitous",
				new Date(), "Everywhere", "9306664209", "Everywhere@everywebsite.com",
				"All the time", 100, 60000, new Date(),
				eTitle.MR) ;
		
		tst[1] = new Staff("Gary", "The", "Gluttonous",
				new Date(), "McDonalds", "9306664211", "meatlover44@poptarts.org",
				"9-5", 2, 70000, new Date(),
				eTitle.MR) ;
		
		tst[2] = new Staff("Ivanka", "The", "Inavoidable",
				new Date(), "Closer to you every day", "1111111111", "youremailbutwitha1attheend@gmail.com",
				"9-5", 6, 50000, new Date(),
				eTitle.MRS) ;
		
		tst[3] = new Staff("Keith", "The", "Dick",
				new Date(), "Across the Street", "6545556969", "pu$$yD3sTr0y3r@yahoo.com",
				"9-5", 1, 40000, new Date(),
				eTitle.MR) ;
		
		tst[4] = new Staff("Chad", "Money", "Thundercock",
				new Date(), "1600 Penn. Avenue", "9306664210", "CThundercock@Gmail.com",
				"6-7", 7, 80000, new Date(),
				eTitle.MR) ;
		
		double avg = 0;
		double total = 0;
		
		for (Staff s : tst) 
		{
			total += s.getSalary();
		}
		
		avg = total/5;
		
		assertEquals(avg, 60000.0, 1);
	}	

}
