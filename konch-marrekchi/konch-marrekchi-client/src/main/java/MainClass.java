import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.AnnuaireServiceRemote;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Context context = new InitialContext();

			String jndiName = "konch-marrekchi-ear/konch-marrekchi-ejb/AnnuaireService!services.AnnuaireServiceRemote";
			
			AnnuaireServiceRemote proxyAnnu= ((AnnuaireServiceRemote) context.lookup(jndiName));
			proxyAnnu.addContact("sami", 29377762);
			proxyAnnu.addContact("salma", 99266005);
			System.out.println(proxyAnnu.FindNum("sami"));
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	}


