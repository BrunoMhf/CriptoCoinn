package imagensprojeto;

import java.awt.Dimension;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficoDeLinha {
	
	public CategoryDataset createDataSet (ArrayList<Price> listaDePrice){

		DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
		
		for(Price price : listaDePrice){
			dataSet.addValue(2, "text", "bitcoin");
		}
		return dataSet;
	}

	public JFreeChart createLineChart(CategoryDataset dataSet) {
		
		JFreeChart graficoLinhas = ChartFactory.createLineChart("Gráfico Bitcoin",
				null,
				"Volume",
				dataSet,
				PlotOrientation.VERTICAL,
				true,
				false,
				false);
		
		return graficoLinhas;
		
		
	}
	
	public ChartPanel criarGrafico(ArrayList<Price> listaDePrice){
		
		CategoryDataset dataSet = this.createDataSet(listaDePrice);
		
		JFreeChart grafico = this.createLineChart(dataSet);
		
		ChartPanel painelDoGrafico = new ChartPanel (grafico);
		painelDoGrafico.setPreferredSize(new Dimension(400, 400));
		
		return painelDoGrafico;
		
	}
}
