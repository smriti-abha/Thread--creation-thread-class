public class Main extends Thread{

    //first way
    public void run(){
        System.out.println("Thread is Created Successfully");
    }
//    public static void main(String[] args) {
//
//        Main t= new Main();
//        t.start();  //new thread is created and run
//
//    }
    public static void main(String[] args) {

        Main t= new Main();
        t.run();  //new thread is not created but call itself to run thread
        t.run();   // calling run() method infinite number of times but calling start is applicable for only one time
    }
}