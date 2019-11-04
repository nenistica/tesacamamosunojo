package ar.com.ada.store.categories.toy;

public class Doll extends Toys{

    public Doll (){ }
    public Doll (Double listPrice, String productName){
        super(listPrice, productName);
    }

    @Override
    public String toString(){
        return "Product name: " + this.productName + " product price: " + this.listPrice;
    }
}
