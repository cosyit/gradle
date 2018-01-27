package com.cosyit.gradle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int i=0;
        Scanner scanner = new Scanner(System.in);
        while(++i > 0){
            System.out.println(i + ". please input todo Item name: ");
            TodoItem item =new TodoItem(scanner.nextLine());
            System.out.println(item);
        }
    }
}
