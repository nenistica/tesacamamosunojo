package ar.com.ada.store.categories.toy;

public class Ball extends Toy {

    public Ball (){ }
    public Ball (Double listPrice, String productName){
        super(listPrice, productName);
    }

    @Override
    public String toString(){
        return "Product name: " + this.productName + " product price: " + this.listPrice;
    }
}
