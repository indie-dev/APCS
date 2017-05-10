package T2.com.edhesive.assignments;

public class Time {
	private int hour;
	private int minute;
	
	//any constructors will be made below
	
	public Time(){
		hour = 12;
		minute = 0;
	}
	
	//if h is inclusively between 1 & 23, set the hour to h
	//otherwise it is 0
	//set the minutes to m if m is inclusively between 0 & 59
	//otherwise m is 0;
	
	public Time(int h, int m){
		hour = (h>= 1 && h<= 23) ? h : 0;
		minute = (m>= 0 && m <= 59) ? m : 0;
	}
	
	//return the time as a string
	public String toString(){
		return "" + (hour <=9 ? "0" : "") + hour + (minute <= 9 ? "0" : "") + minute;
	}
	
	//convert the time from military to standard
	public String convert(){
		int h = hour; 
		if(h >= 13){
			h -= 12;
		}
		if(h == 0){
			h = 12;
		}
		return h+":" + (minute <= 9 ? "0": "") + minute + (hour <12 ? " am" : " pm");
	}
	
	//advances time by one minute
	public void increment(){
		if(minute == 59){
			minute = 0;
			if(hour != 23){
				++hour;
			}else{
				hour = 0;
			}
		}else{
			++minute;
		}
	}
}
