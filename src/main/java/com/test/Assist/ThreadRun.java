package com.test.Assist;

public class ThreadRun {

    public static void xc(String num,String cmd) {

        //线程数量
        for(int i = 0; i < Integer.parseInt(num); i++){

            ThreadMode thread = new ThreadMode();

            thread.getThread(cmd).start();
        }
    }


}
