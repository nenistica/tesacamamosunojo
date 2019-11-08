package ar.com.ada.store.categories.tools;

public class Hammer extends Tools {

    public Hammer (){ }
    public Hammer (Double listPrice, String productName){
        super(listPrice, productName);
    }

    @Override
    public String toString(){
        return "Product name: " + this.productName + " product price: " + this.listPrice;
    }
}
