/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author Ranestari Sastriani
 */

public class Mahasiswa {
    
    
    private String Nama;
    private String NIM;
    private String Status;
    private char[] Nilai;
    int i;
    
    
    Mahasiswa(){
        this.Status="Tidak Lulus";
        i=0;
        Nilai=new char[10];
    }
    
    Mahasiswa(String NIM,String Nama){
        this.Nama=Nama;
        this.NIM=NIM;
        this.Status="Tidak Lulus";
        i=0;
        Nilai=new char[10];
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getNama() {
        return Nama;
    }

    public String getNIM() {
        return NIM;
    }

    public String getStatus() {
        return Status;
    }
    
    
    public void addNilai(char Nilai){
      
      this.Nilai[i]=Nilai;
      i=i+1;
      
      
    }
    
    public char getNilai(int i){
 
        return this.Nilai[i];
    }
    
    
    @Override
    public String toString(){ 
        return NIM+" "+Nama+" "+Status+" Nilai="+new String (Nilai);
        
    }
    
    public char cekNilai(Mahasiswa m){
        int n=0;
        for (int z = 0; z < Nilai.length; z++) {            
            for (int j = z + 1 ; j < Nilai.length; j++) {
            if (Nilai[z]==Nilai[j]) { 
                n=n+1;
                return Nilai[z];   
            } 
  }
}
  return Nilai[i];     
        }
 }


 
    
    
    
      
