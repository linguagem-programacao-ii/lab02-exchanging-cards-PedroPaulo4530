import java.util.*;

public class ExchangingCards {
    public static void main(String[] args) {
        int cardsA;
        int cardsB;
        String aux;
        Scanner teclado = new Scanner(System.in);

        while (true) {
            aux = teclado.nextLine();
            List<String> itens = Arrays.asList(aux.split("\\s* \\s*"));
            cardsA = Integer.parseInt(itens.get(0));
            cardsB = Integer.parseInt(itens.get(1));
            if(cardsA == 0 && cardsB == 0) {
                break;
            }

            aux = teclado.nextLine();
            Set<String> colecao_a = new HashSet(Arrays.asList(aux.split("\\s* \\s*")));
            aux = teclado.nextLine();
            Set<String> colecao_b = new HashSet(Arrays.asList(aux.split("\\s* \\s*")));
            Set<String> c = colecao_b;

            int f = 0;

            if (colecao_a.size() < colecao_b.size()){
                c = colecao_a;
                colecao_a = colecao_b;
            }

            int aux_count = 0;

            for (String x : c){
                if (!colecao_a.contains(x)) aux_count++;
            }
            System.out.println(aux_count);
        }
    }
}

