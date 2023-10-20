
public class FizzBuzz
{
    public static void main(String[] args) 
    {
        int count = 1;
        while (count < 101) 
        {
            if (count/15 * 15 == count)
            {
                System.out.println("FizzBuzz");
            } 
            else if (count/5 * 5 == count)
            {
                System.out.println("Buzz");
            }
            else if (count/3 * 3 == count)
            {
                System.out.println("Fizz");
            }
            else 
            {
                System.out.println(count);
            }
            count = count + 1;
        }  
    }
}

