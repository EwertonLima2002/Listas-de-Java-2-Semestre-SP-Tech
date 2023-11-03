package consultoria;

public class DevMobile extends Dev{

    private  Integer qtdHorasMobile;

    private Double valorHoraMobile;
    public DevMobile(String nome, Double qtdHoras, Double valorHora, Integer qtdHorasMobile,
                     Double valorHoraMobile) {
        super(nome, qtdHoras, valorHora);
        this.qtdHorasMobile = qtdHorasMobile;
        this.valorHoraMobile = valorHoraMobile;
    }

    @Override
    public Double getSalario() {
        return (super.getSalario() + this.valorHoraMobile * this.qtdHorasMobile);
    }

    @Override
    public String toString() {
        return "Dados do Dev Mobile" +
                "qtdHorasMobile=" + qtdHorasMobile +
                ", valorHoraMobile=" + valorHoraMobile;
    }
}
