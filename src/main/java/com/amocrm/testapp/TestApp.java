package com.amocrm.testapp;

import com.amocrm.amocrmclient.lead.LeadClient;
import com.amocrm.amocrmclient.lead.LeadHalClient;
import com.amocrm.amocrmclient.lead.entity.Lead;
import com.amocrm.amocrmclient.lead.impl.LeadHalClientBuilder;
import com.amocrm.amocrmclient.response.HalResponse;
import retrofit2.Response;

import java.io.IOException;

public class TestApp {

    public static void main(String[] args) {

        LeadHalClient leadClient = new LeadHalClientBuilder()
                .baseUrl("https://something.amocrm.ru/")
                .login("email@example.com")
                .passwordHash("4582e7asdfs7bsdfsdfsf96")
                .build();
        try {
            Response<HalResponse<Lead>> leadsResponse = leadClient.list(10);
            System.out.println("Leads count: " + leadsResponse.body().embedded.items.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
