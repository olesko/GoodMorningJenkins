import org.junit.Assert;
import org.junit.Test;

public class TestGreetings {

    @Test
    public void testAssertions() {
        Assert.assertEquals(Greetings.sayHello("Hello"), "Hello");
    }

}
