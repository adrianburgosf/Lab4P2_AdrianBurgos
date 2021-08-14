package lab4p2_adrianburgos;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_AdrianBurgos {
    static ArrayList <Carros> lista = new ArrayList();
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) throws Excepcion {
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("");
            System.out.print("=========Menu=========\n"
                    + "1. Crear un carro\n"
                    + "2. Modificar un carro\n"
                    + "3. Eliminar un carro\n"
                    + "4. Mostrar todos los vehiculos creados\n"
                    + "5. Calcular\n"
                    + "6. Salir\n"
                    + "Ingrese una opcion: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("");
                    System.out.print("====Carros====\n"
                            + "1) Combustion\n"
                            + "2) Hibrido\n"
                            + "3) HibridoE\n"
                            + "4) Electrico\n"
                            + "Ingrese que tipo de carro desea crear: ");
                    int index = scan.nextInt();
                    crearCarro(index);
                    break;
                }
                case 2: {
                    System.out.print("Ingrese index del carro que desea modificar: ");
                    int index = scan.nextInt();
                    if (index < 0 || index >= lista.size()) {
                        System.out.println("Index invalida");
                        break;
                    }
                    else {
                        if (lista.get(index) instanceof Combustion) {
                            combustion(index);
                        }
                        else if(lista.get(index) instanceof Hibrido) {
                            hibrido(index);
                        }
                        else if(lista.get(index) instanceof HibridoE) {
                            hibridoe(index);
                        }
                        else if(lista.get(index) instanceof Electrico) {
                            electrico(index);
                        }
                        else System.out.println("Clase no encontrada");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Ingrese el index del carro que desea eliminar: ");
                    int index = scan.nextInt();
                    System.out.println("Se elimino carro con VIN: "+lista.get(index).getVIN());
                    lista.remove(index);
                    break;
                }
                case 4: {
                    System.out.println();
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.print(i+") "+lista.get(i));
                        System.out.println();
                        System.out.println();
                    }
                    break;
                }
                case 5: {
                    System.out.print("Ingrese index del carro que desea calcular: ");
                    int index = scan.nextInt();
                    int calculo = ((Carros) lista.get(index)).calculo();
                    while (calculo <= 30) {
                        try {
                            throw new Excepcion();
                        } 
                        catch (Excepcion e) {
                            System.out.println(e.getMessage());
                            ((Carros) lista.get(index)).modificar();
                            calculo = ((Carros) lista.get(index)).calculo();
                        }
                    }
                    System.out.println("Carro con VIN: " + ((Carros) lista.get(index)).getVIN() + ", tendra " + calculo + " Dias sin fallos");
                    break;
                }
                case 6: {
                    System.out.println("Tenga un buen dia!");
                    break;
                }
                default: System.out.println("Opcion no valida");
            }
        }
    }
    
    public static void crearCarro(int index) {
        switch (index) {
            case 1: {
                System.out.println();
                Combustion c = new Combustion();
                System.out.print("Ingrese modelo: ");
                String Borrador = scan.nextLine();
                c.setModelo(scan.nextLine());
                System.out.print("Ingrese VIN: ");
                c.setVIN(scan.nextLine());
                System.out.print("Ingrese Carroceria: ");
                c.setCarroceria(scan.nextLine());
                System.out.print("Ingrese cantidad de pasajeros: ");
                c.setPasajeros(scan.nextInt());
                System.out.print("Ingrese capacidad de maletero: ");
                c.setMaleterolts(scan.nextInt());
                System.out.print("Ingrese consumo de combustible(KPL): ");
                c.setConsumocombus(scan.nextInt());
                System.out.print("Ingrese duracion del aceite: ");
                c.setDuracionaceite(scan.nextInt());
                System.out.print("Ingrese velocidad maxima: ");
                c.setVelocidad(scan.nextInt());
                System.out.print("Ingrese tipo de cambio[Automatico/Manual]: ");
                Borrador = scan.nextLine();
                c.setCambio(scan.nextLine());
                lista.add(c);
                break;
            }
            case 2: {
                System.out.println();
                Hibrido h = new Hibrido();
                System.out.print("Ingrese modelo: ");
                String Borrador = scan.nextLine();
                h.setModelo(scan.nextLine());
                System.out.print("Ingrese VIN: ");
                h.setVIN(scan.nextLine());
                System.out.print("Ingrese Carroceria: ");
                h.setCarroceria(scan.nextLine());
                System.out.print("Ingrese cantidad de pasajeros: ");
                h.setPasajeros(scan.nextInt());
                System.out.print("Ingrese capacidad de maletero: ");
                h.setMaleterolts(scan.nextInt());
                System.out.print("Ingrese capacidad de la bateria(KWPH): ");
                h.setCapacidaB_KWPH(scan.nextInt());
                System.out.print("Ingrese capacidad del motor(KW): ");
                h.setCapacidadM_KW(scan.nextInt());
                lista.add(h);
                break;
            }
            case 3: {
                System.out.println();
                HibridoE he = new HibridoE();
                System.out.print("Ingrese modelo: ");
                String Borrador = scan.nextLine();
                he.setModelo(scan.nextLine());
                System.out.print("Ingrese VIN: ");
                he.setVIN(scan.nextLine());
                System.out.print("Ingrese Carroceria: ");
                he.setCarroceria(scan.nextLine());
                System.out.print("Ingrese cantidad de pasajeros: ");
                he.setPasajeros(scan.nextInt());
                System.out.print("Ingrese capacidad de maletero: ");
                he.setMaleterolts(scan.nextInt());
                System.out.print("Ingrese cantidad de kilometros en modo electrico: ");
                he.setKmelectrico(scan.nextInt());
                System.out.print("Ingrese cantidad de motores electricos: ");
                he.setMotores(scan.nextInt());
                System.out.print("Ingrese capacidad de remolque: ");
                he.setRemolque(scan.nextInt());
                System.out.print("Ingrese si es 4x4: ");
                Borrador = scan.nextLine();
                String b4x4 = scan.nextLine();
                if (b4x4.equals("si") || b4x4.equals("Si")) {
                    he.setB4x4(true);
                }
                else he.setB4x4(false);
                lista.add(he);
                break;
            }
            case 4: {
                System.out.println();
                Electrico e = new Electrico();
                System.out.print("Ingrese modelo: ");
                String Borrador = scan.nextLine();
                e.setModelo(scan.nextLine());
                System.out.print("Ingrese VIN: ");
                e.setVIN(scan.nextLine());
                System.out.print("Ingrese Carroceria: ");
                e.setCarroceria(scan.nextLine());
                System.out.print("Ingrese cantidad de pasajeros: ");
                e.setPasajeros(scan.nextInt());
                System.out.print("Ingrese capacidad de maletero: ");
                e.setMaleterolts(scan.nextInt());
                System.out.print("Cantidad de kilometros que puede recorrer: ");
                e.setKmrecorrer(scan.nextInt());
                System.out.print("Cantidad de baterias que almacena: ");
                e.setBaterias(scan.nextInt());
                System.out.print("Aceleracion de 0-100KPH (Segundos): ");
                e.setAceleracion(scan.nextInt());
                System.out.print("Tiempo que toma en cargar completo(Minutos): ");
                e.setTiempocarga(scan.nextInt());
                lista.add(e);
                break;
            }
            default: System.out.println("Opcion no valida");
        }
    }
    
    public static void combustion(int index) {
        System.out.println("====Modificar====");
        System.out.print("1) Modelo\n"
                + "2) VIN\n"
                + "3) Carroceria\n"
                + "4) Cantidad de pasajeros\n"
                + "5) Capacidad de maletero\n"
                + "6) Consumo de combustible\n"
                + "7) Duracion del aceite\n"
                + "8) Velocidad maxima\n"
                + "9) Tipo de cambio\n"
                + "Ingrese index de lo que desea modificar: ");
        int indexm = scan.nextInt();
        switch (indexm) {
            case 1,2,3,4,5: {
                mainmodificaciones(index, indexm);
                break;
            }
            case 6: {
                System.out.print("Ingrese nuevo consumo de combustible: ");
                ((Combustion)lista.get(index)).setConsumocombus(scan.nextInt());
                break;
            }
            case 7: {
                System.out.print("Ingrese nueva duracion del aceite: ");
                ((Combustion)lista.get(index)).setDuracionaceite(scan.nextInt());
                break;
            }
            case 8: {
                System.out.print("Ingrese nueva velocidad maxima: ");
                ((Combustion)lista.get(index)).setConsumocombus(scan.nextInt());
                break;
            }
            case 9: {
                System.out.print("Ingrese nuevo tipo de cambio: ");
                String borrador = scan.nextLine();
                ((Combustion)lista.get(index)).setCambio(scan.nextLine());
                break;
            }
            default: System.out.println("Opcion invalida");
        }
    }
    
    public static void hibrido(int index) {
        System.out.println("====Modificar====");
        System.out.print("1) Modelo\n"
                + "2) VIN\n"
                + "3) Carroceria\n"
                + "4) Cantidad de pasajeros\n"
                + "5) Capacidad de maletero\n"
                + "6) Capacidad de la bateria\n"
                + "7) Capacidad del motor\n"
                + "Ingrese index de lo que desea modificar: ");
        int indexm = scan.nextInt();
        switch (indexm) {
            case 1,2,3,4,5: {
                mainmodificaciones(index, indexm);
                break;
            }
            case 6: {
                System.out.print("Ingrese nueva capacidad de la bateria(KWPH): ");
                ((Hibrido)lista.get(index)).setCapacidaB_KWPH(scan.nextInt());
                break;
            }
            case 7: {
                System.out.print("Ingrese nueva capacidad del motor(KW): ");
                ((Hibrido)lista.get(index)).setCapacidadM_KW(scan.nextInt());
                break;
            }
            default: System.out.println("Opcion invalida");
        }
    }
    
    public static void hibridoe(int index) {
        System.out.println("====Modificar====");
        System.out.print("1) Modelo\n"
                + "2) VIN\n"
                + "3) Carroceria\n"
                + "4) Cantidad de pasajeros\n"
                + "5) Capacidad de maletero\n"
                + "6) Cantidad de kilometros en modo electrico\n"
                + "7) Cantidad de motores electricos\n"
                + "8) Capacidad de remolque\n"
                + "9) 4x4\n"
                + "Ingrese index de lo que desea modificar: ");
        int indexm = scan.nextInt();
        switch (indexm) {
            case 1,2,3,4,5: {
                mainmodificaciones(index, indexm);
                break;
            }
            case 6: {
                System.out.print("Ingrese nueva cantidad de kilometros en modo electrico): ");
                ((HibridoE)lista.get(index)).setKmelectrico(scan.nextInt());
                break;
            }
            case 7: {
                System.out.print("Ingrese nueva cantidad de motores electricos: ");
                ((HibridoE)lista.get(index)).setMotores(scan.nextInt());
                break;
            }
            case 8: {
                System.out.print("Ingrese nueva capacidad de remolque: ");
                ((HibridoE)lista.get(index)).setRemolque(scan.nextInt());
                break;
            }
            case 9: {
                System.out.print("Ingrese si el carro es 4x4[Si/No]: ");
                String Borrador = scan.nextLine();
                String b4x4 = scan.nextLine();
                if (b4x4.equals("si") || b4x4.equals("Si")) {
                    ((HibridoE)lista.get(index)).setB4x4(true);
                }
                else ((HibridoE)lista.get(index)).setB4x4(false);
                break;
            }
            default: System.out.println("Opcion invalida");
        }
    }
    
    public static void electrico(int index) {
        System.out.println("====Modificar====");
        System.out.print("1) Modelo\n"
                + "2) VIN\n"
                + "3) Carroceria\n"
                + "4) Cantidad de pasajeros\n"
                + "5) Capacidad de maletero\n"
                + "6) Cantidad de kilometros que puede recorrer\n"
                + "7) Cantidad de baterias que almacena\n"
                + "8) Aceleracion\n"
                + "9) Tiempo de carga\n"
                + "Ingrese index de lo que desea modificar: ");
        int indexm = scan.nextInt();
        switch (indexm) {
            case 1,2,3,4,5: {
                mainmodificaciones(index, indexm);
                break;
            }
            case 6: {
                System.out.print("Ingrese nueva cantidad de kilometros que puede recorrer: ");
                ((Electrico)lista.get(index)).setKmrecorrer(scan.nextInt());
                break;
            }
            case 7: {
                System.out.print("Ingrese nueva cantidad de baterias que almacena: ");
                ((Electrico)lista.get(index)).setBaterias(scan.nextInt());
                break;
            }
            case 8: {
                System.out.print("Ingrese nueva aceleracion: ");
                ((Electrico)lista.get(index)).setAceleracion(scan.nextInt());
                break;
            }
            case 9: {
                System.out.print("Ingrese nuevo tiempo de carga: ");
                ((Electrico)lista.get(index)).setTiempocarga(scan.nextInt());
                break;
            }
            default: System.out.println("Opcion invalida");
        }
    }
    
    public static void mainmodificaciones(int index, int indexm) {
        switch (indexm) {
            case 1: {
                System.out.print("Ingrese nuevo modelo: ");
                String Borrador = scan.nextLine();
                ((Carros)lista.get(index)).setModelo(scan.nextLine());
                break;
            }
            case 2: { 
                System.out.print("Ingrese nuevo VIN: ");
                ((Carros)lista.get(index)).setVIN(scan.nextLine());
                break;
            }
            case 3: { 
                System.out.print("Ingrese nueva carroceria: ");
                ((Carros)lista.get(index)).setCarroceria(scan.nextLine());
                break;
            }
            case 4: { 
                System.out.print("Ingrese nueva cantidad de pasajeros: ");
                ((Carros)lista.get(index)).setPasajeros(scan.nextInt());
                break;
            }
            case 5: { 
                System.out.print("Ingrese nueva capacidad de maletero: ");
                ((Carros)lista.get(index)).setMaleterolts(scan.nextInt());
                break;
            }
        }
    }
}
