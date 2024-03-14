public class SympleSanduicheFactory {
    
    public Sanduiche createSanduiche(String type){
    Sanduiche sanduiche = null;
    
    if (type.equals("LancheNatural")){
        sanduiche = new LancheNatural();
    }
    else if (type.equals("XSalada")){
        sanduiche = new XSalada();
    }
    else if(type.equals("XEgg")){
        sanduiche = new XEgg();
    }
    else if(type.equals("XBacon")){
        sanduiche = new XBacon();
    }
    return sanduiche;
    }
}
