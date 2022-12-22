package com.Mirea2.Work1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Shop {

   private ArrayList<Computer> computers = new ArrayList<Computer>();

   public Shop() {
   }

   public void addComputers(String userName){
      var computer = new Computer(userName);
      computers.add(computer);
   }

   public void delComputers(String userName){
      try {
         computers.remove(findComputer(userName));
         System.out.println("The Computer has been removed");
      }
      catch(Exception e) {
         throw new NoSuchElementException("The shop does not contain an computers with this name");
      }

   }

   public Computer findComputer(String userName)
   throws NoSuchElementException {
      for (var element: computers) {
         if (element.getUserName().equals( userName)) {
            return element;
         }
      }
      throw new NoSuchElementException("The shop does not contain an computers with this name");
   }
}
