public class Autodromo{
    public static void main(String[] args) {
        Carro jeep = new Carro(); 
        //jeep.ligar(); 
        jeep.setChassi("8978985");

        Moto z400 = new Moto();
        z400.setChassi("4561847");
        //z400.ligar();

        Veiculo uno = jeep;
        uno.ligar();

        Veiculo moto = z400;
        moto.ligar();
    }

}
