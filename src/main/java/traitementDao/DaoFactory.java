package traitementDao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoFactory {

	public EntityManagerFactory getConnection() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("connection");
		
		return factory;
		
	}

}
