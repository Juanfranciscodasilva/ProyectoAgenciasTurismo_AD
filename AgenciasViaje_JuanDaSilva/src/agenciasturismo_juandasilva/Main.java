package agenciasturismo_juandasilva;

import BBDD.BD_INTERMEDIARIO;
import Enum.EnumAgencias;
import Ventanas.VPrincipal;
import Ventanas.VSeleccionAgencia;
import Clases.Agencia;
import Clases.Cliente;
import Clases.Empleado;
import Clases.Response;
import Ventanas.VCrearCliente;
import Ventanas.VCrearEmpleado;
import Ventanas.VDatosAgencia;

public class Main {
    
    public static VSeleccionAgencia vSeleccionAgencia;
    public static VPrincipal vPrincipal;
    public static VDatosAgencia vDatosAgencia;
    public static VCrearCliente vCrearCliente;
    public static VCrearEmpleado vCrearEmpleado;
    
    public static EnumAgencias agenciaSeleccionada;

    public static void main(String[] args) throws Exception  {
        
//        MYSQL_AgenciaBD bdMysql = new MYSQL_AgenciaBD();
//          DB4O_AgenciaBD bdDB4O = new DB4O_AgenciaBD();
//          SQLITE_AgenciaBD sqlite = new SQLITE_AgenciaBD();
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
    
    public static void abrirVentanaDatosAgencia(){
        vPrincipal.setVisible(false);
        vPrincipal.dispose();
        Agencia agencia = BD_INTERMEDIARIO.obtenerAgencia(agenciaSeleccionada);
        vDatosAgencia = new VDatosAgencia(agencia);
        vDatosAgencia.setVisible(true);
    }
    
    public static void cerrarVentanaDatosAgencia(){
        vPrincipal = new VPrincipal(agenciaSeleccionada);
        vPrincipal.setVisible(true);
        vDatosAgencia.setVisible(false);
        vDatosAgencia.dispose();
    }
    
    public static void abrirCrearCliente(){
        vPrincipal.setVisible(false);
        vPrincipal.dispose();
        vCrearCliente = new VCrearCliente();
        vCrearCliente.setVisible(true);
    }
    
    public static void cerrarCrearCliente(){
        vPrincipal = new VPrincipal(agenciaSeleccionada);
        vPrincipal.setVisible(true);
        vCrearCliente.setVisible(false);
        vCrearCliente.dispose();
    }
    
    public static void abrirCrearEmpleado(){
        vPrincipal.setVisible(false);
        vPrincipal.dispose();
        vCrearEmpleado = new VCrearEmpleado();
        vCrearEmpleado.setVisible(true);
    }
    
    public static void cerrarCrearEmpleado(){
        vPrincipal = new VPrincipal(agenciaSeleccionada);
        vPrincipal.setVisible(true);
        vCrearEmpleado.setVisible(false);
        vCrearEmpleado.dispose();
    }
    
    public static void cerrarPrograma(){
        System.exit(0);
    }
    
    public static Response insertarCliente(Cliente cli){
        //TODO mandar a insertar a BD
        return new Response();
    }
    
    public static Response insertarEmpleado(Empleado emple){
        //TODO mandar a insertar a BD
        return new Response();
    }
    
}
