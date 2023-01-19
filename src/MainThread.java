public class MainThread {

    public static void main(String [] args){
        Thread t1 = Thread.currentThread();
        System.out.println("Thread before name change :" + t1);

        t1.setName("NewName");
        System.out.println("Thread after name change :" + t1);

        try{

            for(int i=0; i<5; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }

    }
}
