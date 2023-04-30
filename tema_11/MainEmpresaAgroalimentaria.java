import EmpresaAgroalimentaria.*;
import EmpresaAgroalimentaria.ProductosCongelados.tipoCongelado;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class MainEmpresaAgroalimentaria {
    public static void main(String[] args) {

        List<ProductosGeneral> listaProductos = new ArrayList<>();
        List<ProductosFrescos> listaFrescos = new ArrayList<>();
        List<ProductosRefrigerados> listaRefrigerados = new ArrayList<>();
        List<ProductosCongelados> listaCongelados = new ArrayList<>();

        ProductosFrescos producto_1 = new ProductosFrescos("02/03/2030", 172, "12/12/2023", "Francia");
        listaProductos.add(producto_1);
        listaFrescos.add(producto_1);

        ProductosFrescos producto_2 = new ProductosFrescos("05/08/2025", 120, "15/02/2020", "Italia ");
        listaProductos.add(producto_2);
        listaFrescos.add(producto_2);

        ProductosRefrigerados producto_3 = new ProductosRefrigerados("02/08/2025", 289, "12/08/2025", "España ", -5, "A123H");
        listaProductos.add(producto_3);
        listaRefrigerados.add(producto_3);

        ProductosRefrigerados producto_4 = new ProductosRefrigerados("02/08/2025", 289, "12/08/2025", "España ", -5, "A123H");
        listaProductos.add(producto_4);
        listaRefrigerados.add(producto_4);

        ProductosRefrigerados producto_5 = new ProductosRefrigerados("07/05/2030", 290, "14/05/2030", "Suecia ", -3, "UU89I");
        listaProductos.add(producto_5);
        listaRefrigerados.add(producto_5);

        ProductosCongelados producto_6 = new PCongAgua("05/08/2025", 756, "02/08/2026", "China ", -8, tipoCongelado.Agua, 0.26f);
        listaProductos.add(producto_6);
        listaCongelados.add(producto_6);
        
        ProductosCongelados producto_7 = new PCongAgua("22/12/2020", 800, "10/01/2021", "Rusia ", -6, tipoCongelado.Agua, 0.36f);
        listaProductos.add(producto_7);
        listaCongelados.add(producto_7);

        ProductosCongelados producto_8 = new PCongAire("09/10/2026", 122, "15/10/2026", "Italia", -9, tipoCongelado.Aire, 0.55f, 0.05f, 0.10f);
        listaProductos.add(producto_8);
        listaCongelados.add(producto_8);

        ProductosCongelados producto_9 = new PCongAire("10/10/2030", 126, "15/10/2030", "Italia", -7, tipoCongelado.Aire, 0.35f, 0.42f, 0.10f);
        listaProductos.add(producto_9);
        listaCongelados.add(producto_9);

        ProductosCongelados producto_10 = new PCongNitrogeno("14/02/2024", 651, "28/02/2024", "Suecia", -7, tipoCongelado.Nitrogeno, 0.05f);
        listaProductos.add(producto_10);
        listaCongelados.add(producto_10);

        System.out.println();
        System.out.println("===== Productos Frescos =====");
        for (ProductosFrescos producto : listaFrescos) {
            System.out.println(producto);
        }
        System.out.println();

        System.out.println();
        System.out.println("===== Productos Refrigerados =====");
        for (ProductosRefrigerados producto : listaRefrigerados) {
            System.out.println(producto);
        }
        System.out.println();

        System.out.println();
        System.out.println("===== Productos Congelados =====");
        for (ProductosCongelados producto : listaCongelados) {
            System.out.println(producto);
        }
        System.out.println();

        /*System.out.println();
        for (ProductosGeneral producto : listaProductos) {
            System.out.println(producto);
        }*/
    }
}