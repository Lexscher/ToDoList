public class TaskTests {
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public static void setUp() throws Exception {
    Task healthTask = new Task("eat ten pounds of kale");
  }

  @After
  public static void tearDown() throws Exception {

  }

  @Test
  public void taskShouldBeCreated() {
    // A created tasks should have content, and completed should be set to false
    // upon initialization
    assertThat(healthTask, any(Task));

  }

  @Test
  public void taskShouldHaveContent() {
    // A newly created task should have content, and the content should be a string
    assertThat(healthTask.getContent(), instanceOf(String));
  }

  @Test
  public void taskCanBeCompleted() {

  }

}