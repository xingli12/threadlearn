package com.lx;

/**
 * Title Demo3
 * Package com.lx
 *
 * @author lx
 * @version v1
 * **
 * ----------Dragon be here!----------/
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑
 * 　　　　┃　　　┃代码无BUG！
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━神兽出没━━━━━━
 * @date 2018-09-04 01:00
 * description 匿名内部类创建线程
 * modifie
 * updateDate
 */
public class Demo3 {

    public static void main(String[] args) {
//        new Thread(){
//            @Override
//            public void run(){
//                System.out.println("Thread start...");
//            }
//        }.start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread start...");
//            }
//        }).start();

/** *
 * description 执行的子类的方法，输出为sub
 * @param args
 * @return  void
 * @date  Created in 1:06 2018/9/4/0004
 * modified by
 * @author lx
 */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable");
            }
        }) {
            @Override
            public void run() {
                System.out.println("sub");
            }
        }.start();
    }
}
