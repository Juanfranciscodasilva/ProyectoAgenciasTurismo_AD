package agenciasturismo_juandasilva;

import BBDD.DB4O_AgenciaBD;
import Enum.EnumAgencias;
import Ventanas.VPrincipal;
import Ventanas.VSeleccionAgencia;
import BBDD.MYSQL_AgenciaBD;
import BBDD.SQLITE_AgenciaBD;

public class Main {
    
    public static VSeleccionAgencia vSeleccionAgencia;
    public static VPrincipal vPrincipal;
    
    public static EnumAgencias agenciaSeleccionada;

    public static void main(String[] args) throws Exception  {
        
//        MYSQL_AgenciaBD bdMysql = new MYSQL_AgenciaBD();
//          DB4O_AgenciaBD bdDB4O = new DB4O_AgenciaBD();
          SQLITE_AgenciaBD sqlite = new SQLITE_AgenciaBD();
//        vSeleccionAgencia = new VSeleccionAgencia();
//        vSeleccionAgencia.setVisible(true);
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
