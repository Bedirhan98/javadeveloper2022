package dataAccess;

import entites.BaseEntites;

public class HibernateDao implements BaseDao {

	@Override
	public void add(BaseEntites entites) {
		System.out.println("Hibernate ile veritabanina eklendi : " + entites.getName());

	}

}
