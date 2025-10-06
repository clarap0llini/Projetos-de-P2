public class Moto extends Veiculo{
    private int cilindradas;
    public Moto(String placa, String marca, double preco, int cilindradas){
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
    }
    public void mostrardados(){
        super.mostrardados();
        System.out.println("Cilindradas: " + cilindradas);
    }
    public void mostrardados(boolean exibir_hp_ou_cc) {
        super.mostrardados();
        if (exibir_hp_ou_cc) {
            double cavalosPotencia = cilindradas / 15.0;
            System.out.printf("Potência Estimada: %.2f HP%n", cavalosPotencia);
        } else {
            System.out.println("Cilindradas: " + cilindradas);
        }
    }}
