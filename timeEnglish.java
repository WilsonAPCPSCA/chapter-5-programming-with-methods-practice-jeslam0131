import  java.util.Scanner;
public class timeEnglish {

	public static void main(String[] args) {
		Scanner in = new Scanner  (System.in);
		System.out.println("Enter the hour");
		int  hours = in.nextInt();
		System.out.println("Enter the minutes");
		int  minutes = in.nextInt();
		System.out.println(getTimeName(hours,minutes));
		}
public  static String getTimeName(int  hours,int minutes){
	String time = null;
	if (minutes==0)time = (hours + " o'clock");
	else if (minutes/15==1)time = ("quater after "+hours);
	else if (minutes/15==2)time = ("half past "+hours);
	else if (minutes/15==3)time = ("quater until "+(hours+1));
	else time = (minutes +" minutes past "+hours);
	return time;

	

}
}

