public class Acase2 implements Runnable{
    //A n'est pas un thread car il n'extends pas thread
    String nom;
    int temps;
    Thread t1;
   public Acase2(String ch, int t){
        nom = ch;
        temps =t;
        t1 = new Thread(this);
        t1.start();
   }

    @Override
    public void run() {
        for (int i=0; i<=10;i++){
            System.out.println(nom+ i);
            try{
                t1.sleep(temps);
            }catch (InterruptedException e){

            }
        }
    }
}
