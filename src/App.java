import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenido a supermecados 'TE SACAMOS UN OJO");
        //variables temporales
        int choiceCategory, choicequantity;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Elija qué categoría de producto desea adquirir: (1) Comidas, " +
                    "(2) Juguetes, (3) Ropa, (4) Herramientas");
            choiceCategory = keyboard.nextInt();
            switch (choiceCategory) {
                case 1:
                    System.out.println("Ingrese cuantos productos de esta categría desea llevar");
                    choicequantity = keyboard.nextInt();
                    for (int i = 0; i < choicequantity; i++) {

                    }

            }
        // TODO: cambiar el true por la condicion apropiadad
        } while (true);
    }
}
