package de.scriptsdk.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.scriptsdk.core.model.mapper.BaseJsonMapper;
import de.scriptsdk.web.enums.MessageType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.UUID;

@Slf4j
public class MockClient {
    final String url;
    final BaseJsonMapper mapper;
    final MockMvc mock;

    public MockClient(MockMvc mock, String url) {
        this.url = url.startsWith("/") ? url : String.format("/%s", url);
        mapper = new BaseJsonMapper();
        this.mock = mock;
    }

    public MvcResult delete(String path, UUID id) {
        try {
            MvcResult result = this.mock.perform(Objects.requireNonNull(generate(MessageType.DELETE, path, id))).andReturn();

            Assertions.assertEquals(200, result.getResponse().getStatus());
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void addNewMockLine() {
        System.out.println(" ");
        System.out.println("________________________________________________________________________________________");
    }

    private MockHttpServletRequestBuilder generate(MessageType type) {
        addNewMockLine();

        switch (type) {
            case GET -> {
                return MockMvcRequestBuilders.get(url).accept(MediaType.APPLICATION_JSON);
            }
            case PUT -> {
                return MockMvcRequestBuilders.put(url).accept(MediaType.APPLICATION_JSON);
            }
            case DELETE -> {
                return MockMvcRequestBuilders.delete(url).accept(MediaType.APPLICATION_JSON);
            }
            case POST -> {
                return MockMvcRequestBuilders.post(url).accept(MediaType.APPLICATION_JSON);
            }
        }
        return null;
    }

    private MockHttpServletRequestBuilder generate(MessageType type, String path) {
        addNewMockLine();

        final String apiPath = path.startsWith("/") ? path : String.format("/%s", path);

        final String fullPath = url + apiPath;

        switch (type) {
            case GET -> {
                return MockMvcRequestBuilders.get(fullPath).accept(MediaType.APPLICATION_JSON);
            }
            case PUT -> {
                return MockMvcRequestBuilders.put(fullPath).accept(MediaType.APPLICATION_JSON);
            }
            case DELETE -> {
                return MockMvcRequestBuilders.delete(fullPath).accept(MediaType.APPLICATION_JSON);
            }
            case POST -> {
                return MockMvcRequestBuilders.post(fullPath).accept(MediaType.APPLICATION_JSON);
            }
        }
        return null;
    }

    private MockHttpServletRequestBuilder generate(MessageType type, String path, UUID id) {
        addNewMockLine();

        final String apiPath = path.startsWith("/") ? path : String.format("/%s", path);
        final String fullPath = url + apiPath;
        switch (type) {
            case GET -> {
                return MockMvcRequestBuilders.get(fullPath, id.toString()).accept(MediaType.APPLICATION_JSON);
            }
            case PUT -> {
                return MockMvcRequestBuilders.put(fullPath, id.toString()).accept(MediaType.APPLICATION_JSON);
            }
            case DELETE -> {
                return MockMvcRequestBuilders.delete(fullPath, id.toString()).accept(MediaType.APPLICATION_JSON);
            }
            case POST -> {
                return MockMvcRequestBuilders.post(fullPath, id.toString()).accept(MediaType.APPLICATION_JSON);
            }
        }
        return null;
    }

    private <T> MockHttpServletRequestBuilder addParam(MockHttpServletRequestBuilder builder, T param) {
        try {
            String content = mapper.writeValueAsString(param);
            String contentText = String.format("Request-Body: %s", content);
            System.out.println(contentText);

            return builder.contentType(MediaType.APPLICATION_JSON).content(content);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private <T> T returnValue(MvcResult result, Class<T> clazz) {
        try {
            String content = result.getResponse().getContentAsString();

            String text = String.format("Response-Content: %s", content);
            System.out.println(text);

            if ((clazz.isAssignableFrom(String.class)) && (content.isEmpty())) {
                return clazz.getDeclaredConstructor().newInstance();
            }

            if (clazz.isAssignableFrom(String.class)) {
                return clazz.getDeclaredConstructor(String.class).newInstance(content);
            }

            return mapper.readValue(content, clazz);
        } catch (IOException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private MvcResult perform(MockHttpServletRequestBuilder builder) {
        try {
            MvcResult result = this.mock.perform(Objects.requireNonNull(builder)).andReturn();

            String urlText = String.format("Url: %s", result.getRequest().getRequestURL());
            System.out.println(urlText);

            String text = String.format("Status: %d", result.getResponse().getStatus());

            System.out.println(text);

            Assertions.assertEquals(200, result.getResponse().getStatus());

            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <T, P> T get(String path, UUID id, Class<T> clazz, P param) {
        try {
            MvcResult result = perform(addParam(Objects.requireNonNull(generate(MessageType.GET, path, id)), param));

            return returnValue(result, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <T, P> T post(String path, UUID id, Class<T> clazz, P param) {
        try {
            MvcResult result = perform(addParam(Objects.requireNonNull(generate(MessageType.POST, path, id)), param));

            return returnValue(result, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T post(Class<T> clazz) {
        try {
            MvcResult result = perform(generate(MessageType.POST));

            return returnValue(result, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MvcResult post(String path, UUID id) {
        try {
            return perform(generate(MessageType.POST, path, id));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <T> MvcResult post(String path, UUID id, T param) {
        try {
            return perform(addParam(Objects.requireNonNull(generate(MessageType.POST, path, id)), param));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T get(String path, Class<T> clazz) {
        try {
            MvcResult result = perform(generate(MessageType.GET, path));

            return returnValue(result, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T get(String path, UUID id, Class<T> clazz) {
        try {
            MvcResult result = perform(generate(MessageType.GET, path, id));

            return returnValue(result, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <T> MvcResult delete(String path, UUID id, T param) {

        try {
            MvcResult result = this.mock.perform(addParam(Objects.requireNonNull(generate(MessageType.DELETE,
                    path, id)), param)).andReturn();

            Assertions.assertEquals(200, result.getResponse().getStatus());
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
