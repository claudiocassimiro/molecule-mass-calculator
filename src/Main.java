import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // Método principal
    public static void main (String[] args) {
        // Tabela de massa dos aminoácidos
        Map<Character, Double> aminoAcidMasses = new HashMap<>();
        aminoAcidMasses.put('A', 71.03711);
        aminoAcidMasses.put('C', 103.00919);
        aminoAcidMasses.put('D', 115.02694);
        aminoAcidMasses.put('E', 129.04259);
        aminoAcidMasses.put('F', 147.06841);
        aminoAcidMasses.put('G', 57.02146);
        aminoAcidMasses.put('H', 137.05891);
        aminoAcidMasses.put('I', 113.08406);
        aminoAcidMasses.put('K', 128.09496);
        aminoAcidMasses.put('L', 113.08406);
        aminoAcidMasses.put('M', 131.04049);
        aminoAcidMasses.put('N', 114.04293);
        aminoAcidMasses.put('P', 97.05276);
        aminoAcidMasses.put('Q', 128.05858);
        aminoAcidMasses.put('R', 156.10111);
        aminoAcidMasses.put('S', 87.03203);
        aminoAcidMasses.put('T', 101.04768);
        aminoAcidMasses.put('V', 99.06841);
        aminoAcidMasses.put('W', 186.07931);
        aminoAcidMasses.put('Y', 163.06333);

        // Solicita o nome do arquivo ao usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo de proteína (com extensão): ");
        String fileName = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String proteinSequence = br.readLine();
            double totalMass = calculateProteinMass(proteinSequence, aminoAcidMasses);
            System.out.printf("A massa total da proteína é: %.5f\n", totalMass);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static double calculateProteinMass(String proteinSequence, Map<Character, Double> aminoAcidMasses) {
        double totalMass = 0.0;
        for (char aminoAcid : proteinSequence.toCharArray()) {
            Double mass = aminoAcidMasses.get(aminoAcid);
            if (mass != null) {
                totalMass += mass;
            } else {
                System.err.println("Aminoácido desconhecido: " + aminoAcid);
            }
        }
        return totalMass;
    }
}