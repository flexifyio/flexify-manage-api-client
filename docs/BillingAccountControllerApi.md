# BillingAccountControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCostsForCurrentUserBillingAccount**](BillingAccountControllerApi.md#getCostsForCurrentUserBillingAccount) | **GET** /backend/rest/account/costs | Get costs for current user
[**getCurrentUserBillingAccount**](BillingAccountControllerApi.md#getCurrentUserBillingAccount) | **GET** /backend/rest/account | Get billing account for current user
[**getPaymentsForCurrentUser**](BillingAccountControllerApi.md#getPaymentsForCurrentUser) | **GET** /backend/rest/account/payments | Get payments for current user


<a name="getCostsForCurrentUserBillingAccount"></a>
# **getCostsForCurrentUserBillingAccount**
> List&lt;CostDetails&gt; getCostsForCurrentUserBillingAccount()

Get costs for current user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.BillingAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BillingAccountControllerApi apiInstance = new BillingAccountControllerApi();
try {
    List<CostDetails> result = apiInstance.getCostsForCurrentUserBillingAccount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountControllerApi#getCostsForCurrentUserBillingAccount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CostDetails&gt;**](CostDetails.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getCurrentUserBillingAccount"></a>
# **getCurrentUserBillingAccount**
> BillingAccount getCurrentUserBillingAccount()

Get billing account for current user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.BillingAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BillingAccountControllerApi apiInstance = new BillingAccountControllerApi();
try {
    BillingAccount result = apiInstance.getCurrentUserBillingAccount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountControllerApi#getCurrentUserBillingAccount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BillingAccount**](BillingAccount.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getPaymentsForCurrentUser"></a>
# **getPaymentsForCurrentUser**
> List&lt;Payment&gt; getPaymentsForCurrentUser()

Get payments for current user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.BillingAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BillingAccountControllerApi apiInstance = new BillingAccountControllerApi();
try {
    List<Payment> result = apiInstance.getPaymentsForCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountControllerApi#getPaymentsForCurrentUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Payment&gt;**](Payment.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

