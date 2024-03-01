package pojos;
// Generated 01-mar-2024 12:26:04 by Hibernate Tools 4.3.1



/**
 * TelefonosId generated by hbm2java
 */
public class TelefonosId  implements java.io.Serializable {


     private int codAlu;
     private String telefono;

    public TelefonosId() {
    }

    public TelefonosId(int codAlu, String telefono) {
       this.codAlu = codAlu;
       this.telefono = telefono;
    }
   
    public int getCodAlu() {
        return this.codAlu;
    }
    
    public void setCodAlu(int codAlu) {
        this.codAlu = codAlu;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TelefonosId) ) return false;
		 TelefonosId castOther = ( TelefonosId ) other; 
         
		 return (this.getCodAlu()==castOther.getCodAlu())
 && ( (this.getTelefono()==castOther.getTelefono()) || ( this.getTelefono()!=null && castOther.getTelefono()!=null && this.getTelefono().equals(castOther.getTelefono()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodAlu();
         result = 37 * result + ( getTelefono() == null ? 0 : this.getTelefono().hashCode() );
         return result;
   }   


}

