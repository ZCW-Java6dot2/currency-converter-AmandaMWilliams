package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        Double currencyToBeConvertedTo = currencyType.getRate();
        Double currencyToBeConvertedFrom = this.getType().getRate();
        return currencyToBeConvertedTo / currencyToBeConvertedFrom;
    }

    CurrencyType getType();
}
