public class TypeCastingDemo
{
	public static void main(String[]args)
	{
		int i1=10;
		byte b1=(byte)i1;
		short s1=(short)i1;
		long l1=i1;
		float f1=i1;
		double d1=i1;
		
		long l2=10L;
		byte b2=(byte)l2;
		short s2=(short)l2;
		int i2=(int)l2;
		float f2=(float)l2;
		double d2=l2;
		
		float f3=10.24F;
		byte b3=(byte)f3;
		short s3=(short)f3;
		int i3=(int)f3;
		long l3=(long)f3;
		double d3=f3;
		
		double d4=10.24;
		byte b4=(byte)d4;
		short s4=(short)d4;
		int i4=(int)d4;
		long l4=(long)d4;
		float f4=(float)d4;    
	}
}