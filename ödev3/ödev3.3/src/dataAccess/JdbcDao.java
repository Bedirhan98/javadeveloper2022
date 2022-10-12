package dataAccess;

import entites.BaseEntites;

public class JdbcDao implements BaseDao {

	@Override
	public void add(BaseEntites entites) {
		System.out.println("Jdbc ile veritabanina eklendi : "+entites);
		

	}

}
