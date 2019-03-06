package rmi;
import java.rmi.*;
import java.util.List;
/* Bank class uzaktan bankacılık için gereken ara birim  ve sınıfları içerir*/

public abstract  class Bank {
/* bankanı sunucusundan çıkacak metotlar tanımlanır*/
	
	public interface RemoteBank extends Remote{
		//belirtilen kullanıcı ve paralo ile yeni hesap aç
		public void openAccount(String name,String password) throws RemoteException,BankingException;
		 //hesabı kapat
		public FunnyMoney closeAccount(String name,String password) throws RemoteException,BankingException;
	}
	//parayi adi verilen hesaba yatır
	public abstract void deposit(String name,String password,FunnyMoney money)  throws RemoteException,BankingException ;
	//belirtilen hesaptan parayı çek
	public abstract FunnyMoney withdraw(String name ,String password,int amount) throws RemoteException,BankingException ;
	//hesabın bakiyesi
	public abstract int getBalance(String name,String password) throws RemoteException,BankingException;
	//hesab hareketleri listeleyen string bir liste
	public abstract List getTransactionHistory(String name ,String password) throws RemoteException,BankingException ;
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
