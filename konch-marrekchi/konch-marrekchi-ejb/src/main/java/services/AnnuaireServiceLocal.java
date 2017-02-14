package services;

import javax.ejb.Local;

@Local
public interface AnnuaireServiceLocal {
	
	public Boolean addContact(String name,Integer Num);
	public Integer FindNum(String name);

}
