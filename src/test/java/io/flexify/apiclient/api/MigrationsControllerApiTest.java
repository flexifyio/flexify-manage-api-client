/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.4.1
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.model.AddMigrationRequest;
import io.flexify.apiclient.model.Migration;
import io.flexify.apiclient.model.PageMigration;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MigrationsControllerApi
 */
@Ignore
public class MigrationsControllerApiTest {

    private final MigrationsControllerApi api = new MigrationsControllerApi();

    
    /**
     * Add new migration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMigrationTest() throws ApiException {
        AddMigrationRequest migrationRequest = null;
        Migration response = api.addMigration(migrationRequest);

        // TODO: test validations
    }
    
    /**
     * Get migration by id. Only migration owner or administrator have access to the migration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMigrationTest() throws ApiException {
        Long migrationId = null;
        Migration response = api.getMigration(migrationId);

        // TODO: test validations
    }
    
    /**
     * Get all migrations for logged in user in pagged mode
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMigrationsTest() throws ApiException {
        Boolean activeOnly = null;
        Boolean includeHidden = null;
        List<String> attributesToSort = null;
        Integer page = null;
        Integer size = null;
        String sortDirection = null;
        PageMigration response = api.getMigrations(activeOnly, includeHidden, attributesToSort, page, size, sortDirection);

        // TODO: test validations
    }
    
    /**
     * Hide migration from UI
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hideMigrationTest() throws ApiException {
        Long migrationId = null;
        Migration response = api.hideMigration(migrationId);

        // TODO: test validations
    }
    
    /**
     * Stop (cancel) the migration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopMigrationTest() throws ApiException {
        Long migrationId = null;
        Migration response = api.stopMigration(migrationId);

        // TODO: test validations
    }
    
}
