import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    // Tabela de massa dos aminoácidos
    private static final Map<Character, Double> AMINO_ACID_MASSES = new HashMap<>();
    static {
        AMINO_ACID_MASSES.put('A', 71.03711);
        AMINO_ACID_MASSES.put('C', 103.00919);
        AMINO_ACID_MASSES.put('D', 115.02694);
        AMINO_ACID_MASSES.put('E', 129.04259);
        AMINO_ACID_MASSES.put('F', 147.06841);
        AMINO_ACID_MASSES.put('G', 57.02146);
        AMINO_ACID_MASSES.put('H', 137.05891);
        AMINO_ACID_MASSES.put('I', 113.08406);
        AMINO_ACID_MASSES.put('K', 128.09496);
        AMINO_ACID_MASSES.put('L', 113.08406);
        AMINO_ACID_MASSES.put('M', 131.04049);
        AMINO_ACID_MASSES.put('N', 114.04293);
        AMINO_ACID_MASSES.put('P', 97.05276);
        AMINO_ACID_MASSES.put('Q', 128.05858);
        AMINO_ACID_MASSES.put('R', 156.10111);
        AMINO_ACID_MASSES.put('S', 87.03203);
        AMINO_ACID_MASSES.put('T', 101.04768);
        AMINO_ACID_MASSES.put('V', 99.06841);
        AMINO_ACID_MASSES.put('W', 186.07931);
        AMINO_ACID_MASSES.put('Y', 163.06333);
    }

    public static void main(String[] args) {
        // Solicita o nome do arquivo ao usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo de proteína (com extensão): ");
        String fileName = scanner.nextLine();

        // Verifica se o arquivo está no diretório atual
        String filePath = System.getProperty("user.dir") + "/" + fileName;
        System.out.println("Procurando o arquivo em: " + filePath);

        Queue<Character> proteinQueue = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String proteinSequence = br.readLine();

            // Enfileira os aminoácidos
            for (char aminoAcid : proteinSequence.toCharArray()) {
                proteinQueue.add(aminoAcid);
            }

            // Calcula a massa total da proteína desenfileirando os aminoácidos
            double totalMass = 0.0;
            while (!proteinQueue.isEmpty()) {
                char aminoAcid = proteinQueue.poll();
                Double mass = AMINO_ACID_MASSES.get(aminoAcid);
                if (mass != null) {
                    totalMass += mass;
                } else {
                    System.err.println("Aminoácido desconhecido: " + aminoAcid);
                }
            }

            System.out.printf("A massa total da proteína é: %.5f\n", totalMass);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
