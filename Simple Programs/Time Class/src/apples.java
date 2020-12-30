
public class apples {

	public static void main(String[] args) {
		tuna tunaObject = new tuna();
		System.out.println(tunaObject.toMilitary());
		System.out.println(tunaObject.toNormal());
		
		tunaObject.setTime(13, 27, 6);
		System.out.println(tunaObject.toMilitary());
		System.out.println(tunaObject.toNormal());
	}
}