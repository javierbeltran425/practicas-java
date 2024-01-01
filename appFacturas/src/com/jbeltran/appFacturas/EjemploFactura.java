package com.jbeltran.appFacturas;

import com.jbeltran.appFacturas.models.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNit("99999999-9");
        cliente.setNombre("Andres");

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese una descripción de la factura: ");

        String desc = s.nextLine();

        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 5; i++){
            producto = new Producto();

            System.out.print("Ingrese producto n° " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }

        System.out.println(factura.generarDetalle());
    }
}
