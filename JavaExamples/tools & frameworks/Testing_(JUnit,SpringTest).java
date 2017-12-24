//Тестирование:-----------------------------------------------------------------------|
//Спринг. конфигурация контекста для тестов. xml подаются в массиве
@ContextConfiguration({		//избавляемся от @BeforClass
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
//Спринг. восстановление базы данных перед каждым тестом      //Избавляемся от @Before
@Sql(scripts = "classpath:db/populateDB.sql", config = @SqlConfig(encoding = "UTF-8"))
//JUnit. переопределяем запуск через Спринг-Тест
@RunWith(SpringRunner.class)

//Simple ----------------------------------------------------------------|
public class CalcTest {
    private Calc c;
    //@BeforeClass @AfterClass 
    //public static void beforeClass(){}
    @Before
    public void before(){
        c = new Calc();
    }
	//@After
    @Test
    public void add() throws Exception {
        int add = c.add(2, 5);
        if (add != 7) {
            fail("message");
        }
        assertTrue(c.add(2,5)==7);       //
        assertEquals("mes",c.add(2,5),7);//
        //assertFalse(); assertNull(); assertNotNull();
    }
    @Test(expected =  ArithmeticException.class)
    public void divByZeroException() throws Exception {
    c.divide(2,0);
    }
}
//------------------------------------------------------------------------------------|
  <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-test</artifactId>
            <version>${spring.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.assertj</groupId>
            <artifactId>assertj-core</artifactId>
            <version>3.8.0</version>
            <scope>test</scope>
        </dependency>
//------------------------------------------------------------------------------------|