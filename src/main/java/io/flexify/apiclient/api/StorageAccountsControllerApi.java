package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AddStorageAccountRequest;
import io.flexify.apiclient.model.Bucket;
import io.flexify.apiclient.model.IdResponse;
import io.flexify.apiclient.model.IdsList;
import io.flexify.apiclient.model.StorageAccount;
import io.flexify.apiclient.model.StorageAccountSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-14T13:08:44.282+08:00")
public class StorageAccountsControllerApi {
  private ApiClient apiClient;

  public StorageAccountsControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StorageAccountsControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add Storage Account with an optional list of buckets
   * 
   * @param request request (required)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse addStorageAccount(AddStorageAccountRequest request) throws ApiException {
    return addStorageAccountWithHttpInfo(request).getData();
      }

  /**
   * Add Storage Account with an optional list of buckets
   * 
   * @param request request (required)
   * @return ApiResponse&lt;IdResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdResponse> addStorageAccountWithHttpInfo(AddStorageAccountRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling addStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<IdResponse> localVarReturnType = new GenericType<IdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes (hides) storage account and all its buckets/containers
   * 
   * @param storageAccountId storage-account-id (required)
   * @param forceDetach force-detach (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void deleteStorageAccount(Long storageAccountId, Boolean forceDetach) throws ApiException {

    deleteStorageAccountWithHttpInfo(storageAccountId, forceDetach);
  }

  /**
   * Deletes (hides) storage account and all its buckets/containers
   * 
   * @param storageAccountId storage-account-id (required)
   * @param forceDetach force-detach (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteStorageAccountWithHttpInfo(Long storageAccountId, Boolean forceDetach) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling deleteStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/{storage-account-id}"
      .replaceAll("\\{" + "storage-account-id" + "\\}", apiClient.escapeString(storageAccountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force-detach", forceDetach));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Deletes (hides) a multiple storage accounts and all their buckets/containers
   * 
   * @param request request (required)
   * @param forceDetach force-detach (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void deleteStorageAccounts(IdsList request, Boolean forceDetach) throws ApiException {

    deleteStorageAccountsWithHttpInfo(request, forceDetach);
  }

  /**
   * Deletes (hides) a multiple storage accounts and all their buckets/containers
   * 
   * @param request request (required)
   * @param forceDetach force-detach (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteStorageAccountsWithHttpInfo(IdsList request, Boolean forceDetach) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling deleteStorageAccounts");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/actions/delete";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force-detach", forceDetach));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get storage account by id
   * 
   * @param storageAccountId storage-account-id (required)
   * @return List&lt;Bucket&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Bucket> getStorageAccount(Long storageAccountId) throws ApiException {
    return getStorageAccountWithHttpInfo(storageAccountId).getData();
      }

  /**
   * Get storage account by id
   * 
   * @param storageAccountId storage-account-id (required)
   * @return ApiResponse&lt;List&lt;Bucket&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Bucket>> getStorageAccountWithHttpInfo(Long storageAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling getStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/storage-accounts/{storage-account-id}"
      .replaceAll("\\{" + "storage-account-id" + "\\}", apiClient.escapeString(storageAccountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<List<Bucket>> localVarReturnType = new GenericType<List<Bucket>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all storage accounts for current user
   * 
   * @param includeStorages Include storages of given storage account to the response (optional, default to true)
   * @return List&lt;StorageAccount&gt;
   * @throws ApiException if fails to make API call
   */
  public List<StorageAccount> getStorageAccounts(Boolean includeStorages) throws ApiException {
    return getStorageAccountsWithHttpInfo(includeStorages).getData();
      }

  /**
   * Get all storage accounts for current user
   * 
   * @param includeStorages Include storages of given storage account to the response (optional, default to true)
   * @return ApiResponse&lt;List&lt;StorageAccount&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<StorageAccount>> getStorageAccountsWithHttpInfo(Boolean includeStorages) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include-storages", includeStorages));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<List<StorageAccount>> localVarReturnType = new GenericType<List<StorageAccount>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Requests and updates list of buckets/containers for the storage account
   * 
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public void refreshStorageAccount(Long storageAccountId) throws ApiException {

    refreshStorageAccountWithHttpInfo(storageAccountId);
  }

  /**
   * Requests and updates list of buckets/containers for the storage account
   * 
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> refreshStorageAccountWithHttpInfo(Long storageAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling refreshStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/{storage-account-id}/actions/refresh"
      .replaceAll("\\{" + "storage-account-id" + "\\}", apiClient.escapeString(storageAccountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Requests and updates list of buckets/containers for a list of storage accounts
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void refreshStorageAccounts(IdsList request) throws ApiException {

    refreshStorageAccountsWithHttpInfo(request);
  }

  /**
   * Requests and updates list of buckets/containers for a list of storage accounts
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> refreshStorageAccountsWithHttpInfo(IdsList request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling refreshStorageAccounts");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/actions/refresh";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Updates storage account settings
   * 
   * @param settings settings (required)
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public void setStorageAccountSettings(StorageAccountSettings settings, Long storageAccountId) throws ApiException {

    setStorageAccountSettingsWithHttpInfo(settings, storageAccountId);
  }

  /**
   * Updates storage account settings
   * 
   * @param settings settings (required)
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setStorageAccountSettingsWithHttpInfo(StorageAccountSettings settings, Long storageAccountId) throws ApiException {
    Object localVarPostBody = settings;
    
    // verify the required parameter 'settings' is set
    if (settings == null) {
      throw new ApiException(400, "Missing the required parameter 'settings' when calling setStorageAccountSettings");
    }
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling setStorageAccountSettings");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/{storage-account-id}/settings"
      .replaceAll("\\{" + "storage-account-id" + "\\}", apiClient.escapeString(storageAccountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}