package exercicios.JAVA.do16Ao28;

import java.util.function.Supplier;

class Produto {
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