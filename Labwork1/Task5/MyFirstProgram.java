import myfirstpackage.*;

class MyFirstClass {
	public static void main(String[] s) {
		MyFirstPackage o = new MyFirstPackage();
        int i, j;
        for (i = 1; i <= 8; i++)
        {
            for (j = 1; j <= 8; j++)
            {
                o.set_a(i);
                o.set_b(j);
                System.out.print(o.multiplicate());
                System.out.print(" ");
            }
            System.out.println();
        }
	}
}