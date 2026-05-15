void main() {
    String[] nomes = new String[10];
    double[] nota1 = new double[10];
    double[] nota2 = new double[10];
    double[] nota3 = new double[10];
    int totalCadastrados = 0;
    int opcao = -1;

    while (opcao != 0) {
        IO.println("\n=== Sistema de Turma ===");
        IO.println("1 - Cadastrar aluno");
        IO.println("2 - Listar todos os alunos");
        IO.println("3 - Buscar aluno por nome");
        IO.println("4 - Exibir média geral da turma");
        IO.println("0 - Sair");
        
        opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));

        if (opcao == 0) {
            IO.println("Encerrando o sistema.");
        } else {
            if (opcao == 1) {
                if (totalCadastrados == 10) {
                    IO.println("Turma cheia.");
                } else {
                    nomes[totalCadastrados] = IO.readln("Nome do aluno: ");

                    // Validação Nota 1
                    double n1 = Double.parseDouble(IO.readln("Nota 1 (0-10): "));
                    while (n1 < 0 || n1 > 10) {
                        IO.println("Nota inválida. Digite novamente.");
                        n1 = Double.parseDouble(IO.readln("Nota 1 (0-10): "));
                    }
                    nota1[totalCadastrados] = n1;

                    // Validação Nota 2
                    double n2 = Double.parseDouble(IO.readln("Nota 2 (0-10): "));
                    while (n2 < 0 || n2 > 10) {
                        IO.println("Nota inválida. Digite novamente.");
                        n2 = Double.parseDouble(IO.readln("Nota 2 (0-10): "));
                    }
                    nota2[totalCadastrados] = n2;

                    // Validação Nota 3
                    double n3 = Double.parseDouble(IO.readln("Nota 3 (0-10): "));
                    while (n3 < 0 || n3 > 10) {
                        IO.println("Nota inválida. Digite novamente.");
                        n3 = Double.parseDouble(IO.readln("Nota 3 (0-10): "));
                    }
                    nota3[totalCadastrados] = n3;

                    totalCadastrados++;
                    IO.println("Aluno cadastrado com sucesso.");
                }
            } else if (opcao == 2) {
                if (totalCadastrados == 0) {
                    IO.println("Nenhum aluno cadastrado.");
                } else {
                    for (int i = 0; i < totalCadastrados; i++) {
                        double media = (nota1[i] + nota2[i] + nota3[i]) / 3.0;
                        String situacao = (media >= 6.0) ? "Aprovado" : "Reprovado";
                        IO.println("Nome: " + nomes[i] + " | Notas: " + nota1[i] + " " + nota2[i] + " " + nota3[i] + " | Média: " + media + " | " + situacao);
                    }
                }
            } else if (opcao == 3) {
                String busca = IO.readln("Digite o nome para buscar: ");
                boolean achou = false;
                for (int i = 0; i < totalCadastrados; i++) {
                    if (nomes[i].equalsIgnoreCase(busca)) {
                        double media = (nota1[i] + nota2[i] + nota3[i]) / 3.0;
                        String situacao = (media >= 6.0) ? "Aprovado" : "Reprovado";
                        IO.println("Nome: " + nomes[i] + " | Notas: " + nota1[i] + " " + nota2[i] + " " + nota3[i] + " | Média: " + media + " | " + situacao);
                        achou = true;
                    }
                }
                if (!achou) {
                    IO.println("Aluno não encontrado.");
                }
            } else if (opcao == 4) {
                if (totalCadastrados == 0) {
                    IO.println("Nenhum aluno cadastrado.");
                } else {
                    double somaMedias = 0;
                    for (int i = 0; i < totalCadastrados; i++) {
                        somaMedias += (nota1[i] + nota2[i] + nota3[i]) / 3.0;
                    }
                    IO.println("Média geral da turma: " + (somaMedias / totalCadastrados));
                }
            } else {
                IO.println("Opção inválida.");
            }
        }
    }
}
