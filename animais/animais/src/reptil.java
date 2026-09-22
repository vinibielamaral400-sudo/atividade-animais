import javax.swing.JOptionPane;

public class reptil extends animal {

    private String corEscama;
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null,"comendo vegetais,","Alimentação,",1);  
    }
    

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null,"rugindo,","som,",2);  
    }

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null,"rasteijando,","locomoção",3);  
    }
    }
    

