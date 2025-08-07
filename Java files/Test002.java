import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

class TestCase02 {

    @Test
    @Tags({@Tag("firstPriority")})
    void Test002() {
        System.out.println("Running Test002");
    }

    @Test
    @Tag("firstPriority")
    void runTestcase02() {
        System.out.println("Running runTestcase02");
    }

    @Test
    @Tags({@Tag("fastTag")})
    void testMethod03() {
        System.out.println("Running testMethod03");
    }

    @Test
    @Tag("slowTag")
    void runTestcase04() {
        System.out.println("Running runTestcase04");
    }
}
