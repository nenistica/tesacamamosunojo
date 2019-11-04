package ar.com.ada.store.categories.clothes;

public class Pants extends Clothes{
    public Pants (){ }
    public Pants (Double listPrice, String productName){
        super(listPrice, productName);
    }

    @Override
    public String toString(){
        return "Product name: " + this.productName + " product price: " + this.listPrice;
    }
}
