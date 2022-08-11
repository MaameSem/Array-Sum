public class Arraysum
{
public static void main (String[]args)
{
double prices[] = { 100,  40, 76, 25 };

double total= 0;

for (int i=0; i < prices.length; i++)
{
total += prices[i];
}

System.out.println("The total of the array is " + total);

}
}
//The output is 241//
