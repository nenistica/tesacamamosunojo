package ar.com.ada.store.categories.grocery;

public class Flour extends Grocery{

    public Flour (){ }
    public Flour (Double listPrice, String productName){
        super(listPrice, productName);
    }

    @Override
    public String toString(){
        return "Product name: " + this.productName + " product price: " + this.listPrice;
    }
}
