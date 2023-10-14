public class Whatsapp {
    public static void main(String[] args) {
        Contato contato = new Contato("Ewerton" , "40028922");
        Contato contato2 = new Contato("Paulo" , "40028983");
        Contato contato3 = new Contato("Reis" , "40028920");

        Grupo grupoDoFut = new Grupo("Girias do delicio");
        grupoDoFut.adicionar(contato);
        grupoDoFut.adicionar(contato2);
        grupoDoFut.adicionar(contato3);

        Grupo grupoDoDota = new Grupo("Vixi mané perdeu");
        grupoDoDota.adicionar(contato);
        grupoDoDota.adicionar(contato2);
        grupoDoDota.adicionar(contato3);

    }
}
