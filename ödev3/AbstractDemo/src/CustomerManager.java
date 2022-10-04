import java.sql.DatabaseMetaData;

public class CustomerManager {
	BaseDataBaseManager databaseManagers;
	
	public void getCustomer(BaseDataBaseManager databaseManager) {
		this.databaseManagers=databaseManager;
		databaseManagers.getData();
		
		
	}

}
