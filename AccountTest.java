import java.util.Scanner;
public class AccountTest
{
		public static void main (String[] args)
		{
			
			Account account1 = new Account("Edson", 50.00);
			Account account2 = new Account("Barroso", -7.53);
			
			System.out.printf("%s balance: $%.2f %n",
				account1.getName(), account1.getBalance());
			
			System.out.printf("%s balance: $%.2f %n",
				account2.getName(), account2.getBalance());
			
			Scanner input = new Scanner(System.in);
			
			//	DADOS DE ENTRADA1
			System.out.print("Enter deposit amount for account1: ");
			double depositAmount = input.nextDouble();
			System.out.printf("%nadding %.2f to account1 balance%n%n",
				depositAmount);
			account1.deposit(depositAmount);
			
			//	EXIBE SALDO
			System.out.printf("%s balance: $%.2f %n", 
				account1.getName(), account1.getBalance());
			System.out.printf("%s balance: $%.2f %n", 
				account2.getName(), account2.getBalance());
			
			//	DADOS DE ENTRADA2
			System.out.print("Enter deposit amount for account2: ");
				depositAmount = input.nextDouble();
			System.out.printf("%nadding %.2f to account2 balance%n%n",
				depositAmount);
			account2.deposit(depositAmount);
			
			//	EXIBE SALDO
			System.out.printf("%s balance: $%.2f %n", 
				account1.getName(), account1.getBalance());
			System.out.printf("%s balance: $%.2f %n", 
				account2.getName(), account2.getBalance());
		}
}