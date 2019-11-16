package facades;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//Uncomment the line below, to temporarily disable this test
@Disabled
public class StarWarsFacadeTest {

    private static StarWarsFacade facade;

    public StarWarsFacadeTest() {
    }

    @BeforeAll
    public static void setUpClassV2() {
        facade = StarWarsFacade.getFacade();
    }

    @Test
    public void fetchPerson() throws IOException, InterruptedException, ExecutionException {
        assertEquals("19BBY", facade.fetchPerson(1).getBirth_year());
    }

}
