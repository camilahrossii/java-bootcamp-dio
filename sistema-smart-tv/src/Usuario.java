public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        // Ligar/Desligar -----------------------------------------
        smartTv.ligar();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);

        // Volume -----------------------------------------
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo Status: Volume Atual: " + smartTv.volume);

        smartTv.abaixarVolume();
        System.out.println("Novo Status: Volume Atual: " + smartTv.volume);

        // Mudar Canal  -----------------------------------------
        smartTv.mudarCanal(8);
        System.out.println("Novo Canal: " + smartTv.canal);
    }
}
