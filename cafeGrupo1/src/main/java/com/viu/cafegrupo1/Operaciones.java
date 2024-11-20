/**
 * @author kmccallum <Kathleen_McCallum VIU>
 * @author dcollado <David Collado VIU>
 * @author oguardia <Oscar Guardia VIU>
 */
package com.viu.cafegrupo1;

class Operaciones {
    private cafeEspecial prod[]; // tenemos un listado de productos
    
    public Operaciones (cafeEspecial[] prod){
        this.prod = prod;
    }   
    public boolean realizarPedido(){
        // le paso el listado de productos, 
        // luego creo actualizo el stock (siempre reduciendo
    return true; // si se realizo correctamente el pedido
    }
    
    public boolean actualizarStock(cafeEspecial prodAct, int stock){
        
        prodAct.setStock(stock);
        return true;
    }

    // Incrementa la nota de cata de todos los productos .. porque lo vale :)
    public void incrementaNotaCata(){
        int numProds = this.prod.length;
        
        System.out.println("\n\n****Operacion : Incrementar nota de Cata a todos los cafes ****");
        for (int i=0;i<numProds;i++){
            double catAnt = this.prod[i].getNotaCata();
            this.prod[i].setNotaCata(catAnt+1);
        }
        this.gestionarInventario();
    }
    
        // KMC : que significa gestionar Inventario? ... por ahora solo imprime el inventario actual
    private void gestionarInventario(){
        int numProds = this.prod.length;
        
        System.out.println("El inventario actual:");
        for (int i=0;i<numProds;i++){
            System.out.println(this.prod[i].describirProducto());
        }
        
            
    }

}
