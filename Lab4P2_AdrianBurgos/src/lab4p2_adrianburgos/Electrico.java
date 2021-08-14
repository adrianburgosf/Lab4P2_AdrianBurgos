package lab4p2_adrianburgos;
import java.util.Scanner;

public class Electrico extends Carros{
    static Scanner scan = new Scanner(System.in);
    
    private int kmrecorrer;
    private int baterias;
    private int aceleracion;
    private int tiempocarga;

    public int getKmrecorrer() {
        return kmrecorrer;
    }

    public void setKmrecorrer(int kmrecorrer) {
        this.kmrecorrer = kmrecorrer;
    }

    public int getBaterias() {
        return baterias;
    }

    public void setBaterias(int baterias) {
        this.baterias = baterias;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getTiempocarga() {
        return tiempocarga;
    }

    public void setTiempocarga(int tiempocarga) {
        this.tiempocarga = tiempocarga;
    }
    
    public void modificar() {
        System.out.println("Porfavor modifique su carro para calcular de nuevo");
        System.out.print("Ingrese nuevo modelo: ");
        String Borrador = scan.nextLine();
        super.setModelo(scan.nextLine());
        System.out.print("Ingrese nuevo VIN: ");
        super.setVIN(scan.nextLine());
        System.out.print("Ingrese nueva carroceria: ");
        super.setCarroceria(scan.nextLine());
        System.out.print("Ingrese nueva cantidad de pasajeros: ");
        super.setPasajeros(scan.nextInt());
        System.out.print("Ingrese nueva capacidad de maletero: ");
        super.setMaleterolts(scan.nextInt());
        System.out.print("Cantidad de kilometros que puede recorrer: ");
        setKmrecorrer(scan.nextInt());
        System.out.print("Cantidad de baterias que almacena: ");
        setBaterias(scan.nextInt());
        System.out.print("Aceleracion de 0-100KPH (Segundos): ");
        setAceleracion(scan.nextInt());
        System.out.print("Tiempo que toma en cargar completo(Minutos): ");
        setTiempocarga(scan.nextInt());
    }
    
    @Override
    public int calculo() {
        int resultado =2021 - (baterias+((tiempocarga*super.getPasajeros())/aceleracion));
        return resultado;
    }
    
    @Override
    public String toString() {
        return "Modelo: "+super.getModelo()+" \nVIN: "+super.getVIN()
                +"\nCarroceria: "+super.getCarroceria()+"\nCantidad de pasajeros: "+super.getPasajeros()
                +"\nCapacidad del maletero: "+super.getMaleterolts()+" litros"+"\nCantidad de km que puede recorrer: "+kmrecorrer
                +"\nCantidad de baterias que almacena: "+baterias+"\nAceleracion de 0-100KPH: "+aceleracion+" segundos"
                +"\nTiempo para carga completa: "+tiempocarga+" minutos";
    }
}
