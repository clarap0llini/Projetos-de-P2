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
    public void mostrardados(boolean exibir_cp_ou_cl) {
        super.mostrardados();
        if (exibir_cp_ou_cl) {
            double cavalosPotencia = cilindradas / 15.0;
            System.out.printf("Potência Estimada: %.2f HP%n", cavalosPotencia);
        } else {
            System.out.println("Cilindradas: " + cilindradas);
        }
    }}