package com.ygorevaldt.calculatev2.calculate;

import com.ygorevaldt.calculatev2.calculate.basic.operators.Operator;

import java.util.ArrayList;

public abstract class Calculate {
    protected double result = 0.0;

    public double calculate (Operator operator, ArrayList<Double> numbers) {
        return operator.calculate(numbers);
    }

    public void start () {
        System.out.println("Calculadora Iniciada!!");
    }

    public void finish () {
        System.out.println("Encerrando...");
    }
}
