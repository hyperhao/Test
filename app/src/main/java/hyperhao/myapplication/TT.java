package hyperhao.myapplication;

import android.util.Log;

/**
 * Created by Lenovo on 2017/11/27.
 */

public class TT {
    static void test() {
        int a = 0;

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.d("HYP", "sleep:" + 1);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
