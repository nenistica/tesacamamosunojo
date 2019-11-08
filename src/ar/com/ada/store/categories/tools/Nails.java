package ar.com.ada.store.categories.tools;


public class Nails extends Tools{
    public Nails (){ }
    public Nails (Double listPrice, String productName){
        super(listPrice, productName);
    }

    @Override
    public String toString(){
        return "Product name: " + this.productName + " product price: " + this.listPrice;
    }
}
