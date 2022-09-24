
package Package1;

import javax.swing.JProgressBar;

public class HiloBarra extends Thread {

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
        double mas = total/1000;
        double mas2 = 100/mas;
        while (cont<100) {            
            barra.setValue((int) (barra.getValue()+mas2));
            barra.setString(Integer.toString(barra.getValue()) + "%");
            try {
                Thread.sleep(1000);
                cont+=mas2;
            } catch (InterruptedException e) {
            }
            
        }
    }

}
