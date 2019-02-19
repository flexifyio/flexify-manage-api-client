/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.7.0
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.model.AddStorageAccountRequest;
import io.flexify.apiclient.model.Bucket;
import io.flexify.apiclient.model.IdResponse;
import io.flexify.apiclient.model.IdsList;
import io.flexify.apiclient.model.StorageAccount;
import io.flexify.apiclient.model.StorageAccountSettings;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StorageAccountsControllerApi
 */
@Ignore
public class StorageAccountsControllerApiTest {

    private final StorageAccountsControllerApi api = new StorageAccountsControllerApi();

    
    /**
     * Add Storage Account with an optional list of buckets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addStorageAccountTest() throws ApiException {
        AddStorageAccountRequest request = null;
        IdResponse response = api.addStorageAccount(request);

        // TODO: test validations
    }
    
    /**
     * Deletes (hides) storage account and all its buckets/containers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStorageAccountTest() throws ApiException {
        Long storageAccountId = null;
        Boolean forceDetach = null;
        api.deleteStorageAccount(storageAccountId, forceDetach);

        // TODO: test validations
    }
    
    /**
     * Deletes (hides) a multiple storage accounts and all their buckets/containers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStorageAccountsTest() throws ApiException {
        IdsList request = null;
        Boolean forceDetach = null;
        api.deleteStorageAccounts(request, forceDetach);

        // TODO: test validations
    }
    
    /**
     * Get storage account by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStorageAccountTest() throws ApiException {
        Long storageAccountId = null;
        List<Bucket> response = api.getStorageAccount(storageAccountId);

        // TODO: test validations
    }
    
    /**
     * Get all storage accounts for current user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStorageAccountsTest() throws ApiException {
        Boolean includeStorages = null;
        List<StorageAccount> response = api.getStorageAccounts(includeStorages);

        // TODO: test validations
    }
    
    /**
     * Requests and updates list of buckets/containers for the storage account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshStorageAccountTest() throws ApiException {
        Long storageAccountId = null;
        api.refreshStorageAccount(storageAccountId);

        // TODO: test validations
    }
    
    /**
     * Requests and updates list of buckets/containers for a list of storage accounts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshStorageAccountsTest() throws ApiException {
        IdsList request = null;
        api.refreshStorageAccounts(request);

        // TODO: test validations
    }
    
    /**
     * Updates storage account settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setStorageAccountSettingsTest() throws ApiException {
        StorageAccountSettings settings = null;
        Long storageAccountId = null;
        api.setStorageAccountSettings(settings, storageAccountId);

        // TODO: test validations
    }
    
}
