public class Carro extends Veiculo {
    private int numportas;

    public Carro (String placa, String marca, double preco, int numportas){
        super(placa, marca, preco);
        this.numportas = numportas;
    }
    public void mostrardados(){
        super.mostrardados();
        System.out.println("Numero de portas: " + numportas);
    }
    public void mostrardados(boolean exibirportas){
        super.mostrardados();
        if (exibirportas) {
            System.out.println("Numero de portas: " + numportas);
        } else{
            System.out.println("Numero de portas: Privado");
        }

    }
}
