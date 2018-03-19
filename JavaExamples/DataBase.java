JDBC + Spring
@Repository
@Transactional(readOnly = true)
public class JpaPojoRepositoryImpl implements Repository {

/*  @Autowired
    private SessionFactory sessionFactory;
    private Session openSession() {
        return sessionFactory.getCurrentSession();
    }*/
    @PersistenceContext
    private EntityManager em;
    @Override
    public List<Pojo> getAll() {
        return em.createNamedQuery(Pojo.ALL_SORTED, User.class).getResultList();
    }

------------------------------------------------------------------------------------|
JDBC + Spring
@Repository
public class JdbcPojoRepositoryImpl implements Repository {

psf RowMapper<Pojo> ROW_MAPPER = BeanPropertyRowMapper.newInstance(Pojo.class);
pf  JdbcTemplate
pf  NamedParameterJdbcTemplate
pf  SimpleJdbcInsert insertPojo;
    @Autowired
    public constructor(DataSource, JdbcTemplate, NamedParameterJdbcTemplate) {
        this.insertMeal = new SimpleJdbcInsert(dataSource)
                .withTableName("meals")
                .usingGeneratedKeyColumns("id");
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
    @Override
    public List<Pojo> getAll(someParameter) {
        return jdbcTemplate.query(
                "SELECT * FROM pojos WHERE someParameter=?", ROW_MAPPER, someParameter);
    }
------------------------------------------------------------------------------------|
JDBC

public class JDBC {

    public static void main(String[] args) throws SQLException {
//эта строка загружает драйвер DB. раскомментируйте если прописываете драйвер вручную
        //Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        List<Pojo> objects = new ArrayList<>();
        try {
//Получаем Connection (лучше в трайкеч с ресурсами)
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_name","user", "password");
            if (connection == null) {
                System.out.println("Нет соединения с БД!");
                System.exit(0);
            }
//Создаем Statement, PreparedStatement для executeBatch() или CallableStatement;
            Statement stmt = connection.createStatement();
//Из запроса получаем ResultSet
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
//Используем данные из ResultSet
            while (rs.next()) {
                //users.add(/*логика маппинга ResultSet в юзеров*/);
            }
//При закрытии Statement автоматически закрываются все связанные с ним открытые ResultSet
            stmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally{
            if (connection != null){
                connection.close();
            }
        }
    }
}
/**---------------------------------------------------------------------------------|	
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
-----------------------------------------------------------------------------------*/
