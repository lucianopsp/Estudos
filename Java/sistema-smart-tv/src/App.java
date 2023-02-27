public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada " + smartTv.ligada);
        System.out.println("Volume da TV: " + smartTv.volume);
        System.out.println("Canal da TV: " + smartTv.canal);

        System.out.println("Tv ligada " + smartTv.ligada);

        smartTv.ligar();

        System.out.println("Tv ligada " + smartTv.ligada);
  
        System.out.println("Volume da TV: " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume da TV: " + smartTv.volume);
        smartTv.diminuirVolume();

        System.out.println("Volume da TV: " + smartTv.volume);


        System.out.println("Canal da TV: " + smartTv.canal);


        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        System.out.println("Canal da TV: " + smartTv.canal);
        
        smartTv.diminuirCanal();
        
        System.out.println("Canal da TV: " + smartTv.canal);
        
        smartTv.selecionarCanal(10);
        
        System.out.println("Canal da TV: " + smartTv.canal);

    }
}
