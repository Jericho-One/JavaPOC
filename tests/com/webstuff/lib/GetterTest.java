package com.webstuff.lib;

import mockit.Expectations;
import mockit.Mocked;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Calendar;


/**
 * Created by Jericho on 5/17/15.
 */
public class GetterTest {

    @Mocked
    HttpClientBuilder clientBuilder;
    @Mocked
    CloseableHttpClient globalClient;
    @Mocked
    CloseableHttpResponse globalResponse;

    Getter g;

    @Before
    public void setUp() throws Exception {

        new Expectations(){{
            clientBuilder.create().build();
            result = globalClient;
            globalClient.execute((HttpUriRequest)any);
            result = globalResponse;
            globalResponse.getEntity().getContent();
            result = new ByteArrayInputStream(TestResources.CANNED_GOOGLE_RESPONSE.getBytes());
        }};
        g = new Getter();
        String response = g.get(TestResources.TARGET_URL);
        assertNotNull(g);
        assertEquals(TestResources.CANNED_GOOGLE_RESPONSE, response);
    }

    @Test
    public void testGetMethod(@Mocked System mockedSystem) throws IOException {

        Calendar cacheTime = Calendar.getInstance();
        Calendar expiryTime = (Calendar) cacheTime.clone();

        cacheTime.set(Calendar.YEAR, 2010);
        expiryTime.set(Calendar.YEAR, 2500);

        assert(cacheTime.getTimeInMillis() < expiryTime.getTimeInMillis());

        new Expectations(){{
            mockedSystem.currentTimeMillis();
            result = cacheTime.getTimeInMillis();
            clientBuilder.create().build();
            result = globalClient;
            globalClient.execute((HttpUriRequest) any);
            result = globalResponse;
            mockedSystem.currentTimeMillis();
            result = expiryTime.getTimeInMillis();
            globalResponse.getEntity().getContent();
            result = new ByteArrayInputStream(TestResources.CANNED_GOOGLE_RESPONSE2.getBytes());
        }};

        String ret = g.get(TestResources.TARGET_URL);
        assertNotEquals("", ret);
        assertEquals(TestResources.CANNED_GOOGLE_RESPONSE, ret);

        ret = g.get(TestResources.TARGET_URL);
        assertEquals(TestResources.CANNED_GOOGLE_RESPONSE2, ret);
    }
}