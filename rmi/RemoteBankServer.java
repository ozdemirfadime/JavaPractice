package rmi;
import java.rmi.*;
import java.util.*;
import java.rmi.server.*;
import rmi.Bank.*;

//bu sınıf uzak metotları uygulamak.enn önemli eksiklik sunucu kapatıldığında veya  çökötüğünde
//hesap bilgilerini  yok olacaktır 
public class RemoteBankServer  extends UnicastRemoteObject implements RemoteBank{

	//bankadaki hesap bilgilerini tutar
	class Account{
		String password;
		int balance;
		List transactions = new ArrayList<>();
		 Account(String password) {
			 this.password = password;
			 transactions.add("Account opened at "+ new Date());
				}
	}
	//hash tablasu açık tüm hesapları kaydeder ve hesap adlarını account nesnelriyle  eşleştirir
	Map accounts = new HashMap();
	//yapılandırıcı  hicbir sey yapamaz  üst sinıfa istisna tanımlanırsa 
	public RemoteBankServer()  throws RemoteException { super();}
	
	//verilen isim ve parolayla bir banka hesbi aç
	//güvenliği sağlamak için senkronize edilir ; bu metod hesap hash mapde tutlacağından ğereklidir
	public synchronized void openAccount(String name,String password) throws RemoteException,BankingException{
		//ayni ismde  başka hesap olmadığı kontrol et
		if(accounts.get(name) != null)	throw new BankingException("account is already exists");
			Account acc = new Account(password)	;
		   accounts.put(name, acc); //kaydet
	}
		   // isim ve paralay auygun hesap varsa account nesnesi donduru yoksa istinaya atar
		   Account verify(String name,String password) throws BankingException{
			   synchronized (accounts) {
				   Account acct = (Account) accounts.get(name);
				    if (acct ==null) throw new BankingException("no such account");
				    if(!password.equals(acct.password)) throw  new BankingException("invalid paddword");
				    return acct;
				    
			}
		   }
	//hesabi kapat  güvenlik için sonkronize edilir,hash tablosunda yapıldugunda gerekli
		   public synchronized FunnyMoney closeAccount(String name,String password) throws RemoteException,BankingException{
			   Account acct;
			   acct = verify(name,password);
			   accounts.remove(name);
			   //hesab ile ilgili değişikliler gerçekleşirken   ilk güvenlik için kilitlemeliyiz
			   synchronized(acct) {
				   int balance =acct.balance;
				   acct.balance =0;
				   return new FunnyMoney(balance);
			   }
		   }
		   
		   // Funnymoneyei verilen hesaba yatrı
		   public void deposit(String name, String password,FunnyMoney money) throws RemoteException,BankingException
		   {
			   Account acct = verify(name,password);
			   synchronized(acct)
			   {		
				   acct.balance += money.amount;
			   
				   acct.transactions.add("deposited" + money.amount+"on"+ new Date());
			   }
			   }
		   
	//belirtilen miktarda para cek
		   public FunnyMoney withdraw(String name,String password,int amount) throws RemoteException,BankingException{
			   Account acct = verify(name,password);
			  if(acct.balance<amount)throw new BankingException("insufficient balance");
			  acct.balance -= amount;
			  acct.transactions.add("witdraw"+amount+"on "+ new Date());
			  return new FunnyMoney(amount);
		   }
//mevcut bakiyeyi döndür
		   public int getBalance(String name,String password) throws RemoteException,BankingException{
			   Account acct = verify(name, password);
			   synchronized (acct) {
				   return acct.balance;}
						   }
		  //Hesabin hareketlerini döndüren string vector
		   public List getTransactionHistory(String name,String password) throws RemoteException,BankingException{
			   Account acct = verify(name, password);
			   synchronized (acct) {
				   return acct.transactions;}
		   }
		//RemoteServedan nesne oluşturur ve registry de ad ver.Adı bulmak is sistemi kullan varsayılan 
		//firstRemote'u  kullan 
 
	public static void main(String[] args) {
		try {
			//banka sunucu nesnesi bank
			RemoteBankServer bank = new RemoteBankServer();
			//alacağı adı saptamaya çalış
			String name = System.getProperty("bankname","FirstRemote");
			//Bu adı ver
			Naming.rebind(name, bank);
			//çalışmaya başladığımızı bildir
			System.out.println(name+"is open and ready for customers");
		}
catch (Exception e) {
	System.out.println(e);
	System.exit(1);//RMI kanallarından dolayı durdurmaya zorla
}
	}

	


	}


