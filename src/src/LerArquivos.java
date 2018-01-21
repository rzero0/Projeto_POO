import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LerArquivos {
	public static void main (String[]args){
      try{
    	  BufferedReader br = new BufferedReader(new FileReader("c:/leiturasTeste.txt"));
         while(br.ready()){
            String linha = br.readLine();
            System.out.println(linha);
         }
         br.close();
      }catch(IOException ioe){
         ioe.printStackTrace();
      }
      
      
      DefaultCategoryDataset ds = new DefaultCategoryDataset();
      ds.addValue(40.5, "maximo", "dia 1");
      ds.addValue(38.2, "maximo", "dia 2");
      ds.addValue(37.3, "maximo", "dia 3");
      ds.addValue(31.5, "maximo", "dia 4");
      ds.addValue(35.7, "maximo", "dia 5");
      ds.addValue(42.5, "maximo", "dia 6");

      JFreeChart grafico = ChartFactory.createLineChart("Meu Grafico", "Dia", 
          "Valor", ds, PlotOrientation.VERTICAL, true, true, false);
   }
}
