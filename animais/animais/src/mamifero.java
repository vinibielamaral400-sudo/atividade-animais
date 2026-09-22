import javax.swing.JOptionPane;

public class mamifero extends animal {
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null,"comendo,","tomar leite,",2);  
    }
    

    

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
    JOptionPane.showMessageDialog(null,"Correndo,","locomoção,",1);    
    }
    
}