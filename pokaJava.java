//Pokabrows
import java.util.Scanner;
public class pokaJava
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);

System.out.println("Enter X");
int x = keyboard.nextInt();

System.out.println("Enter Y");
int y = keyboard.nextInt();

double ans = 0;

while (x<=y)
{
	ans = 1/(Math.sqrt(x));
	x=x+1;
}
System.out.println(ans);
}
}
