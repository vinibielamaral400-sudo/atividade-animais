public class App {
    public static void main(String[] args) throws Exception {
        mamifero m = new mamifero();
        m.setPeso(12.5f);
        m.setIdade(3);
        m.setMembros(4);
        m.setCorPelo("marrom");
        m.locomover();
        m.alimentar();
        m.emitirSom();

        aves a = new aves();
        a.setPeso(0.5f);
        a.setIdade(1);
        a.setMembros(2);
        a.setCorPena("branca");
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        peixe p = new peixe();
        p.setPeso(0.2f);
        p.setIdade(1);
        p.setMembros(0);
        p.setCorEscama("dourado");
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        reptil r = new reptil();
        r.setPeso(2.0f);
        r.setIdade(4);
        r.setMembros(4);
        r.setCorEscama("verde");
        r.locomover();
        r.alimentar();
        r.emitirSom();
    }
}
