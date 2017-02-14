package services;

import java.util.HashMap;

import javax.ejb.Stateful;


@Stateful
public class AnnuaireService implements AnnuaireServiceRemote, AnnuaireServiceLocal {

	 HashMap<String,Integer> MyContact= new HashMap<>();
	@Override
	public Boolean addContact(String name, Integer Num) {
		MyContact.put(name, Num);
		return null;
	}

	@Override
	public Integer FindNum(String name) {
		// TODO Auto-generated method stub
		return MyContact.get(name);
	}

    
}
