import java.security.cert.CertPathValidatorResult;

public class ListaLigada implements EstruturaDeDados{
    private No inicio;

    public void removeInicio (){
        if (inicio != null)
            inicio = inicio.getProximo();
    }

    public void removeFim (){
        if (inicio == null){
            return;
        }
        if (inicio.getProximo() == null){
            inicio = null;
        }
        removeFim(inicio);
    }

    public void removeFim (No n){
        No proximo = n.getProximo();
        if (proximo.getProximo() == null){
            n.setProximo(null);
            return;
        } else{
            removeFim(proximo);
        }
    }

    public void insereInicio (int valor){
        if(inicio == null){
            inicio = new No(valor);
            return;
        }
        No n = new No(valor);
        n.setProximo(inicio);
        inicio = n;

    }

    public void insereFim (int valor){
        if(inicio == null){
            inicio = new No(valor);
            return;
        }
        insere(inicio, valor);
    }

    public boolean procura (int valor){
        if (inicio == null){
            return false;
        } else {
            return procura(inicio, valor);
        }
    }

    public boolean procura (No n, int valor){
        if (n.getValor() == valor){
            return true;
        } else if (n.getProximo() == null){
            return false;
        } else {
            return procura(n.getProximo(), valor);
        }
    }
    public void insere (No n, int valor){
        if (n.getProximo() == null){
            No novo = new No(valor);
            n.setProximo(novo);
        } else {
            insere(n.getProximo(), valor);
        }
    }

    public void remover(int valor){
        if (inicio == null){
            return;
        }
        if (inicio.getValor() == valor){
            inicio = inicio.getProximo();
            return;
        }
        remover(inicio, valor);
    }

    public void remover(No n, int valor){
        No proximo = n.getProximo();
        if (proximo == null){
            return;
        }
        if (proximo.getValor() == valor){
            n.setProximo(proximo.getProximo());
        } else{
            remover(proximo, valor);
        }
    }

    public static void main(String[] args) {
      
    }

    @Override
    public boolean insert(int chave) {
        if (inicio == null){
            inicio = new No (chave);
            inicio.setProximo(null);
            return true ;
        }
        else { 
            insert2(inicio, chave);
            return true;
            
            
        }
        
    }

    @Override
    public boolean delete(int chave) {
         if (inicio.getValor()==chave){
            inicio=inicio.getProximo();
          return true ;
        }
        else{
            return delete2(inicio, chave);
        }

        
    }

    @Override
    public boolean search (int chave ) {
        if (inicio== null){
            return false;
        }
         else if (inicio.getValor()==chave) { 
             return true;
         }
         else {
            
            return  ProcuraNO(inicio, chave);

         }
         } 

         
    

    @Override
    public int minimum() {
        if (this.inicio==null) {
            return 0;
        }
        else {
            int min= this.inicio.getValor();
            if(inicio.getProximo() == null){
                return min;
            } else {
                return funçaomin(this.inicio,min);
            }
        }
    
    }
    public int funçaomin(No no, int min){
        int menor = min ;
        if (no.getProximo()== null){
            return min;
        }
        if(no.getProximo().getValor()<min){
            menor = no.getProximo().getValor();
        }
        return funçaomin(no.getProximo(), menor);
    }

    @Override
    public int maximum() {
        if (this.inicio==null) {
            return -1;
        }
        else {
            int max= this.inicio.getValor();
            if(inicio.getProximo() == null){
                return max;
            } else {
                return funcaomax(this.inicio,max);
            }
        }
        }
          
    
    public int funcaomax(No no, int max){
        int maior = max;
        if (no.getProximo()== null ) {
            return max;
        }
        if(no.getProximo().getValor()>max){
            maior = no.getProximo().getValor();
        }
        return funcaomax(no.getProximo(),maior);
    }
        
   
        
        
        
        
    

    @Override
    public int sucessor(int chave) {
        if (inicio.getValor() == chave ) {
            return inicio.getProximo().getValor();
        }
     else {
        return sucessor2(inicio,chave);
     }
     

     }
    
    @Override
    public int prodessor(int chave) {
        if ( inicio.getValor()== chave ){
            return -1;
        }
        else {
           return  anterior2(inicio, chave);
        }
        }
    
    public boolean ProcuraNO( No no, int chave){
        if (no.getValor()== chave ) {
            return true ;
        }
        else if (no.getProximo()== null){
            return false;
        
        }
        else {
            return ProcuraNO(no.getProximo(), chave);
        }
        
    } 
    public int sucessor2 (No no, int chave){
        if (no.getValor()== chave ){
            return no.getProximo().getValor();
        }
        else if (no.getProximo().getProximo()==null ){
           
            return 0;
        }
        else {
            return sucessor2(no.getProximo(), chave);
        }
    }
    public int anterior2(No no, int chave ){
        if (no.getProximo().getValor() == chave  ){
            return no.getValor();
            
        }
        else if (no.getProximo()== null){
            return 0;
        }
        else {
            return anterior2(no.getProximo(), chave);
        }
    } public void insert2(No no, int chave){
        if(no.getProximo()==null) {
            No no2= new No(chave );
            no.setProximo(no2);
        }
        else {
            insert2(no.getProximo(), chave);

        }
        
        
    }
    public boolean delete2(No no, int chave ){
        No delete = no.getProximo();
        if(no.getProximo()== null){
            return true;
        }
        else if(no.getProximo().getValor()==chave){
            no.setProximo(delete.getProximo());;
            return true  ;
        }
        else {
            return delete2(no.getProximo(),chave);
        }
    }
 
    }