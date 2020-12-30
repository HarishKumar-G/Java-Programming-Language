
class Foo1{
	public static String geekName = "";
	public static void geek(String name){
		geekName =  name;
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo1.geek("Geeks");
		System.out.println(Foo1.geekName);
		
		Foo1 obj = new Foo1();
		obj.geek("ForGeeks");
		System.out.println(obj.geekName);
	}

}
