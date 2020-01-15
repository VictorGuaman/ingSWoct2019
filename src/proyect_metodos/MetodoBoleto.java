package proyect_metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyect_clases.Boleto;
import proyect_clases.Pasajero;
import proyect_clases.Usuario;
import proyect_gui.GUI_Principal;
import proyect_gui.GUI_VentaDeBoletos;

public class MetodoBoleto {
    Vector vPrincipal = new Vector();
    
    public void crearBoleto(Boleto unBoleto) {
        
        vPrincipal.addElement(unBoleto);
        
    }
    
    public void guardarBoleto(Boleto unBoleto) {
        vPrincipal.addElement(unBoleto);
    }
    
    //guardar archivo txt
    public void guardarArchivoBoleto(Boleto unBoleto){
        
        try {
            FileWriter fw = new FileWriter (".\\Boleto.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(unBoleto.getNumero_boleto());
            pw.print("|"+unBoleto.getFecha_boleto());
            pw.print("|"+unBoleto.getHora_boleto());
            pw.print("|"+unBoleto.getCosto_boleto());
            pw.close();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
        //FALTA
        
    }

    public void BuscarBoleto(Usuario unUsuario){
      
        //FALTA
        
    }
    
}
