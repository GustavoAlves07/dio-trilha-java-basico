public class Usuario {
    public static void main(String[] args) {

        SmartTv tv = new SmartTv();

        tv.canal = 9;
        tv.ligar();
        tv.aumentarVolume();
        tv.subirCanal();

        System.out.println(tv.ligada ? "A tv esta ligada":"A tv esta desligada");

        if (tv.ligada){
            System.out.println("A tv esta no canal " + tv.canal + " esta com o volume " + tv.volume);

        }




    }
}
