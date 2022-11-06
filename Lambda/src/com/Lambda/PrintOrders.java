package com.Lambda;



       import java.util.ArrayList;
        public class PrintOrders {
            /*
            @Override
            public String toString() {
                return "Assignment4Q2{" +
                        "totalPrice=" + totalPrice +
                        ", status='" + status + '\'' +
                        '}';
            }
        */
            public PrintOrders(int totalPrice, String status) {
                this.totalPrice = totalPrice;
                this.status = status;
            }



           public int getTotalPrice() {
                return totalPrice;
            }



           public void setTotalPrice(int totalPrice) {
                this.totalPrice = totalPrice;
            }



           public String getStatus() {
                return status;
            }



           public void setStatus(String status) {
                this.status = status;
            }



           private int totalPrice;
            private String status;
            public static ArrayList<PrintOrders> listOfOrders(ArrayList<PrintOrders> orders) {
                ArrayList<PrintOrders> listOrders = new ArrayList<>();
                for(PrintOrders order:orders){
                    if((order.getStatus().equals("ACCEPTED") || order.getStatus().equals("COMPLETED"))&& order.getTotalPrice()>10000){
                        System.out.println("Inside if");
                        PrintOrders or = new PrintOrders(order.getTotalPrice(),order.getStatus());
                        listOrders.add(or);
                    }
                }



               return listOrders;
            }
            public static void main(String[] args) {
                PrintOrders a1 = new PrintOrders(10101,"ACCEPTED");
                PrintOrders a2 = new PrintOrders(1090,"ACCEPTED");
                PrintOrders a3 = new PrintOrders(10509,"COMPLETED");
                PrintOrders a4 = new PrintOrders(109,"ACCEPTED");
                PrintOrders a5 = new PrintOrders(10002,"ACCEPTED");
                PrintOrders a7 = new PrintOrders(50700,"COMPLETED");
                ArrayList<PrintOrders> list = new ArrayList<>();
                list.add(a1);
                list.add(a2);
                list.add(a3);
                list.add(a4);
                list.add(a5);
                list.add(a7);
                System.out.println(list);
                System.out.println(listOfOrders(list));
            }
    }