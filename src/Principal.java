import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args){
        SympleSanduicheFactory factory = new SympleSanduicheFactory();
        SanduicheStore store = new SanduicheStore(factory);
        
        
        Sanduiche sanduiche;
        
        sanduiche = store.orderSanduiche(JOptionPane.showInputDialog("Digite o nome do sanduiche que deseja: "));
        System.out.println("Registramos o pedido de " + sanduiche.getName() + "\n");
        
        
        sanduiche = store.orderSanduiche(JOptionPane.showInputDialog("Digite o nome do sanduiche que deseja: "));
        System.out.println("Registramos o pedido de " + sanduiche.getName() + "\n");
        
    }
}
