package myfirstpackage;

public class MyFirstPackage {
    private int a;
    private int b;

    public MyFirstPackage()
    {
        a = 0; 
        b = 0;
    }

    public MyFirstPackage(int a, int b)
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
