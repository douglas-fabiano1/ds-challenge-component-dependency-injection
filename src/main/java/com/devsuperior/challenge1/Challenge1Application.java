package com.devsuperior.challenge1;

import com.devsuperior.challenge1.entities.Order;
import com.devsuperior.challenge1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Challenge1Application implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {

        SpringApplication.run(Challenge1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char answer;
        do {
            System.out.print("Código: ");
            int code = sc.nextInt();
            System.out.print("Valor básico: ");
            double basic = sc.nextDouble();
            System.out.print("Desconto: ");
            double discount = sc.nextDouble();

            Order order = new Order(code, basic, discount);

            System.out.println();
            System.out.println("Pedido código " + order.getCode());
            System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));
            System.out.println();
            System.out.print("Deseja efetuar uma nova consulta(s/n)? ");
            answer = sc.next().charAt(0);
            System.out.println();
        } while (answer == 's');
        System.out.println("Programa encerrado!");
    }
}
