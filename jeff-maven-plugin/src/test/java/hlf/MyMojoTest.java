package hlf;

import static org.junit.Assert.*;

import java.io.File;
import org.apache.maven.plugin.testing.MojoRule;
import org.apache.maven.plugin.testing.WithoutMojo;
import org.junit.Rule;
import org.junit.Test;

public class MyMojoTest {
  @Rule
  public MojoRule rule =
      new MojoRule() {
        @Override
        protected void before() throws Throwable {}

        @Override
        protected void after() {}
      };

  /** @throws Exception if any */
  @Test
  public void testSomething() throws Exception {
    File pom = new File("target/test-classes/project-to-test/");
    assertNotNull(pom);
    assertTrue(pom.exists());

    MyMojo myMojo = (MyMojo) rule.lookupConfiguredMojo(pom, "validate");
    assertNotNull(myMojo);
    myMojo.execute();
  }

  /** Do not need the MojoRule. */
  @WithoutMojo
  @Test
  public void
      testSomethingWhichDoesNotNeedTheMojoAndProbablyShouldBeExtractedIntoANewClassOfItsOwn() {
    assertTrue(true);
  }
}
