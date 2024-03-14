
public class SanduicheStore {

SympleSanduicheFactory factory;

public SanduicheStore(SympleSanduicheFactory factory){
    this.factory = factory;
}
    
public Sanduiche orderSanduiche(String type){
    Sanduiche sanduiche;
    
    sanduiche = factory.createSanduiche(type);
    
    sanduiche.prepare();
    sanduiche.bake();
    sanduiche.cut();
    sanduiche.box();
    return sanduiche;
}

}
