/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.5.0-SNAPSHOT
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.model.AuthenticationRequest;
import io.flexify.apiclient.model.AuthenticationResponse;
import io.flexify.apiclient.model.PublicAuthenticationConfiguration;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationControllerApi
 */
@Ignore
public class AuthenticationControllerApiTest {

    private final AuthenticationControllerApi api = new AuthenticationControllerApi();

    
    /**
     * Generate new access token for the user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authenticateTest() throws ApiException {
        AuthenticationRequest authenticationRequest = null;
        AuthenticationResponse response = api.authenticate(authenticationRequest);

        // TODO: test validations
    }
    
    /**
     * Logout
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigTest() throws ApiException {
        PublicAuthenticationConfiguration response = api.getConfig();

        // TODO: test validations
    }
    
    /**
     * Logout
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logoutTest() throws ApiException {
        Object response = api.logout();

        // TODO: test validations
    }
    
}
