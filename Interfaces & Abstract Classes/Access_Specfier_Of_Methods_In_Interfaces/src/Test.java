// Access specifiers apply even if we don't specify

interface Test {
	int x = 10;		// x is public static final and must be initialized
	void foo();		// foo() is public 
}