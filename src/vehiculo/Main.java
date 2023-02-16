
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoBellidoSerranAdriana2223 miVehiculoBellidoSerranAdriana2223;
        int stockActual;
        
        miVehiculoBellidoSerranAdriana2223 = new VehiculoBellidoSerranAdriana2223("Seat",18000,100);
        operativaVehiculosBellidoSerranAdriana2223(miVehiculoBellidoSerranAdriana2223, 50); 
        stockActual = miVehiculoBellidoSerranAdriana2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosBellidoSerranAdriana2223(VehiculoBellidoSerranAdriana2223 miVehiculoBellidoSerranAdriana2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoBellidoSerranAdriana2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoBellidoSerranAdriana2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
