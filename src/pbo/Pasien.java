package pbo;

//class 1
public class Pasien {
    
    //atribut dan encapsulation 2 3
    private String nama;
    private String noregistrasi;

    //constructor 4
    public Pasien(String nama, String noregistrasi) {
        this.nama = nama;
        this.noregistrasi = noregistrasi;
    }

    //mutator(setter) 5
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoregistras(String noregistrasi) {
        this.noregistrasi = noregistrasi;
    }
    
    
    //accessor (getter) 6
    public String getNama() {
        return nama;
    }

    public String getNoregistrasi() {
        return noregistrasi;
    }
    

    public String displayInfo(){
        return "Nama: "+getNama()+
                " \nNoregistrasi: "+getNoregistrasi();
    }


    //polymorphism (overloading) 8   
    public String displayInfo(String ruang) {
        return displayInfo() + "\nRuang: "+ruang;
    }
}
