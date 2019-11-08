package ar.com.ada.store.categories;

    public abstract class Product {

        //     Atributos
        protected Double listPrice;
        protected String productName;

        // Constructor
        public Product(Double listPrice, String productName) {
            this.listPrice = listPrice;
            this.productName = productName;
        }

        // Getters y Setters
        public Double getListPrice() {
            return listPrice;
        }

        public void setListPrice(Double listPrice) {
            this.listPrice = listPrice;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        //    Método abstracto para calcular descuento.
        public abstract Double calculateDiscount();

        //        Sobreescritura del método toString.
        @Override
        public String toString() {
            return "Product Name: " + this.productName + "Product price: " + this.listPrice;
        }


}
