package com.company;

public class Main {

    public static void main(String[] args) {
        Shop sp = new Shop(1003, 553, 223);
        PayOffice po = new PayOffice(457668, 15000, 7000);
        Storage sg = new Storage(250, 500, 16);
        sp.discount();
        System.out.println("Кількість товару в магазині: " +sp.cum());
        sp.number();
        System.out.println("" +sp.priceAll(po));
        System.out.println("________________________________________");
        System.out.println(               "Товарний склад"           );
        System.out.println("Збіліштня складу" +sg.getCapacity());
        sg.discountDemo();
        sg.infoDemo();
        System.out.println("Якісний товар: " +sg.retorDemo());
        System.out.println("Залишок місця на складі: " +sg.remainderDemo());
        System.out.println("________________________________________");
        po.discount();
        po.info();
        System.out.println("Чистий прибуток: " +po.zp(56767676,6456,5645));
        Person person = new Person();
        person.name = "Олег";
        person.surname = "Олегов";
        person.position = "Директор";
        System.out.println(person.position +" - "+person.name+ " "+person.surname);
    }
}
