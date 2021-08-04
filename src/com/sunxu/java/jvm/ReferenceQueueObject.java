//package com.sunxu.segmentfault.jvm;
//
//import com.sun.org.apache.xpath.internal.SourceTree;
//
//import java.lang.ref.PhantomReference;
//import java.lang.ref.ReferenceQueue;
//
///**
// * @author 孙许
// * @version 1.0
// * @date 2021/2/4 10:03
// */
//public class ReferenceQueueObject {
//
//    public static void main(String[] args) {
//        ReferenceQueue<User> referenceQueue = new ReferenceQueue();
//
//        User user = new User("sunxu");
//        PhantomReference<User> reference = new PhantomReference<>(user, referenceQueue);
//        user = null;
//        System.out.println(reference.get());
//        System.out.println(referenceQueue.poll());
//
//        System.gc();
//        try {
//            Thread.sleep(2000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        while (true) {
//            if (referenceQueue.poll() != null) {
//                System.out.println("ssss");
//                break;
//            }
//        }
//    }
//}
