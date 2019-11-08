package ar.com.ada.store.categories.toy;

public class Car extends Toys{

        public Car (){ }
        public Car (Double listPrice, String productName){
            super(listPrice, productName);
        }

        @Override
        public String toString(){
            return "Product name: " + this.productName + " product price: " + this.listPrice;
        }
    }
}
