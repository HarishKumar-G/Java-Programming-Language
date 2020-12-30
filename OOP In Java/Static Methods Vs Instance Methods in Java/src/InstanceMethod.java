
class Foo{
	String name = "";
	public void geek(String name){
		this.name = name;
	}
}

public class InstanceMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo obj = new Foo();
		obj.geek("GeeksForGeeks");
		System.out.println(obj.name);
	}

}
