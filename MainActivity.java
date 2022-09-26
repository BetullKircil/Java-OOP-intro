package com.betulkircil.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String name = "";
    int num1 = 6;
    int num2 = 12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("created");
    }
    public String greet(){
        name = "Betul";
        return "Hello " + name;
    }

    public int addNumbers(int number1, int number2){
        return number1 + number2;
    }

    public float divide(int num1, int num2){
        return num1/num2;
    }

    public void makePerson(){
        Person person = new Person("Betul", 20);
        person.setName("Betul");
        System.out.println(person.getName());
    }

    public void createCity(){
        Cities cities = new Cities();
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("started");
        System.out.println("The result of this process: " + addNumbers(3, 4));
        makePerson();
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("resumed");
        System.out.println(greet());
        System.out.println(divide(num1, num2));
        createCity();
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Stopped");
    }

}