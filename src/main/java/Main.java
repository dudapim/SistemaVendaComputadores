public class Main {

    public static void main(String[] args) {

        // Criando os componentes
        CPU cpu = new CPU(500, 100, 200);
        Memoria memoria = new Memoria(200, 50, 100);
        HardDisk hardDisk = new HardDisk(150, 30, 60);
        PlacaMae placaMae = new PlacaMae(300, 70, 140);

        AceleradorGrafico acelerador = new AceleradorGrafico(400, 80, 160);

        // Criando a placa de vídeo
        PlacaVideo placaVideo = new PlacaVideo();
        placaVideo.adicionar(acelerador);

        // Criando o computador
        Computador computador = new Computador("Computador");

        computador.add(cpu);
        computador.add(memoria);
        computador.add(hardDisk);
        computador.add(placaMae);
        computador.add(placaVideo);

        // RESULTADOSS
        System.out.println("Descrição:");
        System.out.println(computador.getDescricao());

        System.out.println("Preço de custo: " + computador.getPrecoCusto());
        System.out.println("Preço de lucro mínimo: " + computador.getPrecoLucroMinimo());
        System.out.println("Preço de lucro máximo: " + computador.getPrecoLucroMaximo());
    }
}

