/**
 * @author kmccallum <Kathleen_McCallum VIU>
 * @author dcollado <David Collado VIU>
 * @author oguardia <Oscar Guardia VIU>
 */
package com.viu.cafegrupo1;

public class CafeGrupo1 {

    public static void main(String[] args) {
        
        System.out.println("Hola, esta es la Empresa de Cafe Grupo1!");
        
        // voy a crear mi listado de productos.
        cafeEspecial gpProductos[] = {
            new cafeEspecial("cafe Natural", 4.50, 100),
            new cafeEspecial("cafe Torrefacto", 4.00, 200),
            new cafeEspecial("cafe Premium", 5.50, 70)
        };
        
        // como ejemplo, los caf'es tienen origen EU, y no tienen nota de cata aun
        for(int i =0; i< gpProductos.length; i++){
           gpProductos[i].setOrigen("EU");
           gpProductos[i].setNotaCata(0);
           System.out.println(gpProductos[i].describirProducto());
        }
        
        
    }
}
