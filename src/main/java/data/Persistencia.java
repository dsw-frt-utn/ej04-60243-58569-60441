package data;

import domain.*;
import java.util.ArrayList;
import java.util.Optional;

public class Persistencia {
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private static ArrayList<Responsable> responsables = new ArrayList<>();
    private static ArrayList<Sucursal> sucursales = new ArrayList<>();
    
    private static void inicializarResponsables(){
        Responsable r1 = new Responsable("Carlos Gómez", "25444111", "3815551111");
        Responsable r2 = new Responsable("Laura Pérez", "30111222", "3815552222");
        responsables.add(r1);
        responsables.add(r2);
    }
    
    private static void inicializarSucursales(){
        Sucursal s1 = new Sucursal("SUC01", "Av. Belgrano 1200", "Tucumán", responsables.get(0));
        Sucursal s2 = new Sucursal("SUC02", "San Martín 450", "Yerba Buena", responsables.get(1));
        
        sucursales.add(s1);
        sucursales.add(s2);
    }
    
    public static void inicializarVehiculo(String tipo, String marca, String patente, String modelo, int anio, int carga, String suc, double kwh, double litros, double extra){
        Sucursal s1 = sucursales.get(0);
        Sucursal s2 = sucursales.get(1);
        
        Marca m1 = new Marca(marca);
        
        if(tipo.equals("Electrico")){
            if(suc.equals("Sucursal1")){
                VehiculoElectrico v1 = new VehiculoElectrico(patente, m1, modelo, anio, carga, s1, kwh);
                vehiculos.add(v1);
            }else{
                VehiculoElectrico v1 = new VehiculoElectrico(patente, m1, modelo, anio, carga, s2, kwh);
                vehiculos.add(v1);
            }
            
        }else{
            if(suc.equals("Sucursal1")){
                VehiculoCombustible v1 = new VehiculoCombustible(patente, m1, modelo, anio, carga, s1, litros, extra);
                vehiculos.add(v1);
            }else{
                VehiculoCombustible v1 = new VehiculoCombustible(patente, m1, modelo, anio, carga, s2, litros, extra);
                vehiculos.add(v1);
            }
        }
    }
    
    public static ArrayList<Vehiculo> getVehiculos(){
        return vehiculos;
    }
    
    public static Optional<Vehiculo> getVehiculo(String patente){
        return vehiculos.stream()
                .filter(v -> v.getPatente().equals(patente))
                .findFirst();
    }
    
    public static void inicializar(){
        inicializarResponsables();
        inicializarSucursales();
    }
}
