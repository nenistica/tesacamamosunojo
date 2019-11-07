import ar.com.ada.store.ShoppingCart;
import ar.com.ada.store.categories.Product;
import ar.com.ada.store.categories.clothes.Clothes;
import ar.com.ada.store.categories.clothes.Jacket;
import ar.com.ada.store.categories.clothes.Pants;
import ar.com.ada.store.categories.clothes.Tshirt;
import ar.com.ada.store.categories.grocery.Bread;
import ar.com.ada.store.categories.grocery.Flour;
import ar.com.ada.store.categories.grocery.Grocery;
import ar.com.ada.store.categories.grocery.Milk;
import ar.com.ada.store.categories.tools.Hammer;
import ar.com.ada.store.categories.tools.Nails;
import ar.com.ada.store.categories.tools.Screwdriver;
import ar.com.ada.store.categories.tools.Tools;
import ar.com.ada.store.categories.toy.Ball;
import ar.com.ada.store.categories.toy.Car;
import ar.com.ada.store.categories.toy.Doll;
import ar.com.ada.store.categories.toy.Toy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenido a supermecados 'TE SACAMOS UN OJO");
        //variables temporales
        int choiceCategory, choicequantity, choiceProduct;
        String answer;

        Scanner keyboard = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        do {
            System.out.println("Elija qué categoría de producto desea adquirir: (1) Comidas, " +
                    "(2) Ropa, (3) Herramientas, (4) Juguetes");
            choiceCategory = keyboard.nextInt();
            switch (choiceCategory) {
                case 1:
                    System.out.println("Ingrese cuantos productos de esta categría desea llevar");
                    choicequantity = keyboard.nextInt();
                    do {
                        for (int i = 0; i < choicequantity; i++) {
                            System.out.println("Cual de los siguientes productos debe llevar? : leche (1), pan (2), harina (3)");
                            choiceProduct = keyboard.nextInt();
                            switch (choiceProduct) {
                                case 1:
                                    Grocery leche = new Milk();
                                    cart.addToProductList(leche);
                                    break;
                                case 2:
                                    Grocery pan = new Bread();
                                    cart.addToProductList(pan);
                                    break;
                                case 3:
                                    Grocery harina = new Flour();
                                    cart.addToProductList(harina);
                                    break;
                                default:
                                    System.out.println("opción no disponible");
                            }
                        }
                        System.out.println("¿Desea llevar algo más?");
                        answer = keyboard.next();
                    } while (answer.equals("Sí"));
                    break;

                case 2: System.out.println("Ingrese cuantos productos de esta categría desea llevar");
                    choicequantity = keyboard.nextInt();
                    do {
                        for (int i = 0; i < choicequantity; i++) {
                            System.out.println("Cual de los siguientes productos debe llevar? : chaqueta (1), pantalón (2), remera (3)");
                            choiceProduct = keyboard.nextInt();
                            switch (choiceProduct) {
                                case 1:
                                    Clothes chaqueta = new Jacket();
                                    cart.addToProductList(chaqueta);
                                    break;
                                case 2:
                                    Clothes pantalon = new Pants();
                                    cart.addToProductList(pantalon);
                                    break;
                                case 3:
                                    Clothes remera = new Tshirt();
                                    cart.addToProductList(remera);
                                    break;
                                default:
                                    System.out.println("opción no disponible");
                            }
                        }
                        System.out.println("¿Desea llevar algo más?");
                        answer = keyboard.next();
                    } while (answer.equals("Sí")) ;
                    break;

                case 3: System.out.println("Ingrese cuantos productos de esta categría desea llevar");
                    choicequantity = keyboard.nextInt();
                    do {
                        for (int i = 0; i < choicequantity; i++) {
                            System.out.println("Cual de los siguientes productos debe llevar? : martillo (1), clavos (2), destornillador (3)");
                            choiceProduct = keyboard.nextInt();
                            switch (choiceProduct) {
                                case 1:
                                    Tools martillo = new Hammer();
                                    cart.addToProductList(martillo);
                                    break;
                                case 2:
                                    Tools clavos = new Nails();
                                    cart.addToProductList(clavos);
                                    break;
                                case 3:
                                    Tools destornillador = new Screwdriver();
                                    cart.addToProductList(destornillador);
                                    break;
                                default:
                                    System.out.println("opción no disponible");
                            }
                        }
                        System.out.println("¿Desea llevar algo más?");
                        answer = keyboard.next();
                    } while (answer.equals("Sí")) ;
                    break;
                case 4: System.out.println("Ingrese cuantos productos de esta categría desea llevar");
                    choicequantity = keyboard.nextInt();
                    do {
                        for (int i = 0; i < choicequantity; i++) {
                            System.out.println("Cual de los siguientes productos debe llevar? : pelota (1), auto (2), muñeca (3)");
                            choiceProduct = keyboard.nextInt();
                            switch (choiceProduct) {
                                case 1:
                                    Toy pelota = new Ball();
                                    cart.addToProductList(pelota);
                                    break;
                                case 2:
                                    Toy auto = new Car();
                                    cart.addToProductList(auto);
                                    break;
                                case 3:
                                    Clothes muñeca = new Doll();
                                    cart.addToProductList(muñeca);
                                    break;
                                default:
                                    System.out.println("opción no disponible");
                            }
                        }
                        System.out.println("¿Desea llevar algo más?");
                        answer = keyboard.next();
                    } while (answer.equals("Sí")) ;
                    break;

            }
            System.out.println("¿Desea comprar algo más? Tipee 'si' o 'no'.");
            answer = keyboard.next();
        } while (answer.equals("si"));
    }


}
