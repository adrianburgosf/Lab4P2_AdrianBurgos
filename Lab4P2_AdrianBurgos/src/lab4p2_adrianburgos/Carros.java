package lab4p2_adrianburgos;

public class Carros {
    private String modelo;
    private String VIN;
    private String carroceria;
    private int pasajeros;
    private int maleterolts;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getMaleterolts() {
        return maleterolts;
    }

    public void setMaleterolts(int maleterolts) {
        this.maleterolts = maleterolts;
    }
    
    public int calculo() {
        return 0;
    }
    
    public void modificar() {
    }

    @Override
    public String toString() {
        return "Carros{" + "modelo=" + modelo + ", VIN=" + VIN + ", carroceria=" + carroceria + ", pasajeros=" + pasajeros + ", maleterolts=" + maleterolts + '}';
    }
}
