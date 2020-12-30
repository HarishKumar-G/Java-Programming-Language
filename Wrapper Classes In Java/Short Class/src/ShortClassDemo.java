
public class ShortClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 55;
		String bb = "45";
		
		// Construct two byte objects
		Short x = new Short(b);
		Short y = new Short(bb);
		
		// toString()
		System.out.println("toString(b) = " + Byte.toString(b));
		
		// valueOf() return Byte object
		Short z = Short.valueOf(b);
		System.out.println("valueOf(b) = " + z);
		
		z = Short.valueOf(bb);
		System.out.println("ValueOf(bb) = " + z);
		z = Short.valueOf(bb, 6);
		System.out.println("ValueOF(bb, 6) = " + z);
		
		
		// parseByte()
		// return primitive byte value
		short zz = Short.parseShort(bb);
		System.out.println("parseByte(bb) = " + zz);
		zz = Short.parseShort(bb, 6);
		System.out.println("parseyByte(bb, 6) = " + zz);
		
		// decode()
		String decimal = "45";
		String octal = "005";
		String hex = "0x0f";
		
		Short dec = Short.decode(decimal);
		System.out.println("decode(45) = " + dec);
		dec = Short.decode(octal);
		System.out.println("decode(005) = " + dec);
		dec = Short.decode(hex);
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
		
		int e = Short.compare(x, y);
		System.out.println("compare(x, y) = " + e);
		
		int f = x.compareTo(y);
		System.out.println("x.compareTo(y) = " + f);
		
		short to_rev = 45;
		System.out.println("Short.reverseBytes(to_rev) = " + Short.reverseBytes(to_rev));
	}
}
