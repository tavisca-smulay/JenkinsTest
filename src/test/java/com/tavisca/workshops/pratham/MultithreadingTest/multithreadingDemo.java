package com.tavisca.workshops.pratham.MultithreadingTest;

import java.util.concurrent.*;

public class multithreadingDemo{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Double> f = service.submit(new AreaOfCircle(4.5));
       Future<Double> f2 = service.submit(new CicumferenceOfCircle(4.5));
        System.out.println("area " + f.get());
        System.out.println("circumference " + f2.get());
        service.shutdown();
    }
}

class AreaOfCircle implements Callable<Double> {

    double radius = 0.0;
    AreaOfCircle(double radius){
        this.radius = radius;
    }

    @Override
    public Double call() throws Exception {
        return Math.PI*radius*radius;
    }
}

class CicumferenceOfCircle implements Callable<Double> {

    double radius = 0.0;
    CicumferenceOfCircle(double d){
        radius = d;
    }

    @Override
    public Double call() {
        return 2* Math.PI*radius;
    }
}


