package Reto1_Clase8;

public class DialogoTexto implements GestorDialogo {
    public void mostrarDialogo(PaqueteNarrativo paquete) {
        //Insertar el Get
        System.out.println("Escena actual: " + paquete.getEscenaActual());
        System.out.println("Una figura misteriosa aparece y te ofrece dos caminos...");
    }
}
