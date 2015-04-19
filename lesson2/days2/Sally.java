// Calculate the number of days Sally Ride lived.
public class Sally
{
    public static void main(String[] args)
    {
        Day birthDay = new Day(1951, 5, 26); // Sally was born 5/26/1951
        Day lastDay = new Day(2012, 7, 23);  // Sally died 7/23/2012
        // this function calculates the number of days Sally was alive
        System.out.println(lastDay.daysFrom(birthDay)); 
    }
}
