package de.scriptsdk.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.scriptsdk.core.model.mapper.BaseJsonMapper;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;

@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public abstract class AbstractTest {

    @Autowired
    WebApplicationContext webApplicationContext;
    private MockMvc mvc;
    private BaseJsonMapper mapper;

    public MockMvc getMvc() {
        return mvc;
    }

    public BaseJsonMapper getMapper() {
        return mapper;
    }

    @BeforeEach
    void onBeforeTest() {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        mapper = new BaseJsonMapper();
    }

    protected String mapToJson(Object obj) throws JsonProcessingException {
        return mapper.writeValueAsString(obj);
    }

    protected <T> T mapFromJson(String json, Class<T> clazz)
            throws IOException {
        return mapper.readValue(json, clazz);
    }
}