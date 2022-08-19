package Exercises_01;

public class Exercise_11 {
	public static void main(String[] args) {
		int year=1;
		int population=312032486;
		while(year<=5) {
			double birth=((365 * 24 * 60 * 60 ) / 7.0);
			double death=((365 * 24 * 60 * 60 ) / 13.0);
			double immigrant=((365 * 24 * 60 * 60 / 45.0));
			population += birth + immigrant - death ;
			System.out.println( year + " Year population is " + population);
			year++;
			}
	}

}
