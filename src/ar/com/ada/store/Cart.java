
package ar.com.ada.store;

import ar.com.ada.store.categories.Product;

import java.util.ArrayList;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class ShoppingCart {

    public Integer paymentMethod;
    // Si no hay descuento da 0
    private Double totalDiscount = 0.;
    private Double paymentWithoutDiscount = 0.;
    private Double paymentWithDiscount = 0.;

    public static LocalDate date = LocalDate.now();
    public static DayOfWeek day = date.getDayOfWeek();

    public ArrayList<Product> productlist = new ArrayList<>();

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public Double getPaymentWithtDiscount() {
        return paymentWithDiscount;
    }

    public Double getPaymentWithoutDiscount() {
        return paymentWithoutDiscount;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    //    metodo para agregar un articulo al array
    public void addToProductList(Product producto) {
        productlist.add(producto);
    }

    public Double calculateTotalWithoutdiscount() {
        for (int i = 0; i < productlist.size(); i++) {
            this.paymentWithoutDiscount += productlist.get(i).getListPrice();
        }
        return this.paymentWithoutDiscount;
    }

    public void calculateTotalDiscount() {
        for (int i = 0; i < productlist.size(); i++) {
            this.totalDiscount = totalDiscount + productlist.get(i).calculateDiscount();
        }
    }

    public void calculateTotalWithDiscount() {
        this.paymentWithDiscount = this.paymentWithoutDiscount - this.totalDiscount;
    }

    public void Ticket() {
        System.out.println("Te sacamos un ojo \n Nombre del producto: \n Precio del producto: \n " +
                "Precio con descuento: ");
        for (Product productlist : productlist) {
            System.out.println("Su total sin descuento es: ");
            System.out.println("El total con descuesto es: ");
        }
    }
}