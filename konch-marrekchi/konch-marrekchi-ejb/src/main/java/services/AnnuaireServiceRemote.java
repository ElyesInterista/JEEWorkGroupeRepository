package services;

import javax.ejb.Remote;

@Remote
public interface AnnuaireServiceRemote {
	
	public Boolean addContact(String name,Integer Num);
	public Integer FindNum(String name);
}
