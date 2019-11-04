package ar.com.ada.store.categories.tools;

public class Screwdriver extends Tools{

    public Screwdriver (){ }
    public Screwdriver (Double listPrice, String productName){
        super(listPrice, productName);
    }

    @Override
    public String toString(){
        return "Product name: " + this.productName + " product price: " + this.listPrice;
    }
}
