class MySecondClass {
    private int a;
    private int b;

    MySecondClass()
    {
        a = 0; 
        b = 0;
    }

    MySecondClass(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void set_a(int a)
    {
        this.a = a;
    }

    public int get_a()
    {
        return a;
    }

    public void set_b(int b)
    {
        this.b = b;
    }

    public int get_b()
    {
        return b;
    }

    public int multiplicate()
    {
        return a * b;
    }
}

class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass o = new MySecondClass();
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