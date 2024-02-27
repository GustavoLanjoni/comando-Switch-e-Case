public class comandoSwitchCase {
    public static void main(String[] args) throws Exception {

        String nome = "Gustavo Lanjoni";
        int nota1 = 80;
        int nota2 = 75;
        int nota3 = 70;
        int nota4 = 85;
        int media = 0;
        
            media = (nota1 + nota2 + nota3 + nota4) /4;

        /*Switch e Case: operações  exatas */
        int dia = 3;
        switch (dia) {
            case 1:
                        System.out.println("Segunda-Feira!");
                break;
                    case 2:    
                        System.out.println("Terca-Feira");
                break;
            default: System.out.println("Qualquer outro dia");
                break;
                    case 3:
                        System.out.println("Quarta-Feira!");
                break;
            case 4:    
                        System.out.println("Quinta-Feira");
                break;
            case 5: 
                        System.out.println("Sexta-Feira");
                break;
            case 6:
                        System.out.println("Sabado");    
                break;
            case 7: 
                        System.out.println("Domingo");
                break;                                



         }
        
    }
}
