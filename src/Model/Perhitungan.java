package Model;

import Interface.ContohInterface;

public class Perhitungan implements ContohInterface {
    private int a;
    private int b;
    private int hasil;
    public Perhitungan(int a, int b, int hasil){
        this.a = a;
        this.b = b;
        hasil = 0;
        this.hasil = hasil;
        PrintJudulClass("Print judul dalam method Perhitungan");
    }

    private void PrintJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        //TOOD Auto-generated method stub
        System.out.println("Judul menggunakan interface");

    }

    @Override
    public void HitungTambah() {
        //TOOD Auto-generated method stub
        this.hasil = this.a + this.b;

    }

    @Override
    public void HitungKali() {
        //TOOD Auto-generated method stub
        this.hasil = this.a + this.b;
    }

    public int hsltmbh(int a1, int b2) {
        this.a = a1;
        this.b = b2;
        this.HitungTambah();
        return this.hasil;
    }

    public int hslkli(int _a, int _b){
        this.a = _a;
        this.b = _b;
        this.HitungKali();
        return this.hasil;

    }
}
