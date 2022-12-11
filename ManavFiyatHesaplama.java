import java.util.Scanner;
public class ManavFiyatHesaplama {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,tutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç kg armut aldığınızı giriniz: ");
        armut = inp.nextDouble() *2.17;

        System.out.print("Kaç kg elma aldığınızı giriniz: ");
        elma = inp.nextDouble() *3.67;

        System.out.print("Kaç kg domates aldığınızı giriniz: ");
        domates = inp.nextDouble() *1.11;

        System.out.print("Kaç kg muz aldığınızı giriniz: ");
        muz = inp.nextDouble() *0.95;

        System.out.print("Kaç kg patlıcan aldığınızı giriniz: ");
        patlican = inp.nextDouble() *5;

        tutar = (armut + elma + domates + muz + patlican);

        System.out.print("Toplam Tutar: " +tutar + " TL");

        //@author Diyar Akdemir

    }
}