package rmi;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import rmi.Bank.*;

//RemoteBank sunucu ile etkileşen sınıf,farklı sunucu metotlarını çağırır
public abstract  class Client extends Bank {

	public static void main(String[] args) {
		try {
			//sitem özelliğini kullanarak hangi remoteBank nesnesine bağlanacağını saplamaya çalış eğer sistem özelliği tanımlanmamışsa
			//varsayılan url'i kullan
			//yerel makinedeki sunucuya bağlanmaya çalişir
			String url = System.getProperty("bank","rmi://firstRemote ");
			//rmiregistery sunucudan nesnesi ile metot çagırımı yapacak
			RemoteBank bank = (RemoteBank) Naming.lookup(url);
			//kullanıcın komutu kucuk harfe cavir
			String cmd = args[0].toLowerCase();
			//komutun verilen secenekle arasında olup olamadıgına bak
			if(cmd.equals("open")) { //hesap aç
				bank.openAccount(args[1], args[2]);
				System.out.println("account opened succesful");
			}
			else if(cmd.equals("close")) { //hesabı kapat
				FunnyMoney money = bank.closeAccount(args[1],  args[2]);
				System.out.println(money.amount+"wooden tl return you ");
			    System.out.println("thanks for banking with us");
			}
			else if(cmd.equals("deposit")) {//para yatır
			    FunnyMoney money = new FunnyMoney(Integer.parseInt(args[3]));
			    ((Bank) bank).deposit(args[1],args[2],money);
			    System.out.println("deposited"+money.amount+" tl ");
			}
			    else if(cmd.equals("withdraw")) {
			    	FunnyMoney money =  ((Bank) bank).withdraw(args[1],args[2],Integer.parseInt(args[3]));
			    	System.out.println("witddraw"+money.amount+ " tl");	    	
			    }
			    else if(cmd.equals("balance")){ //bakiye kontrol et
			    	int amt = ((Bank) bank).getBalance(args[1],args[2]);
			    	System.out.println("you have "+ amt + " tl in bank");
			    }
			    	else if (cmd.equals("history")) {//işlem kayıtları
			    		List transaction = ((Bank) bank).getTransactionHistory(args[1],args[2]);
			    		for(int i =0;i<transaction.size();i++)
			    			System.out.println(transaction.get(i));
			    	}
			    	else  System.out.println("unknow command");
			    		
			    	}
		//RMİ istisnaları yakalama
		catch(RemoteException e)
		{
			System.err.println(e);
	 }
		//BAnking istisnaları
		catch(BankingException e)
		{			
			System.out.println(e); 
		}		
			//diğer istisnalar kullanıcı kaynaklılar icin
		catch (Exception e) {
	//System.err.println("Usage: java [-Dbank=<url>] Bank$Client" +"<cmd> <name> <password> [<amount>]");
	//	System.err.println("where cmd is:open, close, deposit" + "withdraw,balace,history");
			System.out.println(e);
		}
	
		
		}
		}	

		

	


