package org.example;

public class Crypto {

    private double price;
    private String cryptoSymbol;

    public Crypto(String cryptoSymbol, double price){
        this.price=price;
        this.cryptoSymbol=cryptoSymbol;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCryptoSymbol() {
        return cryptoSymbol;
    }
}
