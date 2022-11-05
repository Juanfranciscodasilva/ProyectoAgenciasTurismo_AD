package BBDD;

import Clases.Agencia;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Date;

public class DB4O_AgenciaBD {
    
    final static String BDPer = "ad_agenciaTurismo.yap";
    
    public DB4O_AgenciaBD(){
        ObjectContainer db= Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),BDPer);
//        Agencia agencia = new Agencia(1,"Viajes Eroski",new Date(),"C/ ejemplo calle 2");
//        db.store(agencia);
        ObjectSet<Agencia> result = db.queryByExample(new Agencia());

        while (result.hasNext()) {
            Agencia age = result.next();
            System.out.println("------------Agencia---------------");
            System.out.println(age.getId());
            System.out.println(age.getNombre());
            System.out.println(age.getFecha_apertura());
            System.out.println(age.getDireccion());
            System.out.println("----------------------------------------------------\n");
        }
        db.close();
    }
}
