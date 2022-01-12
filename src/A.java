public class A extends Thread{
    String nom;
    int temps;
    public A (String ch,int t){
        nom = ch;
        temps=t;
    }
    @Override
    public void run() {
        super.run();
        for (int i=0; i<=10;i++){
            System.out.println(nom+ i);
            try{
                sleep(temps);
            }catch (InterruptedException e){

            }
        }
    }
}
