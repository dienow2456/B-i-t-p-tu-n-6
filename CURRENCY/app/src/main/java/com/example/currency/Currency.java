package com.example.currency;

public class Currency {

        String text;
        double value;

        public Currency(String text, double value) {
            this.text = text;
            this.value = value;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }
        public double getRate(Currency currency){
            return this.value/currency.value;
        }
    }

