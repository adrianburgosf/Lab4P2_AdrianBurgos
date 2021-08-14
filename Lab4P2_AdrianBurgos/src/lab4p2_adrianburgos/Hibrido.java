package lab4p2_adrianburgos;
import java.util.Scanner;

public class Hibrido extends Carros{
    static Scanner scan = new Scanner(System.in);
    
    private int capacidadB_KWPH;
    private int capacidadM_KW;

    public int getCapacidaB_KWPH() {
        return capacidadB_KWPH;
    }

    public void setCapacidaB_KWPH(int capacidadB_KWPH) {
        this.capacidadB_KWPH = capacidadB_KWPH;
    }

    public int getCapacidadM_KW() {
        return capacidadM_KW;
    }

    public void setCapacidadM_KW(int capacidadM_KW) {
        this.capacidadM_KW = capacidadM_KW;
    }
    
    public void modificar() {
        System.out.println("Porfavor modifique su carro para calcular de nuevo");
        System.out.print("Ingrese nuevo modelo: ");
        super.setModelo(scan.nextLine());
        System.out.print("Ingrese nuevo VIN: ");
        super.setVIN(scan.nextLine());
        System.out.print("Ingrese nueva carroceria: ");
        super.setCarroceria(scan.nextLine());
        System.out.print("Ingrese nueva cantidad de pasajeros: ");
        super.setPasajeros(scan.nextInt());
        System.out.print("Ingrese nueva capacidad de maletero: ");
        super.setMaleterolts(scan.nextInt());
        System.out.print("Ingrese capacidad de la bateria(KWPH): ");
        setCapacidaB_KWPH(scan.nextInt());
        System.out.print("Ingrese capacidad del motor(KW): ");
        setCapacidadM_KW(scan.nextInt());
        
    }
    
    @Override
    public int calculo() {
        int resultado = 2021 - (capacidadB_KWPH*super.getMaleterolts())/(super.getPasajeros());
        return resultado;
    }
    
    @Override
    public String toString() {
        return "Modelo: "+super.getModelo()+" \nVIN: "+super.getVIN()
                +"\nCarroceria: "+super.getCarroceria()+"\nCantidad de pasajeros: "+super.getPasajeros()
                +"\nCapacidad del maletero: "+super.getMaleterolts()+" litros"+"\nCapacidad de la bateria: "+capacidadB_KWPH
                +"\nCapacidad del motor electrico: "+capacidadM_KW;
    }
}
