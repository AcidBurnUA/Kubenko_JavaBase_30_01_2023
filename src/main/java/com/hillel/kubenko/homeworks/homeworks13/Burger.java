package com.hillel.kubenko.homeworks.homeworks13;

public class Burger {
        private boolean bun;
        private boolean meat;
        private boolean cheese;
        private boolean lettuce;
        private boolean mayonnaise;
        public Burger() {
            this.bun = true;
            this.meat = true;
            this.cheese = true;
            this.lettuce = true;
            this.mayonnaise = true;
            System.out.println("Звичайний бургер: булочка, мясо, сир, зелень, майонез");

        }
        public Burger(boolean bun, boolean meat, boolean cheese, boolean lettuce) {
            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.lettuce = lettuce;
            this.mayonnaise = false;
            System.out.println("Діетичний бургер: булочка, мясо, сир, зелень, без майонеза");

        }
        public Burger(boolean bun, boolean meat, boolean cheese, boolean lettuce, boolean mayonnaise) {
            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.lettuce = lettuce;
            this.mayonnaise = mayonnaise;
            System.out.println("Бургер с подвійним мясом: булочка, два куска мяса, сир, зелень, майонез");

        }

    }
