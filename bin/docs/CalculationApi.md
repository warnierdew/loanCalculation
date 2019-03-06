# CalculationApi

All URIs are relative to *https://petstore.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCalculationsByStatus**](CalculationApi.md#findCalculationsByStatus) | **POST** /calculationRequest | Calculations Swagger


<a name="findCalculationsByStatus"></a>
# **findCalculationsByStatus**
> List&lt;CalculationResponse&gt; findCalculationsByStatus(body)

Calculations Swagger

Calculate interest with montant, duree and taux

### Example
```java
// Import classes:
//import eu.eisti.calculation.client.invoker.ApiException;
//import eu.eisti.calculation.client.api.CalculationApi;


CalculationApi apiInstance = new CalculationApi();
CalculationRequest body = new CalculationRequest(); // CalculationRequest | Status values that need to be considered for filter
try {
    List<CalculationResponse> result = apiInstance.findCalculationsByStatus(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CalculationApi#findCalculationsByStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CalculationRequest**](CalculationRequest.md)| Status values that need to be considered for filter |

### Return type

[**List&lt;CalculationResponse&gt;**](CalculationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

