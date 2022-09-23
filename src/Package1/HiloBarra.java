
package Package1;

import javax.swing.JProgressBar;

public class HiloBarra implements Runnable{

    private JProgressBar barra;
    private double total;

    public HiloBarra(JProgressBar barra, double total) {
        this.barra = barra;
        this.total = total;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
    @Override
    public void run() {
        int cont =0;
        while (cont<total) {            
            barra.setValue(barra.getValue()+1);
            barra.setString(Integer.toString(barra.getValue()) + "%");
            try {
                Thread.sleep(1000);
                cont+=1000;
            } catch (InterruptedException e) {
            }
            
        }
    }

}
