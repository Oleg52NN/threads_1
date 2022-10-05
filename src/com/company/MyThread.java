package com.company;

class MyThread extends Thread {
    public MyThread(ThreadGroup mainGroup, String thread_name) {
        super(mainGroup, thread_name);
    }

    @Override
    public void run() {
        try {
            int i = 1;
            while (!isInterrupted()) {
                Thread.sleep(2500);
                if(i !=2) {
                    System.out.printf("Поток %s с идентификатором %s сейчас работает и передает всем привет в %d раз! \n", getName(), getId(), i);
                }
                else {
                    System.out.printf("Поток %s с идентификатором %s сейчас работает и передает всем привет во %d раз! \n", getName(), getId(), i);
                }
                i++; //System.out.println(Thread.currentThread().getName());
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("Поток %s с идентификатором %s работу завершил\n", getName(), getId());
        }
    }
}
