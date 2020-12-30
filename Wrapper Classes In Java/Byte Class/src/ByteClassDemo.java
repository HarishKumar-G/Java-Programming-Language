/*
 * Java program to illustrate various methods of Byte Class
 */

public class ByteClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 55;
		String bb = "45";
		
		// Construct two byte objects
		Byte x = new Byte(b);
		Byte y = new Byte(bb);
		
		// toString()
		System.out.println("toString(b) = " + Byte.toString(b));
		
		// valueOf() return Byte object
		Byte z = Byte.valueOf(b);
		System.out.println("valueOf(b) = " + z);
		
		z = Byte.valueOf(bb);
		System.out.println("ValueOf(bb) = " + z);
		z = Byte.valueOf(bb, 6);
		System.out.println("ValueOF(bb, 6) = " + z);
		
		
		// parseByte()
		// return primitive byte value
		byte zz = Byte.parseByte(bb);
		System.out.println("parseByte(bb) = " + zz);
		zz = Byte.parseByte(bb, 6);
		System.out.println("parseyByte(bb, 6) = " + zz);
		
		// decode()
		String decimal = "45";
		String octal = "005";
		String hex = "0x0f";
		
		Byte dec = Byte.decode(decimal);
		System.out.println("decode(45) = " + dec);
		dec = Byte.decode(octal);
		System.out.println("decode(005) = " + dec);
		dec = Byte.decode(hex);
		System.out.println("decode(0x0f) = " + dec);
		
		System.out.println("byteValueOf(x) = " + x.byteValue());
		System.out.println("shortValueOf(x) = " + x.shortValue());
		System.out.println("intValueOf(x) = " + x.intValue());
		System.out.println("longValueOf(x) = " + x.longValue());
		System.out.println("doubleValueOf(x) = " + x.doubleValue());
		System.out.println("floatvalue(x) = " + x.floatValue());
		
		int hash = x.hashCode();
		System.out.println("hashCode(x) = " + hash);
		
		boolean eq = x.equals(y);
		System.out.println("x.equals(y) = " + eq);
		
		int e = Byte.compare(x, y);
		System.out.println("compare(x, y) = " + e);
		
		int f = x.compareTo(y);
		System.out.println("x.compareTo(y) = " + f);
	}
}
