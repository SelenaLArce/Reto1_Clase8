package Reto1_Clase8;

public static void main(String[] args) {
        // Simulación inicial
        PaqueteNarrativo paquete = new PaqueteNarrativo("Inicio del viaje");

public class PaqueteNarrativo {
    private String escenaActual;

    public PaqueteNarrativo(String escenaActual) {
        this.escenaActual = escenaActual;
    }

    public String getEscenaActual() {
        return escenaActual;
    }

    public void setEscenaActual(String nuevaEscena) {
        this.escenaActual = nuevaEscena;
    }
}

public interface TransicionHistoria {
    void realizarTransicion(String decision);
}

public interface GestorDialogo {
    void mostrarDialogo(PaqueteNarrativo paquete);
}

public interface LogicaDecision {
    String tomarDecision();
}
