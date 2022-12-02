package atividadejava;

import java.util.Scanner;

public class AtividadeJava {
    
    public static void main(String[] args) {
        //Para que o usuário possa digitar
        Scanner entrada = new Scanner(System.in);
        int continua =1;
        
        //Começando o laço de repetição
        while (continua != 10){
            //Dando inicio ao menu
            System.out.println("\nEscolha as opções: \n");
            System.out.println("|1- Jogar |2- Instruções|3- Créditos|4- Sair|");
            System.out.print("\nNUMERO: ");
            
            
            //Ler o valor do usuario
            int escolhaMenu = entrada.nextInt();
            
         //Inicio da Case
        switch(escolhaMenu){
            case 1: 
           int resp = 0;
           System.out.println("\nConfigurações iniciais do jogo");
            try {
                Thread.sleep(2000);
                } catch (Exception e){
                e.printStackTrace();
                }
            //Adicional: Numero de jogadores
            System.out.println("Escolha a quantidade de jogadores:\n");
            System.out.println("|1 Jogador| 2 Jogadores|3 Voltar para o menu\n");
            System.out.println("Numero: ");
            
            //Decisao jogador
            int opcjogador = entrada.nextInt();
            switch (opcjogador){
                case 1:
                    int pt = 0;
                    System.out.println("Digite seu nome: ");
                    String nome = entrada.next();
                    System.out.println("  ");
                    System.out.println("Quando o Brasil foi descoberto?");
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1- 1500");
                    System.out.println("2- 1880");
                    System.out.println("3- 2020");
                    System.out.println("4- 1980");
                    System.out.println("Resposta: ");
                    resp = entrada.nextInt();
                    System.out.println("----------------------------------------");
                    
                    if (resp==1){
                        System.out.println(nome+" Você acertou");
                        pt = pt+10;
                    System.out.println("----------------------------------------");
                    } else {
                        System.out.println(nome+" Você errou!");
                        pt = pt+0;
                    System.out.println("----------------------------------------");
                }
                    System.out.println("\nVocê fez um total de: "+pt+" Pontos");
                    break;
                case 2:
                    pt=0;
                    int pt2 = 0;
                    System.out.println("Digite o nome do primeiro jogador: ");
                    String nome1 = entrada.next();
                    System.out.println("Digite o nome do segundo jogador: ");
                    String nome2 = entrada.next();
                    
                    System.out.println("  ");
                    
                    System.out.println("O que caracteriza um superávit em meu orçamento:");
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1- Receita fixas e despesas variáveis");
                    System.out.println("2- Despesa sazonal");
                    System.out.println("3- Quando as minhas despesas são menores que minhas receitas");
                    System.out.println("4- Quando agrupo minhas receitas");
                    System.out.println("\nÉ sua vez: "+nome1);
                    System.out.println("Resposta: ");
                    resp = entrada.nextInt();
                    System.out.println("----------------------------------------");
                    
                    if (resp == 3){
                    System.out.println(nome1+" Você acertou");
                        pt=pt+10;
                    System.out.println("----------------------------------------");
                    } else {
                        System.out.println(nome1+" Você errou!");
                        pt=pt+0;
                    System.out.println("----------------------------------------");
                }
                    System.out.println("O qu é a tecnologia broadcast");
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1- Transmissão simultanea na rede");
                    System.out.println("2- Tranmissão aleatoria na rede");
                    System.out.println("3- Transferencia de arquivo rapido");
                    System.out.println("4- Transferencia de arquivo lento");
                    System.out.println("\nÉ sua vez: "+nome2);
                    System.out.println("Resposta: ");
                    resp = entrada.nextInt();
                    System.out.println("----------------------------------------");
                    
                    if (resp == 3){
                    System.out.println(nome2+" Você acertou");
                        pt2=pt2+10;
                    System.out.println("----------------------------------------");
                    } else {
                        System.out.println(nome2+" Você errou!");
                        pt2=pt2+0;
                    System.out.println("----------------------------------------");
            }
                    System.out.println("   ");
     
                    System.out.println("Quanto é 2+2:");
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1- 2");
                    System.out.println("2- 3");
                    System.out.println("3- 4");
                    System.out.println("4- 6");
                    System.out.println("\nÉ sua vez: "+nome1);
                    System.out.println("Resposta: ");
                    resp = entrada.nextInt();
                    System.out.println("----------------------------------------");
                    
                    if (resp == 3){
                    System.out.println(nome1+" Você acertou");
                        pt=pt+10;
                    System.out.println("----------------------------------------");
                    } else {
                        System.out.println(nome1+" Você errou!");
                        pt=pt+0;
                    }
                    System.out.println("Quantas horas um adulto deve dormir");
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1- 8h");
                    System.out.println("2- 3h");
                    System.out.println("3- 2h");
                    System.out.println("4- 30min");
                    System.out.println("\nÉ sua vez: "+nome2);
                    System.out.println("Resposta: ");
                    resp = entrada.nextInt();
                    System.out.println("----------------------------------------");
                    
                    if (resp == 1){
                    System.out.println(nome2+" Você acertou");
                        pt2= pt2+10;
                    System.out.println("----------------------------------------");
                    } else {
                        System.out.println(nome2+" Você errou!");
                        pt2=pt2+0;
                    System.out.println("----------------------------------------");
            }
                    if (pt > pt2){
                    System.out.println("\nParabens " +nome1+ "voce foi vencedor");
                    } else {
                    System.out.println("\nParabens " +nome2+ "voce foi vencedor");
                    }
                    System.out.println();
                    break;
                }
            break;
            case 2: 
                System.out.println("Tire suas duvidas direto com o desenvolvedor");
                break;
            case 3:
                System.out.println("Obrigado por jogar.");
                break;
            }
        System.out.println("\nDigite o numero correspondente ao executar: ");
        System.out.println("1- Menu 2- Sair ");
        System.out.println("NUMERO: ");
        continua = entrada.nextInt();
        if (continua == 2){
            System.exit(0);
            }
        }
    }
}