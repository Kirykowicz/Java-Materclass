package dev.lpa;

import com.abc.first.Item;
import com.abc.first.PackageOnlyItem;


public class Main {
    public static void main(String[] args) {
        Item firstItem = new Item("Burger");
        System.out.println(firstItem.toString());

//        PackageOnlyItem packageOnlyItem = new PackageOnlyItem();
//        System.out.println(packageOnlyItem.toString());
    }
}
