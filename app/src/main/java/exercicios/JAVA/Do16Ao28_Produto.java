package exercicios.JAVA;

import java.util.function.Supplier;

class Do16Ao28_Produto {
        double pre�oDeCusto;
        double pre�oDeVenda;
        Supplier<Double> pre�oFinal = () -> pre�oDeVenda - pre�oDeCusto;
        void setPre�oDeCusto(double pre�oDeCusto) {
            this.pre�oDeCusto = pre�oDeCusto;
        }
        void setPre�oDeVenda(double pre�oDeVenda) {
            this.pre�oDeCusto = pre�oDeVenda;
        }
        String getStatus() {
            return 
                    "Pre�o de custo: " + pre�oDeCusto + 
                    "; Pre�o de venda: " + pre�oDeVenda + 
                    "; Pre�o final: " + pre�oFinal.get();
        }
}