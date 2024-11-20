/**
 * @author kmccallum <Kathleen_McCallum VIU>
 * @author dcollado <David Collado VIU>
 * @author oguardia <Oscar Guardia VIU>
 */
package com.viu.cafegrupo1;

public class CafeGrupo1 {

    public static void main(String[] args) {
        
        System.out.println("\nHola, esta es la Empresa de Cafe Grupo1!");
        
        // voy a crear mi listado de productos.
        /* la clase Productos es abstracta, asi que tengo que usar una clase
         * que lo implemente, en esta caso 'cafeEspecial'
         */
        cafeEspecial gpProductos[] = {
            new cafeEspecial("cafe Natural", 4.50, 100),
            new cafeEspecial("cafe Torrefacto", 4.00, 200),
            new cafeEspecial("cafe Premium", 5.50, 70)
        };       
        // mi empresa tiene 1 empleado y 1 gerente
        Operario operario = new Operario("Juan", "Perez Lopez", "021021021A", 1200);
        Gerente theBoss = new Gerente ("Maria", "Mercedes Vargas", "321321321z",3000);
        
        System.out.print("Soy " + theBoss.getNombres() + " gerente de CafeGrupo1 y ");
        System.out.print(operario.getNombres() + " es nuestro trabajador estrella\n\n");
                
        // como ejemplo, los caf'es tienen origen EU, y no tienen nota de cata aun
        for(int i =0; i< gpProductos.length; i++){
           gpProductos[i].setOrigen("EU");
           gpProductos[i].setNotaCata(0);
           System.out.println(gpProductos[i].describirProducto());
        }
        
        // voy a incrementar la nota de cata a todos los productos
        Operaciones operCafe = new Operaciones(gpProductos);
        operCafe.incrementaNotaCata();
    }
}
