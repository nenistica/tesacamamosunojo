package ar.com.ada.store.categories.clothes;

public class Jacket extends Clothes{

    public Jacket (){ }
    public Jacket (Double listPrice, String productName){
        super(listPrice, productName);
    }

    @Override
    public String toString(){
        return "Product name: " + this.productName + " product price: " + this.listPrice;
    }
}
