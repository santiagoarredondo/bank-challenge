package com.endava.bank;

public class Office {
    private int id;
    private String country;
    private String city;
    private String address;
    private String currency;
    private Dispatcher dispatcher;

    public Office(int id, String country, String city, String address, String currency) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.address = address;
        this.currency = currency;
        this.dispatcher = Dispatcher.getInstance();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Office{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
