package interfaces;
import java.time.LocalDate;

public interface interfazEsAlimento {
    public void setCaducidad(LocalDate fc); 
    public LocalDate getCaducidad(); 
    public int getCalorias();
}
