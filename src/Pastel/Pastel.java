
package Pastel;

public class Pastel {
    private final String ingrediente;
    private final String ingrediente2;
    private final String tamaño;
    private final String forma;
    private final String dedicatoria;
    
    private Pastel (PastelBuilder builder){
        this.ingrediente = builder.ingrediente;
        this.ingrediente2 = builder.ingrediente2;
        this.tamaño = builder.tamaño;
        this.forma = builder. forma;
        this.dedicatoria = builder.dedicatoria;
    };

    private static class PastelBuilder {
        private final String ingrediente;
        private final String ingrediente2;
        private String tamaño;
        private String forma;
        private String dedicatoria;
        
        public PastelBuilder(String ingrediente, String ingrediente2){
            this.ingrediente = ingrediente;
            this.ingrediente2 = ingrediente2;
        }
        
        public PastelBuilder tamaño(String tamaño){
            this.tamaño = tamaño;
            return this;
        }
        
        public PastelBuilder forma(String forma){
            this.forma = forma;
            return this;
        }
        
        public PastelBuilder dedicatoria(String dedicatoria){
            this.dedicatoria = dedicatoria;
            return this;
        }
        
        public Pastel build(){
            return new Pastel(this);
        }
        
        public Pastel getPastel(){
            return new
            Pastel.PastelBuilder("fresa","chocolate")
            .build();
        }
    }
}

