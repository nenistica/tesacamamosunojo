import ar.com.ada.store.ShoppingCart;
import ar.com.ada.store.categories.Product;
import ar.com.ada.store.categories.grocery.Bread;
import ar.com.ada.store.categories.grocery.Flour;
import ar.com.ada.store.categories.grocery.Grocery;
import ar.com.ada.store.categories.grocery.Milk;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenido a supermecados 'TE SACAMOS UN OJO");
        //variables temporales
        int choiceCategory, choicequantity, choiceProduct;

        Scanner keyboard = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        do {
            System.out.println("Elija qué categoría de producto desea adquirir: (1) Comidas, " +
                    "(2) Juguetes, (3) Ropa, (4) Herramientas");
            choiceCategory = keyboard.nextInt();
            switch (choiceCategory) {
                case 1:
                    System.out.println("Ingrese cuantos productos de esta categría desea llevar");
                    choicequantity = keyboard.nextInt();
                    for (int i = 0; i < choicequantity; i++) {
                        System.out.println("Cual de los siguientes productos debe llevar? : leche (1), pan (2), harina (3)");
                        choiceProduct = keyboard.nextInt();
                        switch (choiceProduct) {
                            case 1 :
                                Grocery leche = new Milk();
                                break;
                            case 2:
                                Grocery pan = new Bread();
                                break;
                            case 3:
                                Grocery harina = new Flour();
                                break;
                            default:
                                System.out.println();
                        }



                    }

            }
        // TODO: cambiar el true por la condicion apropiadad
        } while (true);
    }
}
