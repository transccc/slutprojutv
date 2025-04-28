// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Random;
public class lab {
   public static void main(String[] args) {
       try {
       LinkedList<Integer> list = new LinkedList<>();
       String filename = args[0];
       Scanner scanner = new Scanner(new FileReader(filename));
       while (scanner.hasNextInt()){
           int number = scanner.nextInt();
           list.add(number);

       }
       scanner.close();
       LinkedList<Integer> list2 = new LinkedList<>();
       
       ArrayList<Integer> list3 = new ArrayList<>();
       String filename2 = args[1];
       Scanner scanner2 = new Scanner(new FileReader(filename2));
       while (scanner2.hasNextInt()){
           int number = scanner2.nextInt();
           list2.add(number);

       }
       
       scanner2.close();
       String filenameout1 = args[2];
       String filenameout2 = args[3];
       String filenameout3 = args[4];
       String filenameout4 = args[5];
       File file1 = new File(filenameout1);
       File file2 = new File(filenameout2);
       File file3 = new File(filenameout3);
       File file4 = new File(filenameout4);
       PrintWriter printWriter1 = new PrintWriter(file1);
       PrintWriter printWriter2 = new PrintWriter(file2);
       PrintWriter printWriter3 = new PrintWriter(file3);
       PrintWriter printWriter4 = new PrintWriter(file4);

       for(int i = 1; i<=Integer.parseInt(args[6]); i++){
         binarytree<Integer> intTree;
         TreeSet<Integer> SetTree;
         SetTree = new TreeSet<Integer>();
          intTree = new binarytree<Integer>();
           long starttime = System.nanoTime();
           intTree.addlist(list);
           long endtime = System.nanoTime();
           long time = endtime - starttime; 
           long starttime1 = System.nanoTime();
           SetTree.addAll(list);
           long endtime1 = System.nanoTime();
           long time1= endtime1 - starttime1; 
           printWriter1.println(i + ", " + time + ", " + time1);
           long starttime2 = System.nanoTime();
           intTree.findlist(list);
           long endtime2 = System.nanoTime();
           long time2 = endtime2 - starttime2; 
           long starttime3 = System.nanoTime();
           SetTree.containsAll(list);
           long endtime3 = System.nanoTime();
           long time3 = endtime3 - starttime3; 
           printWriter2.println(i + ", " + time2 + ", " + time3);
           long starttime6 = System.nanoTime();
           intTree.toArray(intTree.returnroot(), list3);
           long endtime6 = System.nanoTime();
           long time6 = endtime6 - starttime6; 
           long starttime7= System.nanoTime();
           List<Integer> list6 = new ArrayList<>(SetTree);
           long endtime7 = System.nanoTime();
           long time7 = endtime7 - starttime7; 
           printWriter4.println(i + ", " + time6 + ", " + time7);
           long starttime4 = System.nanoTime();
           intTree.addlist(list2);
           long endtime4 = System.nanoTime();
           long time4 = endtime4 - starttime4; 
           long starttime5= System.nanoTime();
           SetTree.addAll(list2);
           long endtime5 = System.nanoTime();
           long time5 = endtime5 - starttime5; 
           printWriter3.println(i + ", " + time4 + ", " + time5);


       }
       printWriter1.close();
       printWriter2.close();
       printWriter3.close();
       printWriter4.close();
   }
   catch(IOException e){

   }
   }
}