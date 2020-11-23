package godai77.k2020.scatter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ScatterControllerTests.class)
public class ScatterControllerTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ScatterService scatterService;

    @Test
    void scatterTest() {
        // given

    }
}
