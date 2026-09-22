import javax.swing.JOptionPane;

public class peixe extends animal {

    private String corEscama;
    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
         JOptionPane.showMessageDialog(null,"comendo algas,","Alimentação,",1);  

    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null,"glub glub,","som,",2);  

        
    }

    @Override
    public void locomover() {
        JOptionPane.showMessageDialog(null,"nadando,","locomoção",3);  

        
    }
    public void soltarBolha(){}
}
