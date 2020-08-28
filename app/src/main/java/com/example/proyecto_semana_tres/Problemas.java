package com.example.proyecto_semana_tres;

public class Problemas {

    private int Numero;
    private String Respuesta;
    private String Calculo;

    public Problemas (){

        this.Numero = Numero;
        this.Respuesta = Respuesta;
        this.Calculo = Calculo;

        switch (this.Numero){
            case 0:
                this.Calculo = "5x12";
                this.Respuesta = "" + 60;
                break;

            case 1:
                this.Calculo = "7x8";
                this.Respuesta = "" + 56;
                break;

            case 2:
                this.Calculo = "9x12";
                this.Respuesta = "" + 108;
                break;

            case 3:
                this.Calculo = "10+2x5";
                this.Respuesta = "" + 20;
                break;

            case 4:
                this.Calculo = "25+7x5";
                this.Respuesta = "" + 60;
                break;


            case 5:
                this.Calculo = "125x3-225";
                this.Respuesta = "" + 150;
                break;

            case 6:
                this.Calculo = "12x6-38";
                this.Respuesta = "" + 34;
                break;

            case 7:
                this.Calculo = "108/12";
                this.Respuesta = "" + 9;
                break;

            case 8:
                this.Calculo = "360/8";
                this.Respuesta = "" + 45;
                break;

            case 9:
                this.Calculo = "369/3";
                this.Respuesta = "" + 123;
                break;

            case 10:
                this.Calculo = "(6x6)/3";
                this.Respuesta = "" + 12;
                break;

            case 11:
                this.Calculo = "(7x9)/21";
                this.Respuesta = "" + 3;
                break;

            case 12:
                this.Calculo = "(3x15)/5";
                this.Respuesta = "" + 12;
                break;

            case 13:
                this.Calculo = "(32x4)/8";
                this.Respuesta = "" + 16;
                break;

            case 14:
                this.Calculo = "(36/3)/(6x2)";
                this.Respuesta = "" + 1;
                break;

            case 15:
                this.Calculo = "(1200/4)/(6x5)";
                this.Respuesta = "" + 10;
                break;

            case 16:
                this.Calculo = "(350/7)/(5x2)";
                this.Respuesta = "" + 5;
                break;

            case 17:
                this.Calculo = "(726/11)/(3x2)";
                this.Respuesta = "" + 11;
                break;
        }

    }

    public int getNumero() {
        return Numero;
    }

    public String getRespuesta() {
        return Respuesta;
    }

    public String getCalculo(){
        return Calculo;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public void setRespuesta(String respuesta) {
        Respuesta = respuesta;
    }

    public void setCalculo(String calculo) {
        Calculo = calculo;
    }
}