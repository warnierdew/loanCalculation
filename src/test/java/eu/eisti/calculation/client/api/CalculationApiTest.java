/*
 * Swagger Calculation
 * This is a sample server Calculation server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package eu.eisti.calculation.client.api;

import eu.eisti.calculation.client.model.CalculationRequest;
import eu.eisti.calculation.client.model.CalculationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CalculationApi
 */
@Ignore
public class CalculationApiTest {

    private final CalculationApi api = new CalculationApi();

    
    /**
     * Calculations Swagger
     *
     * Calculate interest with montant, duree and taux
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCalculationsByStatusTest() {
        CalculationRequest body = null;
        List<CalculationResponse> response = api.findCalculationsByStatus(body);

        // TODO: test validations
    }
    
}
