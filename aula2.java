package AulaJAVA;

public class aula2 {

    public static void main(String[] args){
        Carro fusca = new Carro();
        fusca.acelerar();

    }
}

class Carro {
    String cor;
    String marca;
    String anoFabricacao;

    public  void acelerar(){
        System.out.println("O carro acelerou !");
    }
}
