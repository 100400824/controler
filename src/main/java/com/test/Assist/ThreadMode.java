package com.test.Assist;

public class ThreadMode {

    public Thread getThread(final String cmd) {

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {

                RunCMD.run(cmd);
            }
        });

        return thread;
    }


}