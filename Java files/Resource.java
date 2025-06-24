class Resource {


    synchronized void method1(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is executing method1");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.method2(this);
    }


    synchronized void method2(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is executing method2");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.method1(this);
    }
}
