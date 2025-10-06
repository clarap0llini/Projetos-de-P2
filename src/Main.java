import java.util.Scanner;
import java.util.List;
import  java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> veiculos_cadastrados = new ArrayList<>();
        System.out.println("Cadastro de Veiculos");
        boolean continuar_cadastro = true;
        while (continuar_cadastro) {System.out.println("Opções de Cadastro");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Cadastrar Moto");
            System.out.println("3. Cadastrar Caminhão");
            System.out.println("4. Encerrar e Mostrar Resultados");
            System.out.print("Escolha uma opção: ");
            if (scanner.hasNextInt()){
                int opcao = scanner.nextInt();
                scanner.nextLine();
                if (opcao == 4){
                    continuar_cadastro = false;
                    break;
                }if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0){
                    System.out.println("Por favor, tente uma opção válida");
                }
                Veiculo novoveiculo = null;
                System.out.println("Digite a placa: ");
                String placa = scanner.nextLine();
                System.out.print("Digite a Marca: ");
                String marca = scanner.nextLine();

                double preco = 0.0;
                System.out.print("Digite o Preço: R$ ");
                if (scanner.hasNextDouble()) {
                    preco = scanner.nextDouble();
                } else{
                    System.out.println("ERRO: Preço inválido. Tente novamente.");
                    scanner.nextLine();
                    continue;
                }
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o numero de portas: ");
                        int numportas = scanner.nextInt();
                        scanner.nextLine();
                        novoveiculo = new Carro(placa, marca, preco, numportas);
                        break;
                    case 2:
                        System.out.println("Digite as cilindradas: ");
                        int cilincradas = scanner.nextInt();
                        scanner.nextLine();
                        novoveiculo = new Moto(placa, marca, preco, cilincradas);
                        break;
                    case 3:
                        System.out.print("Digite a capacidade a carga(toneladas)");
                        double capacidadeCarga = scanner.nextDouble();
                        scanner.nextLine();
                        novoveiculo = new Caminhao(placa, marca, preco, capacidadeCarga);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        continue;
                }
                if (novoveiculo != null) {
                    veiculos_cadastrados.add(novoveiculo);
                    System.out.println("Veiculo cadastrado com êxito!!");
                }else{
                    System.out.println("Entrada inválida. Tente novamente.");
                    scanner.nextLine();
                }
                System.out.println("### TODOS OS VEÍCULOS CADASTRADOS ###");
                if(veiculos_cadastrados.isEmpty()){
                    System.out.println("Nenhum veiculo cadastrado.");
                }else{
                    int contador = 1;
                    for (Veiculo veiculo : veiculos_cadastrados) {
                        System.out.println("Veículo " + contador++ + " ***");
                        veiculo.mostrardados();
                        if (veiculo instanceof Carro) {
                            ((Carro) veiculo).mostrardados(false);
                        } else if (veiculo instanceof Moto) {
                            ((Moto) veiculo).mostrardados(true); // Mostrar em HP
                        } else if (veiculo instanceof Caminhao) {
                            ((Caminhao) veiculo).mostrardados(10.0); // Usando a sobrecarga da Superclasse (desconto)
                            ((Caminhao) veiculo).mostrardados(true); // Mostrar capacidade em kg
                        }
                        scanner.close();
                        System.out.println("O sistema foi encerrado");
                    }
                }
            }
        }
    }
}