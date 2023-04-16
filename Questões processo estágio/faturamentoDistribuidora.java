import java.util.HashMap;
import java.util.Map;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        // Define o faturamento mensal por estado
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        // Calcula o faturamento total da distribuidora
        double faturamentoTotal = faturamentoPorEstado.values().stream().mapToDouble(Double::doubleValue).sum();

        // Calcula o percentual de representação de cada estado no faturamento total
        Map<String, Double> percentualPorEstado = new HashMap<>();
        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            double faturamento = entry.getValue();
            double percentual = (faturamento / faturamentoTotal) * 100;
            percentualPorEstado.put(estado, percentual);
        }

        // Imprime o resultado
        System.out.println("Percentual de representação do faturamento mensal por estado:");
        for (Map.Entry<String, Double> entry : percentualPorEstado.entrySet()) {
            String estado = entry.getKey();
            double percentual = entry.getValue();
            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
    }
}