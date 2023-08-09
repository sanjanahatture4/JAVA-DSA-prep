public class Functions {

    //VOID FUNCTION
    static void Add(int c, int d)  //
    //IMP void function does not return any value
    {
        int sum = c + d;
        System.out.println("Addition of two numbers is : " + sum);
    }


    //INT FUNCTION
    static int Sum(int a, int b)
    //IMP other functions must return a value
    {
        int sum = a + b;
        return sum;
    }


    //For no. divisible by 2
    static boolean even(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        Add(8, 9);

        int e = 62;
        int f = 18;
        Add(f, e);
        Add(a, b);

        int ans = Sum(10, 25);
        System.out.println("sum of two numbers is "+ ans);

        int answer = Sum(12,5);
        System.out.println("sum of two numbers is "+ answer);


        //FOR GREET
        String name = "Bro";
        greet(name);
        greet("Geet");//Another option
    }
    static void greet(String name)
    {
        System.out.println("Hello "+ name);

    }
}
