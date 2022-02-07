package com.functioninterface;
@FunctionalInterface
public interface I {
	public abstract void m1();
	//public abstract void m2(); we cannot write multiple abstract method in functional interface.
	
	// public void m3() {} we not write concrete method in interface.
	
	public static void m3() {
		
		System.out.println("m3 ststic i");
	}
	public static void m4() {
		System.out.println("m4 static i");
		
	}
	public default void m5()
	{
		System.out.println("m5 default i");
	}
	public default void m6()
	{
		System.out.println("m5 default i");
	}
	
	

}
