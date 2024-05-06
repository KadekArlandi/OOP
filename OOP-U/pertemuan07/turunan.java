package pertemuan07;

/**
 *
 * @author KADEK ARLANDI MAHESA GAUTAMA PUTRA
 * 2201010241
 * 06-05-2024
 */
public class turunan extends induk{
    
    turunan(){
        super("KADEK ARLANDI MAHESA GAUTAMA PUTRA", 0);
    }
        
    @Override
        public void cetakNama(){
            System.out.println("method cetakNama dari class turunan");
        }
}
