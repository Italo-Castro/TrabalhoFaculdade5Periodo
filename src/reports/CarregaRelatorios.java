/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reports;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import projetoconsultório.Util.Conexao;


/**
 *
 * @author cristinamaria
 */
public class CarregaRelatorios {
    
    //public void gerarRelatorio(String relatorio, Map<String,Object> parameters)
    public void gerarRelatorio(String relatorio, String parametro) {
        try {
            Conexao conexao = new Conexao();
            conexao.conectar();
            //CARREGA JRXML
            JasperReport jasperReport = JasperCompileManager.compileReport(new File(relatorio).getAbsolutePath());
            
            //PASSAGEM DE PARAMETROS
            Map<String, Object> parameters = new HashMap<>();
            if(!parametro.equals("")   ) {
                parameters.put("valor",Integer.parseInt(parametro));
                System.out.print("to ak dentro do if por que tem parametro nessa poraa");
            }
            else {
                JOptionPane.showMessageDialog(null,"Relatorio sem filtro");
            }
            //COMPILA EM ARQUIVO JASPER
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conexao.con);
            
            //ABRE JANELA DE VISUALIZAÇÃO
            JasperViewer viewer = new JasperViewer(jasperPrint, true);
            viewer.setVisible(true);
            
            //EXPORTA ARQUIVO JASPER EM PDF - SE FOR NECESSARIO!
            //JasperExportManager.exportReportToPdfFile(jasperPrint, "Relatorio.pdf");
            
        } catch (JRException ex) {
            Logger.getLogger(CarregaRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
