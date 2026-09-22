import javax.swing.JOptionPane;

public class aves extends animal {
    private String corPena;
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null,"comendo grãos e insetos,","Alimentação,",1);  
    
    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null,"cantar,","som,",2);  

    }

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
         JOptionPane.showMessageDialog(null,"voando,","locomoção,",3);    

    }
    public void fazerNinho(){

    }
}
