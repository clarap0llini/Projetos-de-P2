public class Caminhao extends Veiculo{
    private double capacidadecarga;

    public Caminhao(String placa, String marca, double preco, double capacidadecarga){
        super(placa, marca, preco);
        this.capacidadecarga = capacidadecarga;
    }
    public void mostrardados() {
        super.mostrardados();
        System.out.printf("Capacidade de Carga: %.2f toneladas%n", capacidadecarga);
    }
    public void mostrardados(boolean capacidade_em_ton_ou_kg){
        super.mostrardados();
        if (capacidade_em_ton_ou_kg) {
            double capacidadecargakg = capacidadecarga * 1000.0;
            System.out.printf("Capacidade de Carga: %.2f kg%n", capacidadecargakg);
        } else {
            System.out.printf("Capacidade de carga %.2f toneladas%n", capacidadecarga);

        }
    }

}

