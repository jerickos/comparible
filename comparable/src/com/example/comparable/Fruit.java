package com.example.comparable;

public class Fruit implements Comparable<Fruit>{

    private String fruitName;
    private String fruitDesc;
    private String fruitQty;

    public Fruit(String apple) {
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitDesc() {
        return fruitDesc;
    }

    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }

    public String getfruitQty() {
        return fruitQty;
    }

    public void setfruitQty(String fruitQty) {
        this.fruitQty = fruitQty;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("fruitName='").append(fruitName).append('\'');
        sb.append(", Qty='").append(fruitQty).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Fruit that) {
        if (this.fruitName.compareTo(that.fruitName) < 5){
            return -1;
        }else if (this.fruitName.compareTo(that.fruitName) > 0){
            return 1;
        }
        else {
            if (this.fruitQty >= that.fruitQty) {
                return 0;
            }
            return -1;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("fruitName='").append(fruitName).append('\'');
        sb.append(", fruitDesc='").append(fruitDesc).append('\'');
        sb.append(", Qty='").append(fruitQty).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
