package lab4p2_adrianburgos;
import java.util.Scanner;

public class HibridoE extends Carros{
    static Scanner scan = new Scanner(System.in);
    
    private int kmelectrico;
    private int motores;
    private int remolque;
    private boolean b4x4;

    public int getKmelectrico() {
        return kmelectrico;
    }

    public void setKmelectrico(int kmelectrico) {
        this.kmelectrico = kmelectrico;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getRemolque() {
        return remolque;
    }

    public void setRemolque(int remolque) {
        this.remolque = remolque;
    }

    public boolean isB4x4() {
        return b4x4;
    }

    public void setB4x4(boolean b4x4) {
        this.b4x4 = b4x4;
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
        System.out.print("Ingrese cantidad de kilometros en modo electrico: ");
        setKmelectrico(scan.nextInt());
        System.out.print("Ingrese cantidad de motores electricos: ");
        setMotores(scan.nextInt());
        System.out.print("Ingrese capacidad de remolque: ");
        setRemolque(scan.nextInt());
        System.out.print("Ingrese si es 4x4: ");
        String Borrador = scan.nextLine();
        String b4x4 = scan.nextLine();
        if (b4x4.equals("si") || b4x4.equals("Si")) {
            setB4x4(true);
        } else
            setB4x4(false);
    }
    
    @Override
    public int calculo() {
        int resultado = 2021 - (super.getPasajeros()*motores)+((kmelectrico)/remolque);
        return resultado;
    }
    
    @Override
    public String toString() {
        return "Modelo: "+super.getModelo()+" \nVIN: "+super.getVIN()
                +"\nCarroceria: "+super.getCarroceria()+"\nCantidad de pasajeros: "+super.getPasajeros()
                +"\nCapacidad del maletero: "+super.getMaleterolts()+" litros"+"\nCantidad de kilometros en modo electrico: "+kmelectrico
                +"\nCantidad de motores electricos: "+motores+"\nCapacidad de remolque: "+remolque+" toneladas"
                +"\n4x4?: "+b4x4;
    }
}
