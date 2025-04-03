package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        CryptoPriceFetcher fetcher = new CryptoPriceFetcher();

        ArrayList<Crypto> famousCrypto = new ArrayList<>();

        famousCrypto.add(new Crypto("bitcoin",fetcher.fetchCryptoPrice("BTC")));
        famousCrypto.add(new Crypto("ethereum",fetcher.fetchCryptoPrice("ETH")));
        famousCrypto.add(new Crypto("solana",fetcher.fetchCryptoPrice("SOL")));

        for (Crypto crypto : famousCrypto){
            System.out.println(crypto.getCryptoSymbol()+": " + crypto.getPrice()+" USD");
        }

    }
}