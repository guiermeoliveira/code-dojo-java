//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import static java.lang.IO.*;
void main() {
    String[] nomes = new String[10];
    Double[] nota1 = new Double[10];
    Double[] nota2 = new Double[10];
    Double[] nota3 = new Double[10];

    int totalCadastrados = 0;
    String escolha;
    String parada= "0";
    String busca = "3";
    String cadastrar = "1";
    String exibirmedia = "4";
    String lista = "2";

    while (true) {
        IO.println("=== Sistema de turma ===");
        IO.println("1 - cadastras aluno\n 2 - listar todos os alunos \n 3 - buscar alunos por nome \n 4 - exibir média geral da turma \n 0 - sair");
        escolha = IO.readln("escolha uma opção: ");

        if (escolha.equals(parada)) {
            println("Encerrando o sistema.");
            System.exit(0);
        } else {
            if (escolha.equals(cadastrar) && totalCadastrados <= 10) {
                for (int i = 0; i < nomes.length; i++) {
                    nomes[i] = IO.readln("Digite o aluno a ser cadastrado: ");

                    totalCadastrados++;

                    nota1[i] = Double.parseDouble(IO.readln("nota1"));
                    nota2[i] = Double.parseDouble(IO.readln("nota2"));
                    nota3[i] = Double.parseDouble(IO.readln("nota3"));
                    println(String.format("aluno cadastrado: " + nomes[i]));

                    if (escolha.equals(lista)) {
                        for (int j = 0; j < nomes.length; j++) {
                            println(nomes[j]);
                        }

                    }
                }
            }
        }
    }}
