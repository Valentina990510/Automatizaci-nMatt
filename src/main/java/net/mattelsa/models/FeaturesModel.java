package net.mattelsa.models;

public class FeaturesModel {
    private String Amount;
    private String Size;

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public FeaturesModel(String amount, String size) {
        Amount = amount;
        Size = size;
    }
}
