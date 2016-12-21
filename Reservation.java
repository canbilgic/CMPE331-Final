//Reservation.java for get and set method

public class Reservation {
	
	private static int i=0;
	private static int[] rsrv_no = new int[10];
	private static String[] seat_no = new String[10]
	, place =  new String[10]
	, destination = new String[10]
	, day = new String[10]
	, date = new String[10]
	, card_no = new String[10];
		
	public Reservation(){
		
	}
	
	public static int getindex(){
		return i;
	}
	
	public static void setindex(){
		i=i++;
	}	
	
	public static int[] getRsrvNo() {
		return rsrv_no;
	}
	
	public static void setRsrvNo(int rsrvNo) {
		rsrv_no[rsrvNo] = rsrvNo;
	}
	public static String[] getCardNo() {
		return card_no;
	}
	public static void setCardNo(String cardNo) {
		card_no[i] = cardNo;
	}
	public static String[] getSeatNo() {
		return seat_no;
	}
	public static void setSeatNo(String seatNo) {
		seat_no[i] = seatNo;
	}
	public static String[] getPlace() {
		return place;
	}
	public static void setPlace(String place) {
		Reservation.place[i] = place;
	}
	public static String[] getDestination() {
		return destination;
	}
	public static void setDestination(String destination) {
		Reservation.destination[i] = destination;
	}
	public static String[] getDay() {
		return day;
	}
	public static void setDay(String day) {
		Reservation.day[i] = day;
	}
	public static String getDate(int i) {
		return date[i];
	}
	public static void setDate(String date) {
		Reservation.date[i] = date;
	}
		
}
