package de.scriptsdk.web;

import de.scriptsdk.web.model.MockClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public abstract class AbstractTest {

    final MockClient client;

    public AbstractTest(WebApplicationContext context) {
        this.client = new MockClient(MockMvcBuilders.webAppContextSetup(context).build(), this.getBaseUrl());
    }

    public MockClient getClient() {
        return client;
    }

    protected abstract String getBaseUrl();
/*
    protected <T> T execute(MessageType type, Class<T> clazz) throws Exception {
        MvcResult result = execute(type);

        Assertions.assertEquals(200, result.getResponse().getStatus());

        return mapResult(result, clazz);
    }



/*
    protected String mapToJson(Object obj) throws JsonProcessingException {
        return mapper.writeValueAsString(obj);
    }

    protected <T> T mapFromJson(String json, Class<T> clazz)
            throws IOException {
        return mapper.readValue(json, clazz);
    }

    protected MvcResult execute(MessageType type) throws Exception {
        MockHttpServletRequestBuilder builder = null;

        String fullUrl = getBaseUrl();

        switch (type) {
            case GET -> builder = MockMvcRequestBuilders.get(fullUrl).accept(MediaType.APPLICATION_JSON);
            case PUT -> builder = MockMvcRequestBuilders.put(fullUrl).accept(MediaType.APPLICATION_JSON);
            case DELETE -> builder = MockMvcRequestBuilders.delete(fullUrl).accept(MediaType.APPLICATION_JSON);
            case POST -> builder = MockMvcRequestBuilders.post(fullUrl).accept(MediaType.APPLICATION_JSON);
        }

        return getMvc().perform(builder).andReturn();
    }

    protected MvcResult execute(MessageType type, String url, String path) throws Exception {
        MockHttpServletRequestBuilder builder = null;

        String fullUrl = String.format(String.format("%s/%s", url, path));

        switch (type) {
            case GET -> builder = MockMvcRequestBuilders.get(fullUrl).accept(MediaType.APPLICATION_JSON);
            case PUT -> builder = MockMvcRequestBuilders.put(fullUrl).accept(MediaType.APPLICATION_JSON);
            case DELETE -> builder = MockMvcRequestBuilders.delete(fullUrl).accept(MediaType.APPLICATION_JSON);
            case POST -> builder = MockMvcRequestBuilders.post(fullUrl).accept(MediaType.APPLICATION_JSON);
        }

        return getMvc().perform(builder).andReturn();
    }

    protected MvcResult execute(MessageType type, String path) throws Exception {
        return execute(type, getBaseUrl(), path);
    }

    protected <T> MvcResult execute(MessageType type, String url, String path, T param) throws Exception {
        MockHttpServletRequestBuilder builder = null;

        String fullUrl = String.format(String.format("%s/%s", url, path));

        switch (type) {
            case GET -> builder = MockMvcRequestBuilders.get(fullUrl).
                    contentType(MediaType.APPLICATION_JSON).content(mapToJson(param)).
                    accept(MediaType.APPLICATION_JSON);
            case PUT -> builder = MockMvcRequestBuilders.put(fullUrl).
                    contentType(MediaType.APPLICATION_JSON).content(mapToJson(param)).
                    accept(MediaType.APPLICATION_JSON);
            case DELETE -> builder = MockMvcRequestBuilders.delete(fullUrl).
                    contentType(MediaType.APPLICATION_JSON).content(mapToJson(param)).
                    accept(MediaType.APPLICATION_JSON);
            case POST -> builder = MockMvcRequestBuilders.post(fullUrl).
                    contentType(MediaType.APPLICATION_JSON).content(mapToJson(param)).
                    accept(MediaType.APPLICATION_JSON);
        }

        return getMvc().perform(builder).andReturn();
    }

    protected <T> MvcResult execute(MessageType type, String path, T param) throws Exception {
        return execute(type, getBaseUrl(), path, param);
    }

    protected MvcResult execute(MessageType type, String url, String path, UUID id) throws Exception {
        MockHttpServletRequestBuilder builder = null;

        String fullUrl = String.format(String.format("%s/%s", url, path));

        switch (type) {
            case GET -> builder = MockMvcRequestBuilders.get(fullUrl, id.toString()).accept(MediaType.APPLICATION_JSON);
            case PUT -> builder = MockMvcRequestBuilders.put(fullUrl, id.toString()).accept(MediaType.APPLICATION_JSON);
            case DELETE ->
                    builder = MockMvcRequestBuilders.delete(fullUrl, id.toString()).accept(MediaType.APPLICATION_JSON);
            case POST ->
                    builder = MockMvcRequestBuilders.post(fullUrl, id.toString()).accept(MediaType.APPLICATION_JSON);
        }

        return getMvc().perform(builder).andReturn();
    }

    protected <T> MvcResult execute(MessageType type, String path, UUID id, T param) throws Exception {
        return execute(type, getBaseUrl(), path, id, param);
    }

    protected <T> MvcResult execute(MessageType type, String url, String path, UUID id, T param) throws Exception {
        MockHttpServletRequestBuilder builder = null;

        String fullUrl = String.format(String.format("%s/%s", url, path));

        switch (type) {

            case GET -> builder = MockMvcRequestBuilders.get(fullUrl, id.toString()).
                    contentType(MediaType.APPLICATION_JSON).content(mapToJson(param)).
                    accept(MediaType.APPLICATION_JSON);
            case PUT -> builder = MockMvcRequestBuilders.put(fullUrl, id.toString()).
                    contentType(MediaType.APPLICATION_JSON).content(mapToJson(param)).
                    accept(MediaType.APPLICATION_JSON);
            case DELETE -> builder = MockMvcRequestBuilders.delete(fullUrl, id.toString()).
                    contentType(MediaType.APPLICATION_JSON).content(mapToJson(param)).
                    accept(MediaType.APPLICATION_JSON);
            case POST -> builder = MockMvcRequestBuilders.post(fullUrl, id.toString()).
                    contentType(MediaType.APPLICATION_JSON).content(mapToJson(param)).
                    accept(MediaType.APPLICATION_JSON);
        }

        return getMvc().perform(builder).andReturn();
    }

    protected MvcResult execute(MessageType type, String path, UUID id) throws Exception {
        return execute(type, getBaseUrl(), path, id);
    }

    protected abstract String getBaseUrl();

    protected <T> void printResult(MvcResult result) {
        if (result.getResponse().getStatus() == 200) {
            try {
                String text = String.format("Result : %s", result.getResponse().getContentAsString());
                System.out.println(text);
            } catch (IOException e) {
                Assertions.fail("Response expected but nothing received!");
                throw new RuntimeException(e);
            }
        }
    }

    protected <T, R> MvcResult execute(MessageType type, String path, UUID id, Class<R> clazz, T param) throws Exception {
        return execute(type, getBaseUrl(), path, id, clazz, param);
    }

    protected <T> T mapResult(MvcResult result, Class<T> clazz) {
        try {
            return mapFromJson(result.getResponse().getContentAsString(), clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    */
}