
java.sql.DriverManager
java.sql.Driver
java.sql.Connection
java.sql.Statement
java.sql.PreparedStatement
java.sql.CallableStatement
java.sql.ResultSet
------------------------------------------------------------------------------------|
//получить и зарегестрировать драйвер
try {
    Driver driver = new org.postgresql.Driver();
    DriverManager.registerDriver(driver);
    } catch (SQLException e) {
            e.printStackTrace();
}
//запросы (execute) выполняются в блоке try/catch с ресурсами (Connection & Statement)
try (Connection connection = DriverManager.getConnection(URL, USER, PASS);
		Statement statement = connection.createStatement()){

//		statement.execute("INSERT INTO cars(owner, brand, model) VALUES ('Elena','Hynday','Solaris')");
//		statement.execute("INSERT INTO cars(owner, brand, model) VALUES ('Erick','KIA','Rio')");

//		int result = statement.executeUpdate("UPDATE cars SET model='Cruz' WHERE owner='Jhon'");
//		System.out.println(result);
//		Statement statement = connection.createStatement()){
//		statement.addBatch("INSERT INTO cars(owner,brand,model) VALUES ('Halk','Daewoo','Matiz')");
//		statement.addBatch("INSERT INTO cars(owner,brand,model) VALUES ('Halk','Daewoo','Matiz')");
//		statement.addBatch("INSERT INTO cars(owner,brand,model) VALUES ('Batman','BatMobil',NULL )");
//		statement.executeBatch();
            
//		statement.clearBatch();
//		statement.addBatch("DELETE FROM cars WHERE owner = 'Halk'");
//		statement.addBatch("INSERT INTO people (name) VALUES ('Batman')");
//		statement.executeBatch();

//		boolean status = statement.isClosed();
//		System.out.println(status);
//		statement.getConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) throws SQLException {
        /**
         * эта строка загружает драйвер DB.
         * раскомментируйте если прописываете драйвер вручную
         */
        //Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/db_name",
            "user", "password");

            if (conn == null) {
                System.out.println("Нет соединения с БД!");
                System.exit(0);
            }
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
    
            while (rs.next()) {
                System.out.println(rs.getRow() + ". " + rs.getString("firstname")
                        + "\t" + rs.getString("lastname"));
            }
    
            /**
             * stmt.close();
             * При закрытии Statement автоматически закрываются
             * все связанные с ним открытые объекты ResultSet
             */
            stmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally{
            if (conn != null){
                conn.close();
            }
        }
    }
}
------------------------------------------------------------------------------------|	
DataBase 
установить клиент, создать базу и пользователя.
подключить базу к IDE:
	настройки->Database Tools & SQL
	Database->new->Data Source->choice
	General: Database; User; Password; Driver; Test Connection.
	Schemas: table->public
1 добавить dependancy в pom.xml и обновить конфигурацию Maven
		(найти POM нужной версии DB (PostgreSQL JDBC Driver)
                <dependency>
                    <groupId>org.postgresql</groupId>
                    <artifactId>postgresql</artifactId>
                    <version>${postgresql.version}</version>
                </dependency>
				<dependency>
                    <groupId>org.hsqldb</groupId>
                    <artifactId>hsqldb</artifactId>
                    <version>2.3.4</version>
                </dependency>

------------------------------------------------------------------------------------|
