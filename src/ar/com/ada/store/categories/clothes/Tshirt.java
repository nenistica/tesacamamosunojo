package ar.com.ada.store.categories.clothes;

public class Tshirt extends Clothes{
    public Tshirt (){ }
    public Tshirt (Double listPrice, String productName){
        super(listPrice, productName);
    }

    @Override
    public String toString(){
        return "Product name: " + this.productName + " product price: " + this.listPrice;
    }
}
