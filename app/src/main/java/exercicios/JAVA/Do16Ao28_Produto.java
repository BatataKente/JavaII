package exercicios.JAVA;

import java.util.function.Supplier;

class Do16Ao28_Produto {
        double preçoDeCusto;
        double preçoDeVenda;
        Supplier<Double> preçoFinal = () -> preçoDeVenda - preçoDeCusto;
        void setPreçoDeCusto(double preúoDeCusto) {
            this.preçoDeCusto = preúoDeCusto;
        }
        void setPreçoDeVenda(double preúoDeVenda) {
            this.preçoDeCusto = preúoDeVenda;
        }
        String getStatus() {
            return 
                    "Preço de custo: " + preçoDeCusto + 
                    "; Preço de venda: " + preçoDeVenda + 
                    "; Preço final: " + preçoFinal.get();
        }
}