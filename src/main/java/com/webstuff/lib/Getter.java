package com.webstuff.lib;

/**
 * Created by Jericho on 4/25/15.
 */

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class Getter {

    HttpGet getRequest;

    private static final int CACHE_TIME_MS = 30 * 1000;
    private volatile long cacheExpiry;
    private static String responseStr;

    public String get(String url){

        if(System.currentTimeMillis() > cacheExpiry) {

            getRequest = new HttpGet(url);

            try (CloseableHttpClient client = HttpClientBuilder.create().build();
                 CloseableHttpResponse response = client.execute(getRequest)) {

                cacheExpiry = System.currentTimeMillis() + CACHE_TIME_MS;
                responseStr = EntityUtils.toString(response.getEntity());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return responseStr;
    }
}
