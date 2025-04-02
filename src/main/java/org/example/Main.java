package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        CryptoPriceFetcher fetcher = new CryptoPriceFetcher();

        Crypto bitcoin = new Crypto("bitcoin",fetcher.fetchCryptoPrice("BTC"));

        System.out.println(bitcoin.getPrice());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}