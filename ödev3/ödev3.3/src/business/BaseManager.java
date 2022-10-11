package business;

import entites.BaseEntites;

public abstract class BaseManager {
	public abstract void add(BaseEntites entites) throws Exception;
	public abstract void delete(BaseEntites entites) ;

}
