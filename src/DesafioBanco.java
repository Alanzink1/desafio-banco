import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();

        double saldoConta = 2500.00;
        String tipoConta = "Corrente";
        boolean loop = true;

        System.out.printf("""
                ***********************
                Dados iniciais do cliente:
                        
                Nome:           %s
                Tipo conta:     %s
                Saldo inicial:  R$ %.2f
                ***********************
                """, nomeUsuario, tipoConta, saldoConta);

        while(loop) {
            System.out.printf("""
                %n%nOperações
                        
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                        
                Digite a opção desejada:
                """);
            int escolhaUsuario = scanner.nextInt();

            switch (escolhaUsuario) {
                case 1:
                    System.out.printf("O saldo atual é de R$ %.2f", saldoConta);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double valorReceber = scanner.nextDouble();
                    saldoConta += valorReceber;
                    System.out.printf("Saldo atualizado R$ %.2f", saldoConta);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double valorTransferir = scanner.nextDouble();
                    if(valorTransferir > saldoConta) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldoConta -= valorTransferir;
                        System.out.printf("Saldo atualizado R$ %.2f", saldoConta);
                    }
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
        System.out.printf("%nObrigado pela preferência!%n       Volte Sempre!");
    }
}

//***********************
//Dados iniciais do cliente:
//
//Nome: Jacqueline Oliveira
//Tipo conta: Corrente
//Saldo inicial: R$ 2500,00
//***********************
//
//Operações
//
//1- Consultar saldos
//2- Receber valor
//3- Transferir valor
//4- Sair
//
//Digite a opção desejada:


//omitido
//
//Digite a opção desejada:
//2
//
//Informe o valor a receber:
//700
//
//Saldo atualizado R$ 3200.0


////omitido
//
//Digite a opção desejada:
//3
//
//Informe o valor que deseja transferir:
//1000
//
//Saldo atualizado R$ 2200.0

// Checklist:

//Inicializar dados do cliente
//Menu de opções
//Visualização do saldo
//Enviar valor
//Receber valor