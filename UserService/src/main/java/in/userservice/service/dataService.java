package in.userservice.service;

import org.springframework.stereotype.Service;

@Service
public class dataService {
	
	public String convertData(String time) {
		
		String nums[] = { "zero", "one", "two", "three", "four",
				"five", "six", "seven", "eight", "nine",
				"ten", "eleven", "twelve", "thirteen",
				"fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen", "twenty", "twenty one",
				"twenty two", "twenty three", "twenty four",
				"twenty five", "twenty six", "twenty seven",
				"twenty eight", "twenty nine","thirty","thirty one",
				"thirty two", "thirty three", "thirty four",
				"thirty five", "thirty six", "thirty seven",
				"thirty eight", "thirty nine","fourty","fourty one",
				"fourty two", "fourty three", "fourty four",
				"fourty five", "fourty six", "fourty seven",
				"fourty eight", "fourty nine","fifty","fifty one",
				"fifty two", "fifty three", "fifty four",
				"fifty five", "fifty six", "fifty seven",
				"fifty eight", "fifty nine"
				};
		int h=Integer.parseInt(time.split(":")[0]);
		int m=Integer.parseInt(time.split(":")[1]);
		String data="";
		if(m==0) {
			data="It's "+nums[h]+" o clock ";
			System.out.println("It's "+nums[h]+" o clock " );
		}
		
		else if(h==12) {
			//data="It's "+nums[h]+" "+nums[m];
			data=data+" It's Midday";
			System.out.println("It's Midday");
		}

		else if(h==00) {
			//data="It's "+nums[h]+" "+nums[m];
			data=data+" It's Midnight";
			System.out.println("It's Midnight");
		}
		else {
			data="It's "+nums[h]+" "+nums[m];
		}
		
		return data;
		
		
		
	}

}
