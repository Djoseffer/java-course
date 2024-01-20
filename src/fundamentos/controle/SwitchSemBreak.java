package fundamentos.controle;

public class SwitchSemBreak {

    public static void main(String[] args) {

        //Switch case no exemplo abaixo encontra uma afirmação com o valor igual ao digitado e reproduz o que esta abaixo de forma sequencial
        //Caso não encontre uma faixa com o valor ele pula para o default, mas para isso precisa do break
        String faixa = "branca";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-dai...");
            case "marron":
                System.out.println("Sei Tekki- shodan");
            case "roxa":
                System.out.println("sei o Heian god");
            case "verde":
                System.out.println("Sei o Heian-Yodan");
            case "laranja":
                System.out.println("Sei o Hein snad");
            case "vermelho":
                System.out.println("Sei o nidan");
            case "amarela":
                System.out.println("Sei Shodan");
                break;
            default:
                System.out.println("Não sei nada");
        }
        System.out.println("Fim");

        //Outro exemplo
        int idade = 0;
        switch (idade){
            case 3:
                System.out.println("Sabe programar e andar");
            case 2:
                System.out.println("Sabe andar");
            case 1:
                System.out.println("Sabe falar");
            case 0:
                System.out.println("Sabe respirar");
        }
    }

}
