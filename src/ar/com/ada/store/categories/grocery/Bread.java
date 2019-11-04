package ar.com.ada.store.categories.grocery;

public class Bread extends Grocery{

    public Bread (){ }
    public Bread (Double listPrice, String productName){
        super(listPrice, productName);
    }

    @Override
    public String toString(){
        return "Product name: " + this.productName + " product price: " + this.listPrice;
    }
}
