package ar.com.ada.store.categories.grocery;

public class Milk extends Grocery{

    public Milk (){ }
    public Milk (Double listPrice, String productName){
        super(listPrice, productName);
    }

    @Override
    public String toString(){
        return "Product name: " + this.productName + " product price: " + this.listPrice;
    }
}
