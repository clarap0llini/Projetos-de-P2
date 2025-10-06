public class Veiculo {
    private String placa;
    private String marca;
    private double preco;

    public Veiculo (String placa, String marca, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }

    public void mostrardados() {
        System.out.println("Dados do veiculo");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
    }

    public void mostrardados(double descontopercentual){
        double preco_com_desconto = preco *(1 - (descontopercentual/100.0));
        System.out.println("Dados após desconto");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.printf("Preço Original: R$ %.2f%n", preco);
        System.out.printf("Desconto Aplicado: %.2f%%%n", descontopercentual);
        System.out.printf("Preço Final: R$ %.2f%n", preco_com_desconto);
    }
}
