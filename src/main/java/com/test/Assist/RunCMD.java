package com.test.Assist;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunCMD {

    public static void run(String cmd) {

        Runtime runtime = Runtime.getRuntime();

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(runtime.exec(cmd).getInputStream()));

            StringBuffer b = new StringBuffer();

            String line = null;

            while ((line = br.readLine()) != null) {
                b.append(line + "\n");
            }

            System.out.println(b.toString());

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}