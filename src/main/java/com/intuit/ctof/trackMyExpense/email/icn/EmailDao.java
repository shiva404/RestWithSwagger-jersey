package com.intuit.ctof.trackMyExpense.email.icn;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.api.json.JSONConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 11:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmailDao {
    public static final String AUTH_HEADER = "Intuit_IAM_Authentication intuit_appid=Intuit.spi.icn_client, intuit_app_secret=v2DsNllTDT2605v78MG8DQ, intuit_token_type=IAM-Ticket, intuit_realmid=1111, intuit_token=email-swagger, intuit_intuitid=254429870, intuit_version=1.0";
    public static final String AUTHORIZATION = "Authorization";
    private Client client;

    public void sendEmail(IcnEmail email) throws Exception {
        ClientResponse response = client.resource("https://devinternal-prf.intuit.com:443/apip/remote/icne/v1/mails").type("application/json").header(AUTHORIZATION, AUTH_HEADER).entity(email).post(ClientResponse.class);
        if(response.getStatus() > 204){
            throw new Exception("Failed to write to ICN");
        }
    }

    private void init(){
        DefaultClientConfig cc = new DefaultClientConfig();
        // use POJO JSON conversion support
        cc.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        client = com.sun.jersey.api.client.Client.create(cc);
        client.addFilter(new LoggingFilter());
    }
}
