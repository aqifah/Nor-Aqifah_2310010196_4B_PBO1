package pbo;

//inheritance 9
public class PasienDetail extends Pasien {
    //overriding
    public PasienDetail(String nama, String noregistrasi) {
        super(nama, noregistrasi);
    }
    
    public int getTahunMasuk(){
        return Integer.parseInt(getNoregistrasi().substring(0, 2)) + 2000;
    }
    
    public String getRumahSakit(){
        String RumahSakit = getNoregistrasi().substring(2, 4);
        //seleksi if
        if (RumahSakit.equals("10")){
            return "Rumah Sakit Husada";
        } else {
            return "Rumah sakit Ulin";
        }
    }
    
    public String getRujukan(){
        String kodeRujukan = getNoregistrasi().substring(4, 6);
        //Seleksi Switch 10
        switch(kodeRujukan){
            case "01":
                return "Rumah sakit Husada";
            case "02":
                return "Rumah sakit Ulin";
            default:
                return "RS lain";
        }
    }
    
    public int getNoPendaftaran(){
        return Integer.parseInt(getNoregistrasi().substring(6));
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTahun Masuk: "+getTahunMasuk()+
                "\nRumah Sakit: "+getRumahSakit()+
                "\nRujukan: "+getRujukan()+
                "\nNo Pendaftaran: "+getNoPendaftaran();
                
    }
    
    
    
}
