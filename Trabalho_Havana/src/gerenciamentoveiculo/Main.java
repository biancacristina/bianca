package gerenciamentoveiculo;

public class Main {
    public static void main(String[] args) {
       
        Carro carro1 = new Carro("Fiat", "Palio", 2010, 4);

        Carro carro2 = new Carro("Volkswagen", "Gol", 2015, 4);

        Carro carro3 = new Carro("Ford", "Fiesta", 2012, 4);

       
        Moto moto1 = new Moto("Honda", "CG", 2015, 160);
        Moto moto2 = new Moto("Yamaha", "YZF", 2018, 250);
        Moto moto3 = new Moto("Suzuki", "GSX", 2012, 150);

      
        System.out.println("Dados dos Carros:");
                carro1.imprimirDados();
        System.out.println();
                carro2.imprimirDados();
        System.out.println();
                carro3.imprimirDados();

        System.out.println("\nDados das Motos:");
                moto1.imprimirDados();
        System.out.println();
                moto2.imprimirDados();
        System.out.println();
                moto3.imprimirDados();
    }
}
