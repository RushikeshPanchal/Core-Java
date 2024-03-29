package com.faq.imp.program;

class Table {
     void printTable (int n) {
     synchronized (this) {
     for(int i=1;i<=5;i++){
    System.out.println(n*i);
    try {
     Thread.sleep(500);
     } catch (Exception e ) {
    System.out.println(e);
    }
  }
  }
 } // end of the method
}

public class TestSynchronizedBlock2 {
      public static void main (String arg []) {
    final Table obj = new Table(); // only one object

   Thread t1 = new Thread() {
   public void run() {
   obj.printTable(5);
 }
};

Thread t2 = new Thread() {
   public void run() {
  obj.printTable(100);
  }
};
  t1.start();
  t2.start();
  }
}