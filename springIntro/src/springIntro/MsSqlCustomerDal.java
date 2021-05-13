package springIntro;

public class MsSqlCustomerDal implements CustomerDalService{
	// applicationContext.xml içinde bu String değerini implement edilen sınıfa göre değiştirildi!  
	String connectionString;
	
	@Override
	public void add() {
		System.out.println("Connection String: "+ this.connectionString);
		System.out.println("MSSQL Veritabanına Eklendi!");
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
}
