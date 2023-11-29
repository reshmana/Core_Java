package com.Xwokz.Laptop;

public class Laptop {
        public Laptop() {
            System.out.println("Running no-arg const in laptop using public");
        }
        public void display() {
            System.out.println("Displaying laptop in display using public");
        }

        protected void show(){
            System.out.println("displaying laptop in show using protected");
        }

        void on() {
            System.out.println("Displaying laptop in on using package-default");
        }

         void off() {
            System.out.println("Displaying laptop in off package default");
        }

        private void screen(){
            System.out.println("Displaying laptop in screen using privATE");
        }

    }

