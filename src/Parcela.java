public class Parcela {
    
    private Casa casa; 
    private Jardin jardin; 
    private Parque parque; 

    public Parcela(Casa casa, Jardin jardin, Parque parque) {

        int selectorTipoPropiedad = (int) (Math.random() * 100) + 1; 

        if(selectorTipoPropiedad > 0 && selectorTipoPropiedad < 50) {
            casa = new Casa((int) (Math.random() * 3) + 2, false, 0, 1, 1);
            jardin = null; 
            parque = null; 
        } else if (selectorTipoPropiedad > 50 && selectorTipoPropiedad < 85) {
            jardin = new Jardin(); 
            casa = null; 
            parque = null; 
        } else {
            parque = new Parque(); 
            casa = null; 
            jardin = null; 
        }

        // switch (selectorTipoPropiedad) {
        //     case 1: casa = new Casa((int) (Math.random() * 3) + 2, false, 0, 1, 1);
        //     jardin = null; 
        //     parque = null;
        //     break;
            
        //     case 2: parque = new Parque();
        //     casa = null; 
        //     jardin = null;
        //     break; 

        //     case 3: jardin = new Jardin();
        //     casa = null; 
        //     parque = null;
        //     break;

        //     default:
        //         break;
        // }

        this.casa = casa;
        this.jardin = jardin;
        this.parque = parque;
    }


}
