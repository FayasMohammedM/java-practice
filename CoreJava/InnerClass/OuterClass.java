package InnerClass;

public class OuterClass {
    private String msg ="Hello from outer class!";
    public class InnerClass{
        void display(){
            System.out.println(msg);
        }
    }

    public void outerMethod(){
         class LocalInnerClass{
            void show(){
                System.out.println("Hello from LocalInnerClass inside outerMethod!");
                System.out.println("OuterClass message from LocalInnerClass:"+msg);
            }
        }
        LocalInnerClass local = new LocalInnerClass();
        local.show();
        
    }

    public void processRunnable(){

        Runnable myRunnable = new Runnable() {
            public void run(){
                System.out.println("Running from Anonymous Inner Class (Implementing Runnable)!");
                System.out.println("Anonymous inner class can also access outer class msg :"+msg);
            }
        };

        Thread t = new Thread(myRunnable);
        t.start();
    }
}
