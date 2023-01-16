import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class LineChartExample extends ApplicationFrame {

   public LineChartExample(String title) {
      super(title);
      XYDataset dataset = createDataset();
      JFreeChart chart = ChartFactory.createXYLineChart(
         "Line Chart Example", 
         "X-Axis", "Y-Axis", 
         dataset
      );
      ChartPanel panel = new ChartPanel(chart);
      panel.setPreferredSize(new java.awt.Dimension(560, 367));
      setContentPane(panel);
   }

   private XYDataset createDataset() {
      XYSeries series = new XYSeries("Data");
      series.add(1, 2);
      series.add(2, 3);
      series.add(3, 2);
      series.add(4, 5);
      series.add(5, 6);
      XYSeriesCollection dataset = new XYSeriesCollection();
      dataset.addSeries(series);
      return dataset;
   }

   public static void main(String[] args) {
      LineChartExample chart = new LineChartExample("Line Chart Example");
      chart.pack();
      RefineryUtilities.centerFrameOnScreen(chart);
      chart.setVisible(true);
   }
}
