

	public class ClasseAutomotores {
	 
	   String corAt;
	   String marcaAt;
	   String modeloAt;
	   String tipoAt;


	    public ClasseAutomotores() {
	    }


	    public ClasseAutomotores(String corPar, String marcaPar, String modeloPar, String tipoPar) {
	        this.corAt = corPar;
	        this.marcaAt = marcaPar;
	        this.modeloAt = modeloPar;
	        this.tipoAt = tipoPar;
	    }

	    
        public String getCorAt() {
            return corAt;
        }

        public String getMarcaAt() {
            return marcaAt;
        }

        public String getModeloAt() {
            return modeloAt;
        }

        public String getTipoAt() {
            return tipoAt;
        }

        public void setCorAt(String corPar) {
            this.corAt = corPar;
        }

        public void setMarcaAt(String marcaAt) {
            this.marcaAt = marcaAt;
        }

        public void setModeloAt(String modeloAt) {
            this.modeloAt = modeloAt;
        }

        public void setTipoAt(String tipoAt) {
            this.tipoAt = tipoAt;
        }
	    }

	  