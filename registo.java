
/**
 * Escreva a descrição da classe programa_registo_sueca aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.*;
public class registo
{
    public static void main()
    {
        Random numeroAleatorio = new Random();
        
        Scanner input = new Scanner(System.in);
        
        Sueca registo[] = new Sueca[4];
        
        String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
        
        String armazenaChaves = "";
        int index = -1;
        
        Sueca p1;
        
      int [ ] sueca = new int[4]; //Define a dimensão do array
     
      sueca [0] = numeroAleatorio.nextInt();
      sueca [1] = numeroAleatorio.nextInt();
      sueca [2] = numeroAleatorio.nextInt();
      sueca [3] = numeroAleatorio.nextInt();
        
        
        p1= new Sueca();
        
        p1.Nome="Manuel";
        p1.idade=21;
        p1.altura= 1.27;
        p1.Localidade="";
        
        for(int i=0;i<registo.length;i++){
            registo[i]= new Sueca();
            registo[i].Nome="";
            registo[i].idade=21;
            registo[i].altura=1.27;
            registo[i].Localidade="";
            
            System.out.println("*****Torneio Sueca******");
            System.out.println();
            System.out.println("******Registo******");
            System.out.println();
            System.out.println("Nome:");
            p1.Nome=input.nextLine();
            System.out.println("Idade:");
            p1.idade=input.nextInt();
            System.out.println("Altura:");
            p1.altura=input.next().charAt(0);
            System.out.println("Localidade:");
            p1.Localidade=input.nextLine();
            input.nextLine();
            
            
        }
       
        System.out.println("*******Inscrição********");
        Arrays.sort(sueca);
        System.out.println("");
         for(int i = 0; i<4; i++){//Função de repetição que vai buscar os 5 numeros
         index =( letras.length() );
         armazenaChaves += letras.substring( index, index);
        }
        
        System.out.println(armazenaChaves);
    }
}
