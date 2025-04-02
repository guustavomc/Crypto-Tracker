package org.example;

import java.io.IOException;
import java.net.http.*;
import java.net.URI;

import org.json.JSONException;
import org.json.JSONObject;

public class CryptoPriceFetcher {


    public double fetchCryptoPrice(String cryptoName) throws Exception {

        //String url = "https://api.coingecko.com/api/v3/simple/price?ids="+cryptoName+"&vs_currencies=usd";
        String url = "https://api.binance.com/api/v3/avgPrice?symbol="+cryptoName+"USDT";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Parse JSON response
        JSONObject jsonObject = new JSONObject(response.body());
        String cryptoPrice = jsonObject.getString("price");


        return Double.valueOf(cryptoPrice);
    }

}
