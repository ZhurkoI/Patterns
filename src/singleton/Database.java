package singleton;

public class Database {
    private static Database database;
    private static String databaseContent = "";

    public Database() {
    }

    public static synchronized Database getDatabaseInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    public void saveToDB(String entry) {
        databaseContent += entry + "\n";
    }

    public String readFromDB() {
        return databaseContent;
    }
}
