package test;

public class Mydate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	public Mydate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(day > 31 || day < 0) {
					isValid = false;
				}
				break;
			case 4: case 6: case 9: case 11:
				if(day > 30 || day < 0) {
					isValid = false;
				}
				break;
			case 2:
				if(day > 28 || day < 0) {
					isValid = false;
				}
				break;
				default : isValid =false;
		}
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
		if(month > 12 || month <1) {
			isValid = false;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		if(year < 1) {
			isValid = false;
		}
	}
	
	public void isValid() {
		if(isValid) {
			System.out.println("유효한 날짜입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
	
}