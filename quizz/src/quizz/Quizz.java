package quizz;
import javax.swing.JOptionPane;
public class Quizz {

    public static void main(String[] args) {
        
        String h ="";
        int cantidadDeIglesias = 0; 
        
        h = JOptionPane.showInputDialog( "Ingrese la cantidad de iglesias");
        cantidadDeIglesias = (int) Double.parseDouble(h);
        iglesias arriglesias[] = new iglesias[cantidadDeIglesias];
        double igle = 0;
        for (int z = 0; z < arriglesias.length; z++) {
            JOptionPane.showMessageDialog(null, "Se soplicitan los datos de la iglesia " + z+1);
            String nombreIglesia = JOptionPane.showInputDialog(null, "Ingrese el nombre de la iglesia");
            String nombreDelPastor = JOptionPane.showInputDialog(null, "Ingrese el nombre del pastor");
            String e ="";
            int cantidadDeFeligreses = 0;
            e = JOptionPane.showInputDialog( "Ingrese la cantidad de feligreses en la iglesia"); 
            cantidadDeFeligreses = (int) Double.parseDouble(e);
            arriglesias[z] = new iglesias(nombreIglesia, nombreDelPastor, cantidadDeFeligreses);
            feligreses arrfeligreses[] = new feligreses[cantidadDeFeligreses];
            
            double diez = 0;
            for (int x = 0; x < arriglesias[z].getCantidadDeFeligreses(); x++) {
                double gananciaDeLaIglesia = 0;
                JOptionPane.showMessageDialog(null, "Se soplicitan los datos de los feligreses" + x);
                String nombreDelFeligres = JOptionPane.showInputDialog(null, "Ingrese el nombre");
                String y ="";
                int id = 0;
                y = JOptionPane.showInputDialog( "Ingrese el id"); 
                id = (int) Double.parseDouble(y);
                String v ="";
                int diezmo = 0;
                v = JOptionPane.showInputDialog( "Ingrese el diezmo"); 
                diezmo = (int) Double.parseDouble(v);
                arrfeligreses[x]=new feligreses(nombreDelFeligres, id, diezmo);
                gananciaDeLaIglesia = gananciaDeLaIglesia + diezmo;
                igle = igle +gananciaDeLaIglesia;
                diez = diez + diezmo; 
                
            }
            
            JOptionPane.showMessageDialog(null, "Las ganancias de la iglesia son de " +igle+ "doalres" + "\n|" + "El monto a pagar a la munincipalidad es de " + igle * 0.09 + "dolares" + "\n" + "El monto para la iglesia es de " + igle * 0.21 + "solares" + "\n" + "La ganancia del pastor es de " +  igle * 0.70 + "dolares");
            
            
        }
    }
    
}
