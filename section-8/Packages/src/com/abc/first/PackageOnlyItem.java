package com.abc.first;

class PackageOnlyItem {
     private String message = "Can I see this?";

     public PackageOnlyItem() {
     }

     @Override
     public String toString() {
         return "PackageOnlyItem{" +
                 "message='" + message + '\'' +
                 '}';
     }
 }
