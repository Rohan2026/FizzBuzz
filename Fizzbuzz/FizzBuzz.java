
public class FizzBuzz
{
    public static void main(String[] args) 
    {
        int count = 1;
        while (count < 101) 
        {
            if (count == 0 && count%3 == 0) 
            {
                System.out.println("FizzBuzz");
            } 
            else System.out.println(count);
            count = count + 1;
        }  
    }
}

