public class Account{
	
//	VARIÁVEIS DE INSTÂNCIA
	private String name;
	private double balance;
	
//	CONSTRUCTOR
	public Account(String name, double balance)
	{
		this.name = name;
		
		if (balance > 0.0)
		{
			this.balance = balance;
		}
	}
	
//	DEPOSIT METHOD
	public void deposit (double depositAmount)
	{
		if (depositAmount >0.0)
		{
			balance = balance + depositAmount;
		}
	}
	
//	RETURN THE BALANCE
	public double getBalance()
	{
		return balance;
	}
	
//	SIMULA A VARIÁVEL DE INSTANCIA E JOGA NO PARAMETRO
	public void setName(String name, double balance)
	{	
		this.name = name;
	}
//	ARMAZENA
	public String getName()
	{
		return name;
	}	
}