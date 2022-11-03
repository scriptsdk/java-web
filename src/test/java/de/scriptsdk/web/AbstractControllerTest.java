package de.scriptsdk.web;

import de.scriptsdk.web.dto.client.ClientInfoDto;
import de.scriptsdk.web.model.MockClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Objects;

public abstract class AbstractControllerTest extends AbstractTest {
    static MockClient clientInitializer;
    static MockClient stealthInitializer;
    static ClientInfoDto clientInfo;
    Boolean deleteReferences = false;

    @Autowired
    protected AbstractControllerTest(WebApplicationContext context) {
        super(context);

        clientInitializer = new MockClient(MockMvcBuilders.webAppContextSetup(context).build(), "/v1/client");
        stealthInitializer = new MockClient(MockMvcBuilders.webAppContextSetup(context).build(), "/v1/{id}/stealth");
    }

    @AfterAll
    static void finalizeSetupFinally() {
        if (clientInfo != null) {
            Boolean isConnected = stealthInitializer.get("is-connected", clientInfo.getId(), Boolean.class);

            if (isConnected) {
                stealthInitializer.post("disconnect", clientInfo.getId());
                do {
                    isConnected = stealthInitializer.get("is-connected", clientInfo.getId(), Boolean.class);
                    stealthInitializer.post("wait-for-client", clientInfo.getId(), 25);
                } while (isConnected);
            }
            stealthInitializer.post("wait-for-client", clientInfo.getId(), 100);

            clientInitializer.delete("{id}", clientInfo.getId());

            clientInfo = null;
        }
    }

    public void setDeleteReferences(Boolean deleteReferences) {
        this.deleteReferences = deleteReferences;
    }

    public ClientInfoDto getInfo() {
        return clientInfo;
    }

    @AfterEach
    void finalizeSetup() {
        if (Objects.equals(deleteReferences, true)) {

            clientInitializer.delete("{id}", clientInfo.getId());
            clientInfo = null;

            deleteReferences = false;
        }
    }

    @BeforeEach
    void prepareSetup() {

        if (clientInfo == null) {
            clientInfo = clientInitializer.post(ClientInfoDto.class);

            Assertions.assertNotNull(clientInfo.getId());
        }

        Boolean isConnected = stealthInitializer.get("is-connected", clientInfo.getId(), Boolean.class);

        if (!isConnected) {
            stealthInitializer.post("connect", clientInfo.getId());
            do {
                stealthInitializer.post("wait-for-client", clientInfo.getId(), 25);

                isConnected = stealthInitializer.get("is-connected", clientInfo.getId(), Boolean.class);
            } while (!isConnected);
        }
    }
}
