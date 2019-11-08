package ar.com.ada.store.categories.clothes;

public abstract class Clothes extends Product {

    public void Ropa(Double monto, Double priceList) {
        this.monto = priceList;
        this.priceList = priceList;
    }

    public double getMonto() {
        return monto;
    }

    public void setPriceList(Double priceList) {
        this.priceList = priceList;
    }

    public Double getPriceList() {
        return priceList;
    }

    @Override
    public String calcularDescuento(){
        if (this.priceList >=   && this.priceList <= 15%){
            return "El descuento de este producto es:";
        }

}
