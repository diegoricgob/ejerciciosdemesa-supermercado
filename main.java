import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import clases.*;

    public static void main(String[] args) {
        
        detergente detergente1 = new detergente("limpiamas",2.5);
        detergente1.setVolumen(33);
        detergente1.setDescuento(2);
        detergente1.setTipoEnvase("Botella de plástico pequeña");
        
        System.out.println(detergente1);
        
        cereales cereales1 = new cereales("crunchy","Espelta",3);
        cereales1.setCaducidad(LocalDate.of(2022, 8, 2));
        System.out.println("Calorías: "+cereales1.getCalorias());
        
        System.out.println(cereales1);
        
        vino vino1 = new vino("ribera","tinto",12,8);
        vino1.setVolumen(330);
        vino1.setTipoEnvase("botella");
        vino1.setCaducidad(LocalDate.of(2023, 7, 12));
        vino1.setDescuento(5);
        
        System.out.println(vino1);
        
        
        ArrayList<String> lista = new ArrayList<>();
        lista.add(vino1);
        lista.add(cereales1);
        
        int totalcalorias = 0;
        for(String alimento: lista) {
            totalcalorias += alimento.getCalorias();
        }
        
        System.out.println("Total calorias: "+totalcalorias);
        
        
        
        
    }