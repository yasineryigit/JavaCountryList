package com.ossovita.javacountrylist.model;

public class Country {
    String countryName;
    String countryRegion;
    String countryCapital;
    String countryCurrency;
    String countryLanguage;
    String imageUrl;

    public Country(String countryName, String countryRegion, String countryCapital, String countryCurrency, String countryLanguage, String imageUrl) {
        this.countryName = countryName;
        this.countryRegion = countryRegion;
        this.countryCapital = countryCapital;
        this.countryCurrency = countryCurrency;
        this.countryLanguage = countryLanguage;
        this.imageUrl = imageUrl;
    }
}
