package consultoria;

public class Teste {
    public static void main(String[] args) {
        Consultoria consultoria = new Consultoria("Elera" , 2);

        Dev dev01 = new Dev("Ewerton" , 5.00 , 40.00);

        DevMobile dev02 = new DevMobile("Lucas" , 50.00 , 4.00, 4 , 80.00);


        consultoria.contratar_dev(dev01);
        consultoria.contratar_dev(dev02);


        System.out.println(consultoria.getQuantidadeDevs());
        System.out.println(consultoria.getQuantidadeDevsMobile());
        System.out.println(consultoria.getTotalSalarios());
        System.out.println(consultoria.DevPorNome("Ewerton"));
    }
}
