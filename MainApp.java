// singleton class mysql
package nov23;
class DatabaseConnection{
	private static DatabaseConnection databaseConnection;
	private DatabaseConnection(){}

	public static DatabaseConnection getObject() {
	if (databaseConnection == null)
	databaseConnection = new DatabaseConnection();
	return databaseConnection;

	}


	public void displayData() {
	System.out.println("Display data");
	}
	public void insertData() {
	System.out.println("Insert data");
	}
	}
	public class MainApp{
	public static void main(String args[]){
	// DatabaseConnection databaseConnection = new DatabaseConnection(); //error
	DatabaseConnection databaseConnection = DatabaseConnection.getObject();
	databaseConnection.displayData();
	databaseConnection.insertData();
	System.out.println(databaseConnection);
	DatabaseConnection databaseConnection1 = DatabaseConnection.getObject();
	System.out.println(databaseConnection1);

	}



	}
