//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int test = Integer.parseInt(scanner.nextLine());
//        ArrayList<Item> arraysList = new ArrayList<>();
//
//        for(int i=1;i<=test;++i){
//            Item item = new Item(scanner.nextLine(),scanner.nextLine(),Long.parseLong(scanner.nextLine()),Long.parseLong(scanner.nextLine()));
//
//            String tmp = String.valueOf(i);
//            while(tmp.length() < 3) tmp = "0" + tmp;
//            item.setNumber(item.getNumber() + tmp);
//            arraysList.add(item);
//        }
//        Collections.sort(arraysList);
//        for(Item item : arraysList) {
//            System.out.println(item.toString());
//        }
//    }
//}