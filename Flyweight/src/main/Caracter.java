package main;

public class Caracter extends CaracterFlyweight {
	
    protected DesenharCaracter imagem;
    
    public Caracter(){
    	imagem = null;
    }
    
    public Caracter(String imagem) {
        this.imagem = new DesenharCaracter(imagem);
    }
 
    @Override
    public void desenharCaracter(Ponto ponto) {
        imagem.desenharCaracter();
        System.out.println("No ponto (" + ponto.x + "," + ponto.y + ")!");
    }
	
}//end_class...

