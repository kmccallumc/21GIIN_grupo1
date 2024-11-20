/**
 * @author kmccallum <Kathleen_McCallum VIU>
 * @author dcollado <David Collado VIU>
 * @author oguardia <Oscar Guardia VIU>
 */
package com.viu.cafegrupo1;

class Operaciones {
    private Producto prod[]; // tenemos un listado de productos
    
    public Operaciones (Producto[] prod){
        this.prod = prod;
    }
    
    //esto es una prueba de que puedo editar codigo
    
    public boolean realizarPedido(){
        // le paso el listado de productos, 
        // luego creo actualizo el stock (siempre reduciendo
    return true; // si se realizo correctamente el pedido
    }
    
    public boolean actualizarStock(Producto prodAct, int stock){
        
        prodAct.setStock(stock);
        return true;
    }

        // KMC : que significa gestionar Inventario? ... por producto o por el total?
    private void gestionarInventario(){
        int numProds = this.prod.length;
        
        for (int i=0;i<numProds;i++){
            
        }
            
    }

}
