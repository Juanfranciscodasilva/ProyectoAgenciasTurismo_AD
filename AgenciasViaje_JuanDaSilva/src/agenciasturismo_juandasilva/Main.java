package agenciasturismo_juandasilva;

import Enum.EnumAgencias;
import Ventanas.VPrincipal;
import Ventanas.VSeleccionAgencia;

public class Main {
    
    public static VSeleccionAgencia vSeleccionAgencia;
    public static VPrincipal vPrincipal;
    
    public static EnumAgencias agenciaSeleccionada;

    public static void main(String[] args) {
        System.out.println("test");
        vSeleccionAgencia = new VSeleccionAgencia();
        vSeleccionAgencia.setVisible(true);
    }
    
    public static void SeleccionarAgencia(EnumAgencias agencia){
        agenciaSeleccionada = agencia;
        abrirVentanaPrincipal();
    }
    
    public static void abrirVentanaPrincipal(){
        vSeleccionAgencia.setVisible(false);
        vSeleccionAgencia.dispose();
        vPrincipal = new VPrincipal(agenciaSeleccionada);
        vPrincipal.setVisible(true);
    }
    
    public static void cerrarSesion(){
        vPrincipal.setVisible(false);
        vPrincipal.dispose();
        vSeleccionAgencia = new VSeleccionAgencia();
        vSeleccionAgencia.setVisible(true);
    }
    
    public static void cerrarPrograma(){
        System.exit(0);
    }
    
}
