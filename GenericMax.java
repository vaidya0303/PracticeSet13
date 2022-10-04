import java.util.Scanner;
public class GenericMax {

		public static <T extends Comparable<T>>T maximum(T x ,T y,T z){
			T max = x;
			if( y.compareTo(max) > 0)
				max = y;
			if(z.compareTo(max) > 0)
				max = z;
			return max;
		}
			public static <T> void main(String[] args) {
				GenericMax a = new GenericMax ();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter 3 Number to compare");
				int x =  sc.nextInt();
				int y =  sc.nextInt();
				int z =  sc.nextInt();
				
				System.out.println("Enter 3 floats to compare");
				float f1 =  sc.nextFloat();
				float f2 =  sc.nextFloat();
				float f3 =  sc.nextFloat();
				
				System.out.println("Enter 3 strings to compare");
				String s1 =  sc.next();
				String s2 =  sc.next();
				String s3 =  sc.next();
				
				System.out.printf("Maximum of %d, %d and %d is %d\n\n", x, y, z, maximum(x, y, z));
			    System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", f1, f2, f3, maximum(f1, f2, f3));
			    System.out.printf("Maximum of %s, %s and %s is %s\n", s1, s2, s3, maximum(s1, s2, s3));
				
			}
		}